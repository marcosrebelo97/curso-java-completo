package aplication;

import java.util.Locale;
import entities.Rectangle;
import java.util.Scanner;

public class ProgramRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println(rectangle);
		System.out.println();
		
		System.out.println(rectangle);
		System.out.println();
		
		System.out.println(rectangle);
		
		sc.close();
		
	}

}
