package Arrays;

public class Two_Sum {
    public static void main(String[] args){
       int[] arr={1,2,3,4,5};
       int target=3;

       System.out.print(twoSum(arr,target));


    }

    public static boolean twoSum(int[] arr, int target) {

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
        }

        return false;
    }
}
