package com.okl.data;

public class CallerOne {

    public static void addition(int a, int b) {
	final int c = a + b;
	System.out.println("The sum is " + c);
	final FileCreate fc = new FileCreate();
	fc.fileCreation(c);
	System.out.println("changing");

    }

}
