package Arrays;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.print("Enter Elements: ");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        // Sum

//        int EvenSum=0;
//        int OddSum=0;
//
//        for(int i=0;i<n;i++){
//            if(arr[i]%2==0){
//                EvenSum+=arr[i];
//            }
//            else{
//                OddSum+=arr[i];
//            }
//
//        }
//
//        System.out.println("Even Sum: "+EvenSum);
//        System.out.println("Odd Sum: "+OddSum);

        int EvenIndexSum=0;
        int OddIndexSum=0;

        for(int i=0;i<n;i++){
            if(i%2==0){
                EvenIndexSum+=arr[i];
            }
            else{
                OddIndexSum+=arr[i];
            }
        }

        System.out.println("Even Index Sum: "+EvenIndexSum);
        System.out.println("Odd Index Sum: "+OddIndexSum);

    }
}
