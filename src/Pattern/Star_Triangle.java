package Pattern;

import java.util.Scanner;

public class Star_Triangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();

//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if((i+j)>n){
//                    System.out.print("* ");
//                }
//                else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
//        for(int i=1;i<=n;i++){
//            for(int k=1;k<=n-i;k++){ //spacs
//                System.out.print("  ");
//            }
//
//            for(int j=1;j<=i;j++){ // star ka loop
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print("  ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
