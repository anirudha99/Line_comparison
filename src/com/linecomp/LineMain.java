package com.linecomp;
import java.util.Scanner;

public class LineMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Problem");
		int x,y,x1,y1;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the end point values : (x,y) & (x1,y1)");
		x=scan.nextInt();
		y=scan.nextInt();
		x1=scan.nextInt();
		y1=scan.nextInt();
		double length = Math.sqrt(((x1-x)*(x1-x))+((y1-y)*(y1-y)));
		System.out.println("The length of the line = "+ length);
		scan.close();

	}

}
