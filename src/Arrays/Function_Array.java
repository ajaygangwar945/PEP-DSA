package Arrays;

import java.util.Scanner;

public class Function_Array {

    public static int largest(int[] arr) {

        int max=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        return max;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Max Element: ");

        System.out.print(largest(arr));


    }
}
