package com.shuhao;

public class Main {
    public static void main (String[] args){

    printMegaBytesAndKiloBytes(2050);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        // int megabytes = kiloBytes % 1024;
        // int remainingkilobytes = kiloBytes - megabytes * 1024;
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + (kiloBytes%1024) + " MB and " + (kiloBytes - 1024*(kiloBytes/1024) + " KB"));
        }
    }
}
