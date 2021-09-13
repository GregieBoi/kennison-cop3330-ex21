/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example;

import java.util.Scanner;

public class ex21 {

    // main
    public static void main(String[] args) {

        // print output and pass to get_month for string
        System.out.println("The name of the month is " + get_month(get_month_num()) + ".");
    }

    // gets number of month
    public static int get_month_num() {

        // prompts for input and returns scan
        System.out.print("Please enter the number of the month: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    // gets name of month
    public static String get_month(int month_num) {

        // switch statement using month number returning string of month name or invalid month
        switch (month_num) {
            case 1:
                return "January";
            case 2:
                return  "February";
            case 3:
                return  "March";
            case 4:
                return  "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid month";
        }
    }
}
