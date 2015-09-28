package bsu;


import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter X :");
        double paramX = scanner.nextDouble();
        System.out.println("enter operation :");
        String operation = scanner.next();
        System.out.println("enter Y :");
        double paramY = scanner.nextDouble();
        double result = 0;

        switch (operation){
            case "+":
                result = CalcUtil.sum( paramX ,paramY );
                break;
            case "-":
                result = CalcUtil.diff( paramX ,paramY );
                break;
            case "*":
                result = CalcUtil.mult( paramX ,paramY );
                break;
            case "/":
                result = CalcUtil.dev( paramX ,paramY );
                break;

        }

        System.out.println("result: " + result );
        scanner.close();

    }
}




