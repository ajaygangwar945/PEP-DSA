package Basics;

import java.util.Scanner;

public class Ternery_Operator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number A: ");
        int a=sc.nextInt();
        System.out.print("Enter Number B: ");
        int b=sc.nextInt();
        System.out.print("Enter Number C: ");
        int c=sc.nextInt();
        int d=((a>b)?((a>c) ? a:c) : ((b>c) ? b:c));
        System.out.println(d);
//        // condition ? sach:jhoot
//        System.out.println(n +" " +((n%2==0) ? "Even" : "Odd"));
//        int a=(n>=0) ? 100:0;
//        System.out.println(a);




    }
}
