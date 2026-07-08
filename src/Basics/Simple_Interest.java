package Basics;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Principal Value: ");
        double p=sc.nextDouble();
        System.out.print("Enter Interest Value: ");
        double i=sc.nextDouble();
        System.out.print("Enter Rate Value: ");
        double r=sc.nextDouble();

        double si;
        si=(p*r*i)/100;

        System.out.print("Simple Interest: ");
        System.out.print(si);

    }
}
