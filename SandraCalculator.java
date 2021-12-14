package com.company;

import java.util.Scanner;

public class SandraCalculator {
    public static void main(String[] args) {

        char operator;
        Double no1,no2,result;

        //Object of Scanner Class
        Scanner insert = new Scanner(System.in);

        System.out.println("Choose The Operator : *, +, -, /");
        operator = insert.next().charAt(0);

        //User Entering first number
        System.out.println("Enter the first NUmber: ");
        no1 = insert.nextDouble();

        //User Entering the Second Number
        System.out.println("Enter the second Number: ");
        no2 = insert.nextDouble();

        //Switch
        switch (operator){

            //multiplication
            case '*':
                result = no1 * no2;
                System.out.println(no1 + "*"+ no2 + "=" + result);
                break;
            case '+':
                result = no1 + no2;
                System.out.println(no1 + "+"+ no2 + "=" + result);
                break;
            case '-':
                result = no1 - no2;
                System.out.println(no1 + "-" + no2 + "=" + result);
                break;
            case '/':
                result = no1 / no2;
                System.out.println(no1 + "/" + no2 + "=" + result);
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
    insert.close();
    }
}
