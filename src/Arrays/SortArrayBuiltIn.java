package Arrays;

import java.util.*;

public class SortArrayBuiltIn {
    public static void main(String[] args){
        int[] arr={2,9,7,-3,4,10,2};
        print(arr);
        Arrays.sort(arr);
        System.out.println();
        print(arr);
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
