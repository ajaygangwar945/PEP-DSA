package Arrays;

public class Seggrate_0_1 {
    public static void main(String[] args){

        int[] arr={1,0,1,0,0,0,1,1,1};

//        int numberZero=0;
//        int numberOne=0;
//
//        for(int ele:arr){
//            if(ele==0){
//                numberZero++;
//            }
//            else{
//                numberOne++;
//            }
//        }
//
//        int index=0;
//
//        for(int i=0;i<numberZero;i++){
//            arr[index++]=0;
//        }
//        for(int i=0;i<numberOne;i++){
//            arr[index++]=1;
//        }

// Two Pointer Technique

        int n=arr.length;
        int left=0;
        int right=n-1;

        while(left<right){
            while(left<right && arr[left]==0){
                left++;
            }
            while(left<right && arr[right]==1){
                right--;
            }

            if(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }



        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
