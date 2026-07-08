package Arrays;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        int[] arr=new int[n];

        System.out.print("Enter Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Max Element: ");

        int max=arr[0];

        for(int i=1;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }

        System.out.println(max);

        System.out.print("Min Element: ");

        int min=arr[0];

        for(int i=1;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }

        System.out.print(min);
    }
}
