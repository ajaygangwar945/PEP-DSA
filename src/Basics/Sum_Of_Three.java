package Basics;

import java.util.Scanner;

public class Sum_Of_Three {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter value of b: ");
        int b=sc.nextInt();
        System.out.print("Enter value of c: ");
        int c=sc.nextInt();
        System.out.print("Sum is: ");
        System.out.println(a+b+c);
    }
}
