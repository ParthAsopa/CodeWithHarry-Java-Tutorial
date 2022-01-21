package com.company;

import java.util.Scanner;

public class Cbse {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Type your marks in subject 1: ");
        double mark1=sc.nextDouble();
        System.out.print("Type your marks in subject 2: ");
        double mark2=sc.nextDouble();
        System.out.print("Type your marks in subject 3: ");
        double mark3=sc.nextDouble();
        System.out.print("Type your marks in subject 4: ");
        double mark4=sc.nextDouble();
        System.out.print("Type your marks in subject 5: ");
        double mark5=sc.nextDouble();
        double percentage = (mark1+mark2+mark3+mark4+mark5)/5;
        System.out.print("\n");
        System.out.println("You have scored "+percentage+"%");
    }
}
