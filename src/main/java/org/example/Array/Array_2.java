package org.example.Array;

import java.util.Scanner;

public class Array_2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size:");
            int size = sc.nextInt();
            int number[] = new int[size];
            System.out.print("Enter the numbers:");
            for(int i = 0;i<size;i++){
                number[i] = sc.nextInt();
            }
            System.out.print("Enter the searching element: ");
            int x = sc.nextInt();
            for(int i = 0; i<number.length;i++){
                if(number[i] ==x ){
                    System.out.println("The index for this x is:  "+i);
                }
            }
        }
    }


