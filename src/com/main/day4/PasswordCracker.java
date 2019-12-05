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
        boolean skipCompare = false;

        for(int x = 1; x < passString.length(); x++){
            char compareChar = passString.charAt(x);
            if (repeatDigit == true && startDigit < compareChar){
                skipCompare = true;
            }

            if (startDigit == compareChar && skipCompare == false){
                if (isMultiple == startDigit){
                    repeatDigit = false;
                }
                else {
                    repeatDigit = true;
                    isMultiple = startDigit;
                }
            }
            else if (startDigit > compareChar){
                increaseDigit = false;
            }
            startDigit = compareChar;
        }
        if (repeatDigit == true && increaseDigit == true){
            //System.out.println("Match found for " + password);
            return(1);
        }

        else {
            return(0);
        }

    }

    public static void PasswordValidation(){
        int curPassVal = START_RANGE;
        int possiblePassword = 0;
        while(curPassVal < END_RANGE){
            possiblePassword = possiblePassword + PasswordBreakdown(curPassVal);
            curPassVal++;

        }
        System.out.println("Final count is " + possiblePassword);
    }
}
