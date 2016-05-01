package kpi.lab;


import test.pack.ReadNumbers;

import java.io.IOException;


/**
 * Created by MAN on 20.03.2016.
 */
public class Labs {
    public static void main(String[] args) throws IOException {
        double y;
        double x=2;
        double accuracy;
        System.out.print("Write please the accuracy: ");
        accuracy = ReadNumbers.readDouble("","");
        if(accuracy>0) {
            while (x < 3) {
                y = Math.exp(x * x )/ 2;
                System.out.println(y);
                x = x + accuracy;
            }
        }else{
            System.out.print("Write more then zero value!!!");
        }
    }
}