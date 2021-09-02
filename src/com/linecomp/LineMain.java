package com.linecomp;

import java.util.*;
import java.lang.Math;

class Line {
	int x1,y1,x2,y2;
	double distance;

	public void getCoordinate() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the end point values of line ");
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		x2 = scan.nextInt();
		y2 = scan.nextInt();
	}

	public void calculateDist() {
		distance = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
	}
}


public class LineMain {

	public void compareLine(Double dist1, Double dist2) {
		int comp = dist1.compareTo(dist2);

		if(comp > 0) {
			System.out.println("line1 is greater than line2");
		}
		else if (comp < 0){
			System.out.println("Line2 is greater than line1");
		}
		else{
			System.out.println("Lines are equal");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Problem");

		Line line1 = new Line();
		line1.getCoordinate();
		line1.calculateDist();

		Line line2 = new Line();
		line2.getCoordinate();
		line2.calculateDist();

		System.out.println("The length of Line 1 is:  "+line1.distance);
		System.out.println("The length of Line 2 is:  "+line2.distance);

		LineMain linecomp = new LineMain();
		linecomp.compareLine(line1.distance,line2.distance);
	}

}
