package com.epam;


public class CalcUtil {

    public static double sum(double paramX,double paramY){
        return paramX+paramY;
    }

    public static double mult(double paramX,double paramY){
        return paramX*paramY;
    }

    public static double diff(double paramX,double paramY){
        return paramX-paramY;
    }

    public static double dev(double paramX,double paramY){
        if (paramY==0){
            System.out.println("divided by zero");
            return 0;
        }
        return paramX/paramY;
    }

}
