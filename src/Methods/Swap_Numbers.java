package Methods;

import java.util.Scanner;

public class Swap_Numbers {

    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Swap Numbers: "+a+" "+b);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a=sc.nextInt();
        System.out.print("Enter Number: ");
        int b=sc.nextInt();

        System.out.println("Numbers: "+a+" "+b);
        swap(a,b);


    }
}
