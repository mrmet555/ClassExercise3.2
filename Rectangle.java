import java.util.Scanner;


public class Rectangle {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		double width = 0.0;
		double heith = 0.0;
		double perimeter = 0.0;
		double area = 0.0;

		System.out.println("Enter width:");
		width = keyboard.nextDouble();
		System.out.println("Enter height:");
		height = keyboard.nextDouble();
		perimeter = 2*(widht+height);
		area = width*height;

		System.out.prinln("The perimeter of this rectangle is " + perimeter);
		System.out.println("The area of this rectangle is " + area);

	}
}	
