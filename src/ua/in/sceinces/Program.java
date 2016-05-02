package ua.in.sceinces;

import geek.courses.java.MyMath;
import test.pack.ReadNumbers;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        boolean flag = false;
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        double x1 = 0;
        double x2 = 0;
        System.out.println("Enter the value of the constants of the quadratic equation: A*x^2 + B*x + C = 0");
        /* Reading the number by method ReadDouble in class ReadNumbers at package test.pack*/
        a = ReadNumbers.readDouble("Write the first constant(A) or press \"Enter\" for exit:\nA = ","You do not right write the value please try again!");
        b = ReadNumbers.readDouble("Write the second constant(B) or press \"Enter\" for exit:\nB = ","You do not right write the value please try again!");
        c = ReadNumbers.readDouble("Write the last constant(C) or press \"Enter\" for exit:\nC = ","You do not right write the value please try again!");
        if (a != 0) {
            d = MyMath.discriminant(a,b,c);
            System.out.println("Discriminant D = "+d);
            if (d > 0 | d == 0) {
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Roots of the quadratic equation:");
                System.out.println("x1 = "+x1);
                System.out.println("x2 = "+x2);
            }else {
                System.out.print("The quadratic equation hasn't real roots!");
            }
        }else if(b != 0) {
            x1 = (-c)/b;
            System.out.print("You have only one root, x = "+x1);
        }else if(c != 0){
            System.out.print("The equation is false, it do not have sence.");
        }else{
            System.out.print("It's the identity, it is always right!");
        }
    }
}
