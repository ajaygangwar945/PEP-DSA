package Pattern;

import java.util.Scanner;

public class Reverse_Triangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n+1-i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n+1-i;j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n+1-i;j++){
//                System.out.print((char)(j+64)+" ");
//            }
//            System.out.println();
//        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }






    }
}
