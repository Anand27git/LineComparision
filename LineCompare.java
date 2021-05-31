import java.util.Scanner;

class LineComparision {
	// declaring the variables
	public int x1, x2, y1, y2;

	public LineComparision(int x1, int x2, int y1, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;

	}

	public double calculateDistanceofLine() {
		// calculating the line distance
		double lineDist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		return lineDist;
	}
}

public class LineCompare {

	public static void lineDiff(double length1, double length2) {
		// using if condition we comparingthe lenghts of the lines are equal or not
		if (length1 < length2) {
			System.out.println("Line 1 is less than Line 2");
		} else if (length1 > length2) {
			System.out.println("Line1 is Greater than Line2");
		} else {
			System.out.println("Both the  Lines are Equal");
		}

	}

	public static void main(String args[]) {

		System.out.println("Welcome to Line Comparision Problems");

		LineComparision line1 = new LineComparision(3, 6, 4, 8);

		double length1 = line1.calculateDistanceofLine();
		System.out.println("Length of Line-1=" + length1);

		LineComparision line2 = new LineComparision(11, 8, 7, 9);

		double length2 = line2.calculateDistanceofLine();
		System.out.println("Length of Line-2=" + length2);

		lineDiff(length1, length2);

	}
}
