package Loops;

import java.util.Scanner;

public class Even_1_To_100 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Even: ");
        for(int i=1; i<=100; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }

        System.out.println("\n"+"Odd: ");
        for(int i=1; i<=100; i++){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }

    }
}
