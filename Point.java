package com.srm.training;

import java.util.Scanner;
import java.util.logging.Logger;

public class Point {
		static Logger log=Logger.getLogger(Point.class.getName());
		private int x,y;
		
		public Point()
		{
			log.info("Instance created.");
			
		}
		public Point(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
		public void setx(int x)
		{
			this.x=x;
		}
		public void sety(int y)
		{
			this.y=y;
		}
		public void setXY(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
		public void distance(int P1,int P2)
		{
			log.info("Distance calculation ( Between 2 points): "+Math.abs(P1-P2));
		}
		public static void main(String[] args) {
			Point p=new Point();
			Scanner sc=new Scanner(System.in);
			log.info("Enter Point P1: ");
			int p1=sc.nextInt();
			log.info("Enter Point P2: ");
			int p2=sc.nextInt();
			Point pt=new Point(p1,p2);
			p.setx(p1);
			p.sety(p2);
			p.setXY(p1, p2);
			p.distance(p1, p2);
			sc.close();

		}

	}