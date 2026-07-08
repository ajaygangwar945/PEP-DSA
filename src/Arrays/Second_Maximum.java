package Arrays;

public class Second_Maximum {
    public static void main(String[] args){
        int[] arr={4,3,10,4,6};

        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }

        System.out.println(smax);
    }
}
