package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Type num1: ");
        int o=12;
        double a = s.nextFloat();
        System.out.print("Type num2: ");
        double b = s.nextFloat();
        double sum=a+b;
        System.out.println("The sum of numbers is: "+sum);
    }
}