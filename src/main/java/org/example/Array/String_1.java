package org.example.Array;

import java.util.Scanner;

public class String_1 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

       /*
        String firstName = sc.next();
        String lastName = sc.next();

        String fullName = firstName+"@"+lastName;
        System.out.println(fullName.length());

        for(int i = 0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }

        */

            // Compare ---->
/*
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        if(name1.compareToIgnoreCase(name2)==0){
            System.out.println("Two Strings are equal ");
        }else {
            System.out.println("Two Strings are not equal ");
        }

 */
            // SubString---->

            String sentence = "My name is Md Sahid Reza ";
            String name = sentence.substring(20);
            System.out.println(name);

        }
    }


