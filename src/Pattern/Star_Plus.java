package Pattern;

import java.util.Scanner;

public class Star_Plus {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();

        if(n%2==0){
            System.out.println("Enter A Odd Number");
        }
        else{
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(j==(n+1)/2 || i==(n+1)/2){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }


    }
}
