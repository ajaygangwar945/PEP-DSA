package Loops;

import java.util.Scanner;

public class AP {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
//        for(int i=2; i<=n*3; i+=3) {
//            System.out.print(i + " ");
//        }
        int a=4,d=6;
        for(int i=1; i<=n; i++){
            System.out.print(a+" ");
            a+=d;
        }

    }
}
