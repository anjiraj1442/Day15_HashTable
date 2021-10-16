package com.bridgelabz.hastable;

import java.util.Scanner;

/**
 * @author : Anji Raj Ardula
 * @version :16.0
 * @since :16/10/2021
 */


public class HashTableMain {

    public static void main(String[] args) {
        System.out.println("Welcome to HashTable Program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1");
        switch (scanner.nextInt()) {
            case 1:
                Operations.findFrequency();
                break;
            default:
                System.out.println("Enter right number");
        }
    }

}

