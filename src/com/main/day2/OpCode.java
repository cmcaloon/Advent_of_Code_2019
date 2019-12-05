package com.main.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OpCode {

    static int[] setOpCode() {
        int[] opCode = {1,0,0,3,1,1,2,3,1,3,4,3,1,5,0,3,2,1,10,19,1,6,19,23,2,23,6,27,2,6,27,31,2,13,31,35,1,10,35,39,2,39,13,43,1,43,13,47,1,6,47,51,1,10,51,55,2,55,6,59,1,5,59,63,2,9,63,67,1,6,67,71,2,9,71,75,1,6,75,79,2,79,13,83,1,83,10,87,1,13,87,91,1,91,10,95,2,9,95,99,1,5,99,103,2,10,103,107,1,107,2,111,1,111,5,0,99,2,14,0,0};
        return(opCode);
    }
    static int setNoun() {
        Random rand = new Random();
        int noun = rand.nextInt(100);
        return(noun);
    }

    static int setVerb() {
        Random rand = new Random();
        int verb = rand.nextInt(100);
        return(verb);
    }

    public static List<Integer> opSwitch() {
        int[] opCode = setOpCode();
        opCode[1] = setNoun();
        opCode[2] = setVerb();
        for(int x = 0; x < opCode.length; x = x + 4)
            {
                //System.out.println("X currently is " + x);
                int factor1 = opCode[x+1];
                int factor2 = opCode[x+2];
                int pos = opCode[x+3];
                int newVal;

                switch(opCode[x])
                {
                    case 1:
                        //System.out.println("Case 1 Adding " + opCode[factor1] + " + " + opCode[factor2]);
                        newVal = opCode[factor1] + opCode[factor2];
                        //System.out.println("Saving " + newVal + " to the position " + opCode[pos]);
                        opCode[pos] = newVal;
                        break;
                    case 2:
                        //System.out.println("Case 2 Multiplying " + opCode[factor1] + " * " + opCode[factor2]);
                        newVal = opCode[factor1] * opCode[factor2];
                        //System.out.println("Saving " + newVal + " to the position " + opCode[pos]);
                        opCode[pos] = newVal;
                        break;
                    case 99:
                        //System.out.println("Operation Completed");
                        //System.out.println("Final Value " + opCode[0]);
                        //System.out.println("Noun is " + opCode[1] + " And verb is " + opCode[2]);
                        x = opCode.length;
                        break;
                    default:
                        System.out.println("Invalid opCode found");
                        x = opCode.length;
                        break;
                }

            }
        List<Integer> FinalVal = new ArrayList<>();
        FinalVal.add(opCode[0]);
        FinalVal.add(opCode[1]);
        FinalVal.add(opCode[2]);
        return(FinalVal);
    }
}
