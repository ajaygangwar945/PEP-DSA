package Pattern;

import java.util.Scanner;

public class Bridge {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();

//        for(int i=1;i<=2*n-1;i++){
//            System.out.print("* ");
//        }
//        System.out.println();
//
//        int nsp=1;
//        int nst=n-1;
//
//        for(int i=1;i<=n-1;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print("* ");
//            }
//            for(int k=1;k<=nsp;k++){
//                System.out.print("  ");
//            }
//            for(int j=1;j<=n-i;j++){
//                System.out.print("* ");
//            }
//            nsp+=2;
//            System.out.println();
//        }

        for(int i=1;i<=2*n-1;i++){
            System.out.print("* ");
        }
        System.out.println();

        int nsp=1;
        int nst=n-1;

        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=nsp;k++){
                System.out.print("  ");
            }
            for(int m=1;m<=n-i;m++){
                System.out.print("* ");
            }
            System.out.println();
            nsp+=2;

        }








    }
}
