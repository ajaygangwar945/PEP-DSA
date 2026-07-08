package Pattern;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        int nsp=n-1;
        int nst=1;

//        for(int i=1;i<=n;i++){
//            for(int k=1;k<=n-i;k++){
//                System.out.print("  ");
//            }
//            for(int j=1;j<=2*i-1;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        for(int i=1;i<=n;i++){
//            for(int k=1;k<=nsp;k++){
//                System.out.print("  ");
//            }
//            for(int j=1;j<=nst;j++){
//                System.out.print("* ");
//            }
//            nsp--;
//            nst+=2;
//            System.out.println();
//        }



        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print("* ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }




    }
}
