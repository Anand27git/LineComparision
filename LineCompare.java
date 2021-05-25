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

	 System.out.println("enter the values of next co-ordinates");
		 System.out.println("Enter the value of (x3,y3)");
		int x3 = sc.nextInt(); 
		int y3 = sc.nextInt();
		 System.out.println("Enter the Value of (x4,y4)");
                int x4= sc.nextInt();
                int y4= sc.nextInt();

	 double distanceLine2=Math.sqrt(Math.pow(x4-x3,2) + Math.pow(y4-y3,2));

	System.out.println("length of line1=" + distanceLine1);
	 System.out.println("length of line2=" + distanceLine2);

	if (distanceLine1==distanceLine2)
            {
 		System.out.println("Two Lines are Equal");
	     }
		else {
			System.out.println("Two Lines are not Equal");
		      }
		}
	}



