package Arrays;

import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Size: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.print("Input Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Arrays Elements: ");

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        // i=any starting index and j index for end
        int i=0,j=n-1;

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.print("\nReverse Arrays Elements: ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }


    }

}
