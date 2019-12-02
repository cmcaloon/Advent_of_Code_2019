package com.main.day1;

import com.main.day2.OpCode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the day numerically for execution");
        Scanner enterDay = new Scanner(System.in);
        String dayCalc = enterDay.nextLine();

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
            default:
                System.out.println("No Calculations found for the given day");
        }
    }
}
