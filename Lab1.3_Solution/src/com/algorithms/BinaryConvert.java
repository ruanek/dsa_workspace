package com.algorithms;

import java.security.InvalidParameterException;

public class BinaryConvert {
    public static void main(String[] args){
        int number = convertFromBinary("100101");
        System.out.println("Number for binary 100101: " + number);
        number = convertFromOctal("17");
        System.out.println("Number for octal 17: " + number);
    }

    public static int convertFromBinary(String binary) throws InvalidParameterException{
        int conversion = 1;
        String validBinary = "01";
        int maxLengthToAvoidOverflow = 31;
        System.out.println("Length: " + binary.length());
        if (binary.length()>maxLengthToAvoidOverflow){
            throw new InvalidParameterException("Overflow: " + binary);
        }
        int result = 0;
        /*
        for (int i = 1; i <= binary.length(); i++) {
            if (binary.charAt(binary.length() - i) == '1')
                result += conversion;
            conversion *= 2;
        }
        */
        for (int i = binary.length()-1; i>=0; i-- ){
            Character c = binary.charAt(i);
            if (!validBinary.contains(c.toString())){
                throw new InvalidParameterException(Character.valueOf(c).toString());
            }
            if (binary.charAt(i) == '1'){
                result += conversion;
            }
            conversion *= 2;
        }
        return result;
    }

    public static int convertFromOctal(String octal) throws InvalidParameterException {
        int conversion = 1;
        String validOctal = "01234567";
        long maxDecimalValue = 2147483647L;
        long minDecimalValue = -2147483647L;
        // needs to be long to ensure no int overflow
        long result = 0;

        for (int i = octal.length()-1; i>=0; i-- ){
            System.out.println("i is " + i);
            Character c = octal.charAt(i);
            if (!validOctal.contains(c.toString())){
                throw new InvalidParameterException(Character.valueOf(c).toString());
            }
            int num = Integer.parseInt(Character.toString(octal.charAt(i)));
            result += num*conversion;
            conversion *= 8;
        }
        System.out.println("Result is:" + result);
        if (result>maxDecimalValue || result<minDecimalValue){
            throw new InvalidParameterException("Overflow: " + octal);
        }
        return (int)result;
    }
}
