package com.srm.JavaTrainingQn8;

public class TVMain {

	public static void main(String[] args) {
		TV tele=new TV();
		System.out.println("Call of use() from interface TVRemote: ");
		tele.use();
		System.out.println();
		System.out.println("Call of usage() from interface SmartTVRemote: ");
		tele.usage();
	}

}
