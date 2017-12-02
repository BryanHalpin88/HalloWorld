package Greatings;

import printing.Printer;

public class HelloWorld {

	public static void main(String[] args) {
		Printer myPrinter = new Printer();
		myPrinter.isOn = false;
		myPrinter.modelNumber = "abcd";
				
		Printer yourPrinter = new Printer();
		yourPrinter.isOn = true;
		yourPrinter.modelNumber = "bcda";
	
		String theModelNumber = myPrinter.getModelNumber();
		System.out.println(theModelNumber);

	}

}
