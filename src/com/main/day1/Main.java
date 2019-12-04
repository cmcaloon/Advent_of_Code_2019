package com.main.day1;

import com.main.day2.OpCode;
import com.main.day3.WireMapCross;
import com.main.day4.PasswordCracker;
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
                int findVal = 0;
                while(findVal != 19690720)
                    findVal = OpCode.opSwitch();
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
