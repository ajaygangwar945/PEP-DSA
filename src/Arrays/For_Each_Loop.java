package Arrays;

public class For_Each_Loop {
    public static void main(String[] args){
        int[] arr={2,3,4,6};
        for(int ele : arr){
            System.out.print(ele+ " ");
        }

        // show values to print elements
        System.out.println();

        for(int ele : arr){
            ele*=2;
            System.out.print(ele+ " ");
        }
    }
}
