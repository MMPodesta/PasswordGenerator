package com.griffith;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Creates necessary objects
        PassGenerator ps = new PassGenerator();
        Scanner sc = new Scanner(System.in);

        //Get user input
        System.out.println("Welcome to password generator");
        System.out.print("Specify the number of characters:");
        int characterNum = sc.nextInt();

        //Display New generated password
        System.out.println("Your new password is: " + ps.GeneratePassword(characterNum));



    }
}
