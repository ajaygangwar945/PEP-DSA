package Arrays;

public class Search {
    public static void main(String[] args){
        int n=5;
        int[] arr={1,2,3,4,1};

        String s="Not Found";

        for(int i=0;i<5;i++){
            if(arr[i]==5){
                s="Found";
            }
        }

        System.out.println(s);
    }
}
