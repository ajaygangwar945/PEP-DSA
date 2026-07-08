package Arrays;

import java.util.Scanner;

public class Odd_Even_Index {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Size: ");
        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int even=0;
        int odd=0;

        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.print(arr[i]*10 + " ");
            }
            else{
                System.out.print(arr[i]*2 + " ");
            }
        }
    }
}
