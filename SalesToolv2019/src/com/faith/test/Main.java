package com.faith.test;

public class Main {

	public static void main(String[] args) {
		
		SalesData objSalesData=new SalesData();
		System.out.println("Welcome to Sales App");
		displayGreeting();
		
		objSalesData.display();
	}
	
	private static void displayGreeting() {
		
		System.out.println("Hi guys! Sales report shows the latest info");
		System.out.println("Test11");
		System.out.println("Test2");
		System.out.println("Test3");
		
	}

}
