package Basics;

import java.util.Scanner;

public class Divisible_5_Or_3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n =sc.nextInt();
        if(n%5==0 || n%3==0){
            System.out.println("Divisible by 5 OR 3");
        }
        else{
            System.out.println("Not Divisible by 5 OR 3");
        }
    }
}
