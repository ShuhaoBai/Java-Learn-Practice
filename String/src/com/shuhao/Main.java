package com.shuhao;

public class Main {

    public static void main(String[] args) {
	    // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2015";
        System.out.println("myString is equal to " + myString);

        boolean isAlien = false;
        if(isAlien == true)
            System.out.println("It is not an Alien");

        int topScore = 80;
        if(topScore < 100)
            System.out.println("You got the highest score.");

        boolean isCar = false;
        if(isCar == true)
            System.out.println("This is not supposed to happen.");

        isCar = true;
        boolean wasCar = isCar?true:false;
        if(wasCar)
            System.out.println("wasCar is true.");

        double val = 20;
        double secondVal = 80;
        double sum = (val + secondVal) * 25;
        double reminder = sum % 40;
        if(reminder <= 20)
            System.out.println("Total was over the limit.");

    }
}
