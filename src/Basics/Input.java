package Basics;

import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r=sc.nextDouble();
        double a=3.14*r*r;
        System.out.print("Area of Circle: ");
        System.out.println(a);
    }
}
