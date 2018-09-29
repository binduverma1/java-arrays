package com.bindu;


import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        System.out.println("Enter number between 01 to 26: ");
        Scanner input = new java.util.Scanner(System.in);
        String n = input.nextLine();
        //StringBuilder output1 = new StringBuilder();
        String output1 = "";
                   for(int i=0; i<n.length(); i+=2){

                    int pos = Integer.parseInt(n.substring(i, i+2));
                    output1 += letters[pos -1];
                    //output2 = output1.reverse();


                    }
        System.out.println("letters of values added are : " + output1);

        StringBuilder output2 = new StringBuilder(output1);
        output2 = output2.reverse();
        System.out.println("letters of values added are : " + output2);
    }
}



