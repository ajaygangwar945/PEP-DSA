package Basics;

import java.util.Scanner;

public class Greatest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a= sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b= sc.nextInt();
        System.out.print("Enter 3rd Number: ");
        int c= sc.nextInt();

//        if(a>=c){
//            if(a>=b){
//                System.out.println("1st Number is Greatest");
//            }
//            else{
//                System.out.println("2nd Number is Greatest");
//            }
//        }
//        else{
//            if(c>=b){
//                System.out.println("3rd Number is Greatest");
//            }
//            else{
//                System.out.println("2nd Number is Greatest");
//            }
//        }
        if(a>=c && a>=b){
            System.out.println(a);
        }
        else if(b>=a && b>=c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }



    }
}
