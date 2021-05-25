import java.util.Scanner;

public class LineCompare {

	
public static void main (String args[]) {


	System.out.println("Welcome to Line Comparision Problems");

	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value co-ordinate");
	System.out.println("---------------------------");
	System.out.println("Enter the value of (x1,y1)");
	 int x1= sc.nextInt();
	 int y1= sc.nextInt();
	System.out.println("Enter the Value of (x2,y2)");
	  int x2= sc.nextInt();
	  int y2= sc.nextInt();

	double distanceLine1=Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

	System.out.println("length of line1=" + distanceLine1);


	}

    }



