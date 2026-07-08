package Arrays;

public class Linear_Search {
    public static void main(String[] args){
        int[] arr={12,3,23,234,22,1};
        int x=3;
        boolean flag=false;

        for(int i=0;i<6;i++){
            if(arr[i]==x){
                flag=true;
                break;
            }
        }

        if(flag==true){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }
}
