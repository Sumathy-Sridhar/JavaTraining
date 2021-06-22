package com.srm.training;
import java.util.Scanner;
import java.util.logging.Logger;
public class ElectricityBill {
	static Logger log=Logger.getLogger(Room.class.getName());
	int consumer_no;
	String consumer_name;
	int previous_read;
	int current_read;
	String typeof_connection;
	double bill=0;
	public double UnitCalc(String typeof_connection,int units) {
	 if(typeof_connection.equalsIgnoreCase("domestic")) {
			if(units<=100) {
				bill=bill+(units*1);
			}else if((units>=101) && (units <=200)) {
				bill=bill+(units*2.5);
			}else if ((units>=201)&& (units<=500)) {
				bill=bill+(units*4.0);
			}else if(units>=501) {
				bill=bill+(units*6.0);
			}
		}
	 else  if(typeof_connection.equalsIgnoreCase("commercial")) {
			if(units<=100) {
				bill=bill+(units*2);
			}else if((units>=101) && (units <=200)) {
				bill=bill+(units*4.50);
			}else if ((units>=201)&& (units<=500)) {
				bill=bill+(units*6);
			}else if(units>=501) {
				bill=bill+(units*7);
			}
		}
	 else {
		 log.info("Invalid Connection type");
	 }
	 return bill;
	}
	void display(int consumer_no,String consumer_name,int units,String typeof_connection,double bill) {
	log.info("Consumer Number : " + consumer_no + "Consumer Name: " + consumer_name + "Total Units: "
			+ units +"Connection Type: " + typeof_connection + "Bill Amount : "+ bill);
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	log.info("Enter consumer number: ");
	int cn=sc.nextInt();
	log.info("Enter Consumer name : ");
	String cm=sc.next();
	log.info("Enter Previous Reading: ");
	int pr=sc.nextInt();
	log.info("Enter Current Reading: ");
	int cr=sc.nextInt();
	log.info("Enter Connection Type (Domestic/Commercial): ");
	String ct=sc.next();
	int units=cr-pr;
	log.info("Total Units: "+units);
	ElectricityBill eb=new ElectricityBill();
	double bill=eb.UnitCalc(ct,units);
	eb.display(cr,cm, units, ct,bill);
	sc.close();
	}

}
