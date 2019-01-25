package com.company;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
	    int myMinValue = -2_147_483_648;
	    int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("My total is " + myTotal);

	    // byte has a width of 8
	    byte myByteValue = -128;
	    byte myNewByteValue = (byte) (myByteValue/2);
		System.out.println("myNewByteValue is " + myNewByteValue);

	    // short has a width of 16
	    short myShortValue = 32767;
	    short myNewShortValue = (short) (myShortValue/2);
		System.out.println("myNewShortValue is " + myNewShortValue);


	    // long has a width of 64
	    long myLongValue = 100L;

	    byte b = 23;
	    short s = 25;
	    int i = 40;
	    long l = 50000L + 10L * (b + s + i);
	    short total = (short) (1000 + 10 * (b + s + i));

		System.out.println("long total is " + l);
		System.out.println("short total is " + total);
    }
}
