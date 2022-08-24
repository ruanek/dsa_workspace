package com.algorithms;

public class BinaryConvert {
    public static void main(String[] args){
        int number = convertFromBinary("100101");
        System.out.println("Number for binary 100101: " + number);
        number = convertFromOctal("17");
        System.out.println("Number for octal 17: " + number);
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
        for (int i = binary.length()-1; i>=0; i-- ){
            System.out.println("i is " + i);
            if (binary.charAt(i) == '1'){
                result += conversion;
            }
            conversion *= 2;
        }
        return result;
    }

    public static int convertFromOctal(String octal) {
        int conversion = 1;
        int result = 0;
        for (int i = octal.length()-1; i>=0; i-- ){
            System.out.println("i is " + i);
            int num = Integer.parseInt(Character.toString(octal.charAt(i)));
            result += num*conversion;
            conversion *= 8;
        }
        return result;
    }
}
