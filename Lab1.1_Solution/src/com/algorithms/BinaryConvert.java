package com.algorithms;

public class BinaryConvert {
    public static void main(String[] args){
        int number = convertFromBinary("100101");
        System.out.println("Number for binary 100101: " + number);
    }

    public static int convertFromBinary(String binary){
        int conversion = 1;
        int result = 0;
        /*
        for (int i = 1; i <= binary.length(); i++) {
            if (binary.charAt(binary.length() - i) == '1')
                result += conversion;
            conversion *= 2;
        }
        */
        // this could be a preferred solution: decrement from last element
        for (int i = binary.length()-1; i>=0; i-- ){
            System.out.println("i is " + i);
            if (binary.charAt(i) == '1'){
                result += conversion;
            }
            conversion *= 2;
        }
        return result;
    }

}
