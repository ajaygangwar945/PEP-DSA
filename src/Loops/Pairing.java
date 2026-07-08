package Loops;

import java.util.Scanner;

public class Pairing {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println(i);
            System.out.println(n+1-i);

        }

    }
}
