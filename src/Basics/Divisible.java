package Basics;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n =sc.nextInt();

        if(n%5==0 && n%3==0){
            System.out.println("Divisible By 5 And 3");
        }
        else if(n%5==0){
            System.out.println("Divisible By 5");
        }
        else if(n%3==0){
            System.out.println("Divisible By 3");
        }

        else{
            System.out.println("Not Divisible By 5 Or 3");
        }
    }
}
