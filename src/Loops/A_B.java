package Loops;

import java.util.Scanner;

public class A_B {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a=sc.nextInt();
        System.out.print("Enter Number: ");
        int b=sc.nextInt();
//        int pow=1;
//        for(int i=1;i<=b;i++){
//            pow*=a;
//        }
//        System.out.println(pow);

        int pow=1;
        for(int i=1;i<=b;i++){
            pow*=a;
        }
        System.out.println(pow);


    }
}
