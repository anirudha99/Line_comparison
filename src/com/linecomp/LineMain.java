package com.linecomp;
import java.util.Scanner;

public class LineMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Problem");
		int x1,y1,x2,y2,p1,q1,p2,q2;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the end point values : (x1,y1) & (x2,y2)");
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		x2 = scan.nextInt();
		y2 = scan.nextInt(); 
		System.out.println("Enter the end point values of (p1,q1) and (p2,q2)");
		p1 = scan.nextInt();
		q1 = scan.nextInt();
		p2 = scan.nextInt();
		q2 = scan.nextInt();
		
		double length1 = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		System.out.println("The length of the line1 = "+length1);
		
		double length2 = Math.sqrt(((p2-p1)*(p2-p1))+((q2-q1)*(q2-q1)));
		System.out.println("The length of the line2 = "+length2);
		
		if(length1 == length2)
			System.out.println("The lines are equal");
		else
			System.out.println("The lines are not equal");
		scan.close();

	}

}
