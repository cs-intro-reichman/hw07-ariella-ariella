/** Draws the Koch curve and the the Koch snowflake fractal. */
public class Koch {

	public static void main(String[] args) {

		//// Uncomment the first code block to test the curve function.
		//// Uncomment the second code block to test the snowflake function.
		//// Uncomment only one block in each test, and remember to compile
		//// the class whenever you change the test.

		// Tests the curve function:
		// Gets n, x1, y1, x2, y2,
		// and draws a Koch curve of depth n from (x1,y1) to (x2,y2).
		curve(Integer.parseInt(args[0]),
			  Double.parseDouble(args[1]), Double.parseDouble(args[2]), 
		      Double.parseDouble(args[3]), Double.parseDouble(args[4]));
		

		/*
		// Tests the snowflake function:
		// Gets n, and draws a Koch snowflake of n edges in the standard canvass.
		snowFlake(Integer.parseInt(args[0]));
		*/
	}

	/** Gets n, x1, y1, x2, y2,
     *  and draws a Koch curve of depth n from (x1,y1) to (x2,y2). */
	public static void curve(int n, double x1, double y1, double x2, double y2) {
		if (n == 0) {
			StdDraw.line(x1, y1, x2, y2);
			return;
		}
		double xB = (2 * x1 + x2) / 3.0;
		double yB = (2 * y1 + y2) / 3.0;
	
		double xC = (x1 + 2 * x2) / 3.0;
		double yC = (y1 + 2 * y2) / 3.0;

		double root3Over6 = Math.sqrt(3.0) / 6.0;
		double xE = root3Over6 * (yB - yC) + 0.5 * (xB + xC);
		double yE = root3Over6 * (xC - xB) + 0.5 * (yB + yC);

		curve(n - 1, x1, y1, xB, yB);
		curve(n - 1, xB, yB, xE, yE);
		curve(n - 1, xE, yE, xC, yC);
		curve(n - 1, xC, yC, x2, y2);
	}

    /** Gets n, and draws a Koch snowflake of n edges in the standard canvass. */
	public static void snowFlake(int n) {
		// A little tweak that makes the drawing look better
		StdDraw.setYscale(0, 1.1);
		StdDraw.setXscale(0, 1.1);
		// Draws a Koch snowflake of depth n
		//// Write the rest of your code below.
	}
}
