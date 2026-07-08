package Arrays;

import java.util.Scanner;

public class Prime_Max_Min {

    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static int maxElement(int[] arr){
        int n=arr.length;

        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        return max;
    }

    public static int minElement(int[] arr){
        int n=arr.length;

        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }

        return min;
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Size: ");
        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.print("Elements: ");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Array: ");

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.print("Prime Number: ");

        for(int i=0;i<n;i++){
            if(isPrime(arr[i])){
                System.out.print(arr[i]+" ");
            }
        }

        System.out.println();

        System.out.print("Max Element: ");

        System.out.print(maxElement(arr));

        System.out.println();

        System.out.print("Min Element: ");

        System.out.print(minElement(arr));





    }
}
