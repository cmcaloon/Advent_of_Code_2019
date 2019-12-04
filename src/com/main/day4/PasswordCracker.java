package com.main.day4;

public class PasswordCracker {
    static int START_RANGE = 387638;
    static int END_RANGE = 919123;

    static int PasswordBreakdown(int password){
        String passString = "" + password;
        char startDigit = passString.charAt(0);
        char isMultiple = 'a';
        boolean repeatDigit = false;
        boolean increaseDigit = true;
        boolean multipleRepeatDigit = true;
        for(int x = 1; x < passString.length(); x++){
            char compareChar = passString.charAt(x);
            if (startDigit < compareChar){
                multipleRepeatDigit = true;
            }
            else if (startDigit == compareChar){
                if (isMultiple == startDigit){
                    multipleRepeatDigit = false;
                }
                repeatDigit = true;
                isMultiple = startDigit;
            }
            else if (startDigit > compareChar){
                increaseDigit = false;
            }
            startDigit = compareChar;
        }
        if (repeatDigit == true && increaseDigit == true && multipleRepeatDigit == true){
            System.out.println("Match found for " + password);
            return(1);
        }
        /*
        else if (repeatDigit == false && increaseDigit == true) {
            System.out.println("No repeating characters");
            return (0);
        }
        else if (repeatDigit == true && increaseDigit == false) {
            System.out.println("Decreasing digit found");
            return (0);
        }*/
        else {
            //System.out.println("Not criteria met");
            return(0);
        }

    }

    public static void PasswordValidation(){
        int curPassVal = START_RANGE;
        int possiblePassword = 0;
        while(curPassVal < END_RANGE){
            PasswordBreakdown(curPassVal);
            possiblePassword = possiblePassword + PasswordBreakdown(curPassVal);
            curPassVal++;

        }
        System.out.println("Final count is " + possiblePassword);
    }
}
