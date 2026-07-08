package Pattern;

import java.util.Scanner;

public class Number_Pattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();


        for(int i=1; i<=n; i++){
            int ch=65;
            for(int j=1; j<=n; j++){
                System.out.print((char)ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
