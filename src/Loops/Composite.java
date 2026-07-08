package Loops;

import java.util.Scanner;

public class Composite {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
//        int x=0;
//        for(int i=2; i<=n-1; i++){
//            if(n%i==0){
//                x=1;
//                break;
//            }
//
//        }
//
//        if(x==1){
//            System.out.println("Composite Number");
//        }
//        else{
//            System.out.println("Prime Number");
//        }

//        boolean flag=true;
//        for(int i=2; i<=Math.sqrt(n); i++){
//            if(n%i==0){
//                flag=false;
//                break;
//            }
//        }
//
//        if(n==1){
//            System.out.println("Neither Prime Nor Composite");
//        }
//        else if(flag==false){
//            System.out.println("Composite Number");
//        }
//        else{
//            System.out.println("Prime Number");
//        }

//        boolean flag=true;
//        for(int i=2;i<=Math.sqrt(n);i++){
//            if(n%i==0){
//                flag=false;
//                break;
//            }
//        }
//
//        if(n==1){
//            System.out.println("Neither Prime Nor Composite");
//        }
//        else if (flag==false) {
//            System.out.println("Composite Number");
//        }
//        else{
//            System.out.println("Prime Number");
//        }



        boolean flag=true;

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }

        if(n==1){
            System.out.println("Nothing");
        }
        else if (flag==false){
            System.out.println("Composite Number");
        }
        else{
            System.out.println("Prime Number");
        }


    }
}
