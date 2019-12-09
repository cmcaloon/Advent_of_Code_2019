package com.main.day1;

import com.main.day2.OpCode;
import com.main.day3.WireMapCross;
import com.main.day4.PasswordCracker;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the day numerically for execution");
        Scanner enterDay = new Scanner(System.in);
        String dayCalc = enterDay.nextLine();
        long startTime = System.currentTimeMillis();

        switch(dayCalc)
        {
            case "1":
                FuelCounter.counterUpper();
                break;
            case "2":
                List<Integer> finalValues = OpCode.opSwitch();
                int findVal = finalValues.get(0);
                while(findVal != 19690720) {
                    finalValues = OpCode.opSwitch();
                    findVal = finalValues.get(0);
                }
                System.out.println("Final Noun " + finalValues.get(1) + " Final Verb " + finalValues.get(2));
                break;
            case "3":
                WireMapCross.generateGrid();
                break;
            case "3":
                WireMapCross.generateGrid();
                break;
            case "4":
                PasswordCracker.PasswordValidation();
                break;
            default:
                System.out.println("No Calculations found for the given day");
        }
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
}
