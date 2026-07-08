package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProgram {
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(25);
        arr.add(18);
        arr.add(5);
        arr.add(10);
        arr.add(20);
        int n=arr.size();

        System.out.println(arr.get(2)); // to access

        arr.set(3,50); //arr[3]=50
        arr.add(1,100);
        arr.remove(n-1);


        System.out.println(arr);
        // print
        Collections.reverse(arr);
        System.out.println(arr);
        int i=0,j=arr.size()-1;
        while(i<j){
            int temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;

        }


//        for(int i=0;i<n;i++){
//            System.out.print(arr.get(i)+" ");
//        }
    }
}
