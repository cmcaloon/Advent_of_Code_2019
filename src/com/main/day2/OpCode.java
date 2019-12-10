package com.main.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class OpCode {

    /*int[] setOpCodeDay2() {
        int[] opCode = {1,0,0,3,1,1,2,3,1,3,4,3,1,5,0,3,2,1,10,19,1,6,19,23,2,23,6,27,2,6,27,31,2,13,31,35,1,10,35,39,2,39,13,43,1,43,13,47,1,6,47,51,1,10,51,55,2,55,6,59,1,5,59,63,2,9,63,67,1,6,67,71,2,9,71,75,1,6,75,79,2,79,13,83,1,83,10,87,1,13,87,91,1,91,10,95,2,9,95,99,1,5,99,103,2,10,103,107,1,107,2,111,1,111,5,0,99,2,14,0,0};
        return(opCode);
    }

    int[] setOpCodeDay5(){
        int[] opCode = {3,225,1,225,6,6,1100,1,238,225,104,0,2,136,183,224,101,-5304,224,224,4,224,1002,223,8,223,1001,224,6,224,1,224,223,223,1101,72,47,225,1101,59,55,225,1101,46,75,225,1101,49,15,224,101,-64,224,224,4,224,1002,223,8,223,1001,224,5,224,1,224,223,223,102,9,210,224,1001,224,-270,224,4,224,1002,223,8,223,1001,224,2,224,1,223,224,223,101,14,35,224,101,-86,224,224,4,224,1002,223,8,223,101,4,224,224,1,224,223,223,1102,40,74,224,1001,224,-2960,224,4,224,1002,223,8,223,101,5,224,224,1,224,223,223,1101,10,78,225,1001,39,90,224,1001,224,-149,224,4,224,102,8,223,223,1001,224,4,224,1,223,224,223,1002,217,50,224,1001,224,-1650,224,4,224,1002,223,8,223,1001,224,7,224,1,224,223,223,1102,68,8,225,1,43,214,224,1001,224,-126,224,4,224,102,8,223,223,101,3,224,224,1,224,223,223,1102,88,30,225,1102,18,80,225,1102,33,28,225,4,223,99,0,0,0,677,0,0,0,0,0,0,0,0,0,0,0,1105,0,99999,1105,227,247,1105,1,99999,1005,227,99999,1005,0,256,1105,1,99999,1106,227,99999,1106,0,265,1105,1,99999,1006,0,99999,1006,227,274,1105,1,99999,1105,1,280,1105,1,99999,1,225,225,225,1101,294,0,0,105,1,0,1105,1,99999,1106,0,300,1105,1,99999,1,225,225,225,1101,314,0,0,106,0,0,1105,1,99999,108,677,677,224,102,2,223,223,1005,224,329,1001,223,1,223,1107,677,226,224,102,2,223,223,1006,224,344,1001,223,1,223,108,226,226,224,102,2,223,223,1005,224,359,1001,223,1,223,1108,677,226,224,102,2,223,223,1006,224,374,101,1,223,223,108,677,226,224,102,2,223,223,1006,224,389,1001,223,1,223,107,226,226,224,102,2,223,223,1005,224,404,1001,223,1,223,8,226,226,224,102,2,223,223,1006,224,419,101,1,223,223,1107,677,677,224,102,2,223,223,1006,224,434,1001,223,1,223,1107,226,677,224,1002,223,2,223,1006,224,449,101,1,223,223,7,677,677,224,1002,223,2,223,1006,224,464,1001,223,1,223,1108,226,677,224,1002,223,2,223,1005,224,479,1001,223,1,223,8,677,226,224,1002,223,2,223,1005,224,494,101,1,223,223,7,226,677,224,102,2,223,223,1005,224,509,101,1,223,223,1008,677,226,224,102,2,223,223,1006,224,524,101,1,223,223,8,226,677,224,1002,223,2,223,1006,224,539,1001,223,1,223,1007,677,677,224,102,2,223,223,1005,224,554,101,1,223,223,107,226,677,224,1002,223,2,223,1005,224,569,1001,223,1,223,1108,677,677,224,1002,223,2,223,1006,224,584,1001,223,1,223,1008,226,226,224,1002,223,2,223,1005,224,599,101,1,223,223,1008,677,677,224,102,2,223,223,1005,224,614,101,1,223,223,7,677,226,224,1002,223,2,223,1005,224,629,1001,223,1,223,107,677,677,224,1002,223,2,223,1006,224,644,101,1,223,223,1007,226,677,224,1002,223,2,223,1005,224,659,1001,223,1,223,1007,226,226,224,102,2,223,223,1005,224,674,101,1,223,223,4,223,99,226};
        return(opCode);
    }
    */
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

    static int FindOpCode(int fullOpVal){
        String parseString = "" + fullOpVal;
        int lastPos = parseString.length() - 1;
        String opVal;
        if(parseString.length() >= 2) {
            opVal = parseString.substring(lastPos - 1);
        }
        else opVal = parseString.substring(lastPos);
        int opCodeVal = Integer.parseInt(opVal);
        return(opCodeVal);
    }
    static int ReplaceChar(char paramVal){
        int actualParam = 0;
        if (paramVal == '1')
            actualParam = 1;
        else if (paramVal == '0') {

        }
        else System.out.println("Wrong value passed");
        return(actualParam);
    }

    static int FindParam(int fullOpVal, int position) {
        String parseString = "" + fullOpVal;
        int paramValue = 2;
        if (parseString.length() <= 2) {
            paramValue = 0;
        } else if (parseString.length() <= 3) {
            if (position > 1)
                paramValue = 0;
            else if (position == 1){
                paramValue = ReplaceChar(parseString.charAt(0));
            } else System.out.println("Wrong Value Given");
        } else if (parseString.length() <= 4) {
            if (position > 2) {
                paramValue = 0;
            } else if (position == 2) {
                paramValue = ReplaceChar(parseString.charAt(0));
            } else if (position == 1) {
                paramValue = ReplaceChar(parseString.charAt(1));
            } else System.out.println("Wrong Value Given");
        } else if (parseString.length() == 5) {
            if (position == 3) {
                paramValue = ReplaceChar(parseString.charAt(0));
            } else if (position == 2) {
                paramValue = ReplaceChar(parseString.charAt(1));
            } else if (position == 1) {
                paramValue = ReplaceChar(parseString.charAt(2));
            } else System.out.println("Wrong Value Given");
        } else {
            System.out.println("Value to large");
        }
        return (paramValue);
    }

    static int FindFactor(int currentInstruction, int opParam, int position, HashMap<Integer, Integer> opCode){
        int immediateParam = FindParam(currentInstruction, position);
        //System.out.println("ImmediateParam " + immediateParam);
        int currentFactor = -1;
        if (immediateParam == 1){
            currentFactor = opParam;
        }
        else if (immediateParam == 0){
            currentFactor = opCode.get(opParam);

        }
        else System.out.println("No Valid Factors");
        return(currentFactor);
    }

    public static HashMap<Integer, Integer> opSwitch(HashMap<Integer, Integer> opCode, int instructionLoc, int maxSet) {
                int currentInstruction = opCode.get(instructionLoc);
                int opCodeData = FindOpCode(currentInstruction);
                int factor1;
                int factor2;

                int pos = opCode.get(instructionLoc+3);
                int newVal;
                //System.out.println("Current instruction " + opCode[instructionLoc]);
                switch(opCodeData)
                {
                    case 1:
                        factor1 = FindFactor(currentInstruction, opCode.get(instructionLoc+1), 1, opCode);
                        factor2 = FindFactor(currentInstruction, opCode.get(instructionLoc+2), 2, opCode);
                        newVal = factor1 + factor2;
                        //System.out.println("Adding " + factor1 + " and " + factor2);
                        //System.out.println("Output = " + newVal);
                        opCode.put(pos, newVal);
                        //System.out.println("At position " + pos + " saving value -- " + opCode.get(pos));

                        //instructionLoc = instructionLoc + 4;
                        break;
                    case 2:
                        factor1 = FindFactor(currentInstruction, opCode.get(instructionLoc+1), 1, opCode);
                        factor2 = FindFactor(currentInstruction, opCode.get(instructionLoc+2), 2, opCode);
                        newVal = factor1 * factor2;
                        //System.out.println("Multiplying " + factor1 + " and " + factor2);
                       // System.out.println("Output = " + newVal);
                        opCode.put(pos, newVal);
                        //System.out.println("At position " + pos + " saving value -- " + opCode.get(pos));


                        break;
                    case 3:
                        //Day 5
                        //factor1 = FindFactor(currentInstruction, opCode[instructionLoc+1], 1, opCode);
                        System.out.println(opCode.get(instructionLoc+1) + " Change Op Code factor 1 ");
                        int newPos = opCode.get(instructionLoc+1);
                        opCode.put(newPos, 1);
                        //instructionLoc = instructionLoc + 2;
                        break;
                    case 4:
                        //Day 5
                        factor1 = FindFactor(currentInstruction, opCode.get(instructionLoc+1), 1, opCode);
                        //int output = opCode.get(factor1);
                        System.out.println(factor1);
                        //instructionLoc = instructionLoc+2;
                        break;
                    case 99:
                        //System.out.println("Operation Completed");
                        //System.out.println("Final Value " + opCode[0]);
                        //System.out.println("Noun is " + opCode[1] + " And verb is " + opCode[2]);
                        //instructionLoc = maxSet;
                        break;
                    default:
                        System.out.println("Invalid opCode found");
                        //instructionLoc = maxSet;
                        break;
                }
                return(opCode);
        }
    public static List<Integer> CalcOpCode(String day) {
        day = day.toUpperCase();
        HashMap<Integer, Integer> opCode = new HashMap<>();
        int [] opCodeInt = new int[0];
        if (day.equals("DAY2")){
            opCodeInt = new int[] {1, 0, 0, 3, 1, 1, 2, 3, 1, 3, 4, 3, 1, 5, 0, 3, 2, 1, 10, 19, 1, 6, 19, 23, 2, 23, 6, 27, 2, 6, 27, 31, 2, 13, 31, 35, 1, 10, 35, 39, 2, 39, 13, 43, 1, 43, 13, 47, 1, 6, 47, 51, 1, 10, 51, 55, 2, 55, 6, 59, 1, 5, 59, 63, 2, 9, 63, 67, 1, 6, 67, 71, 2, 9, 71, 75, 1, 6, 75, 79, 2, 79, 13, 83, 1, 83, 10, 87, 1, 13, 87, 91, 1, 91, 10, 95, 2, 9, 95, 99, 1, 5, 99, 103, 2, 10, 103, 107, 1, 107, 2, 111, 1, 111, 5, 0, 99, 2, 14, 0, 0};

            opCodeInt[1] = setNoun();
            opCodeInt[2] = setVerb();
        }
        else if (day.equals("DAY5")){
            opCodeInt = new int[] {3, 225, 1, 225, 6, 6, 1100, 1, 238, 225, 104, 0, 2, 136, 183, 224, 101, -5304, 224, 224, 4, 224, 1002, 223, 8, 223, 1001, 224, 6, 224, 1, 224, 223, 223, 1101, 72, 47, 225, 1101, 59, 55, 225, 1101, 46, 75, 225, 1101, 49, 15, 224, 101, -64, 224, 224, 4, 224, 1002, 223, 8, 223, 1001, 224, 5, 224, 1, 224, 223, 223, 102, 9, 210, 224, 1001, 224, -270, 224, 4, 224, 1002, 223, 8, 223, 1001, 224, 2, 224, 1, 223, 224, 223, 101, 14, 35, 224, 101, -86, 224, 224, 4, 224, 1002, 223, 8, 223, 101, 4, 224, 224, 1, 224, 223, 223, 1102, 40, 74, 224, 1001, 224, -2960, 224, 4, 224, 1002, 223, 8, 223, 101, 5, 224, 224, 1, 224, 223, 223, 1101, 10, 78, 225, 1001, 39, 90, 224, 1001, 224, -149, 224, 4, 224, 102, 8, 223, 223, 1001, 224, 4, 224, 1, 223, 224, 223, 1002, 217, 50, 224, 1001, 224, -1650, 224, 4, 224, 1002, 223, 8, 223, 1001, 224, 7, 224, 1, 224, 223, 223, 1102, 68, 8, 225, 1, 43, 214, 224, 1001, 224, -126, 224, 4, 224, 102, 8, 223, 223, 101, 3, 224, 224, 1, 224, 223, 223, 1102, 88, 30, 225, 1102, 18, 80, 225, 1102, 33, 28, 225, 4, 223, 99, 0, 0, 0, 677, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1105, 0, 99999, 1105, 227, 247, 1105, 1, 99999, 1005, 227, 99999, 1005, 0, 256, 1105, 1, 99999, 1106, 227, 99999, 1106, 0, 265, 1105, 1, 99999, 1006, 0, 99999, 1006, 227, 274, 1105, 1, 99999, 1105, 1, 280, 1105, 1, 99999, 1, 225, 225, 225, 1101, 294, 0, 0, 105, 1, 0, 1105, 1, 99999, 1106, 0, 300, 1105, 1, 99999, 1, 225, 225, 225, 1101, 314, 0, 0, 106, 0, 0, 1105, 1, 99999, 108, 677, 677, 224, 102, 2, 223, 223, 1005, 224, 329, 1001, 223, 1, 223, 1107, 677, 226, 224, 102, 2, 223, 223, 1006, 224, 344, 1001, 223, 1, 223, 108, 226, 226, 224, 102, 2, 223, 223, 1005, 224, 359, 1001, 223, 1, 223, 1108, 677, 226, 224, 102, 2, 223, 223, 1006, 224, 374, 101, 1, 223, 223, 108, 677, 226, 224, 102, 2, 223, 223, 1006, 224, 389, 1001, 223, 1, 223, 107, 226, 226, 224, 102, 2, 223, 223, 1005, 224, 404, 1001, 223, 1, 223, 8, 226, 226, 224, 102, 2, 223, 223, 1006, 224, 419, 101, 1, 223, 223, 1107, 677, 677, 224, 102, 2, 223, 223, 1006, 224, 434, 1001, 223, 1, 223, 1107, 226, 677, 224, 1002, 223, 2, 223, 1006, 224, 449, 101, 1, 223, 223, 7, 677, 677, 224, 1002, 223, 2, 223, 1006, 224, 464, 1001, 223, 1, 223, 1108, 226, 677, 224, 1002, 223, 2, 223, 1005, 224, 479, 1001, 223, 1, 223, 8, 677, 226, 224, 1002, 223, 2, 223, 1005, 224, 494, 101, 1, 223, 223, 7, 226, 677, 224, 102, 2, 223, 223, 1005, 224, 509, 101, 1, 223, 223, 1008, 677, 226, 224, 102, 2, 223, 223, 1006, 224, 524, 101, 1, 223, 223, 8, 226, 677, 224, 1002, 223, 2, 223, 1006, 224, 539, 1001, 223, 1, 223, 1007, 677, 677, 224, 102, 2, 223, 223, 1005, 224, 554, 101, 1, 223, 223, 107, 226, 677, 224, 1002, 223, 2, 223, 1005, 224, 569, 1001, 223, 1, 223, 1108, 677, 677, 224, 1002, 223, 2, 223, 1006, 224, 584, 1001, 223, 1, 223, 1008, 226, 226, 224, 1002, 223, 2, 223, 1005, 224, 599, 101, 1, 223, 223, 1008, 677, 677, 224, 102, 2, 223, 223, 1005, 224, 614, 101, 1, 223, 223, 7, 677, 226, 224, 1002, 223, 2, 223, 1005, 224, 629, 1001, 223, 1, 223, 107, 677, 677, 224, 1002, 223, 2, 223, 1006, 224, 644, 101, 1, 223, 223, 1007, 226, 677, 224, 1002, 223, 2, 223, 1005, 224, 659, 1001, 223, 1, 223, 1007, 226, 226, 224, 102, 2, 223, 223, 1005, 224, 674, 101, 1, 223, 223, 4, 223, 99, 226};
            //opCode[225] = 1;
        }
        int maxSet = opCodeInt.length;
        for(int x = 0;  x < maxSet; x++)
            opCode.put(x , opCodeInt[x]);

        int instructionLoc = 0;
        while(instructionLoc < maxSet) {
            opCode = opSwitch(opCode, instructionLoc, maxSet);
            if(FindOpCode(opCode.get(instructionLoc)) == 1 || FindOpCode(opCode.get(instructionLoc)) == 2)
                instructionLoc = instructionLoc + 4;
            else if (FindOpCode(opCode.get(instructionLoc)) == 3 || FindOpCode(opCode.get(instructionLoc)) == 4)
                instructionLoc = instructionLoc + 2;
            else if  (FindOpCode(opCode.get(instructionLoc)) == 99)
                instructionLoc = maxSet;
            else instructionLoc++;
            //System.out.println("Loop " + instructionLoc);
        }


        List<Integer> FinalVal = new ArrayList<>();
        FinalVal.add(opCode.get(0));
        FinalVal.add(opCode.get(1));
        FinalVal.add(opCode.get(2));
        return(FinalVal);
    }
}
