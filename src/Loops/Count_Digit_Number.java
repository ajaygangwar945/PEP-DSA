package Loops;

import java.util.Scanner;

public class Count_Digit_Number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        if(n==0){
            n=6;
        }
        int count=0;

        while(n!=0){
            n=n/10;
            count++;
        }

//        for(;n!=0;n=n/10){
//            count++;
//        }

        System.out.println(count);

    }
}
