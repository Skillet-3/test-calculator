package com.epam;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args ){

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter X :");
        double paramX = scanner.nextDouble();
        System.out.println("enter operation :");
        String operation = scanner.next();
        System.out.println("enter Y :");
        double paramY = scanner.nextDouble();
        double result = 0;

        if (operation.equals("+")) {
            result = CalcUtil.sum(paramX, paramY);

        } else if (operation.equals("-")) {
            result = CalcUtil.diff(paramX, paramY);

        } else if (operation.equals("*")) {
            result = CalcUtil.mult(paramX, paramY);

        } else if (operation.equals("/")) {
            result = CalcUtil.dev(paramX, paramY);

        }

        System.out.println("result: " + result );
        scanner.close();

    }
}


