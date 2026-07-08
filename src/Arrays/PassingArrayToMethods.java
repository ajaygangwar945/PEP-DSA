package Arrays;

public class PassingArrayToMethods {
    public static void main(String[] args){

        int[] x={10,20,30}; //int[] x is reference value
        System.out.println(x[1]);
        change(x);
        System.out.println(x[1]);
//        int x=10;
//        change(x);
//        System.out.println(x);
    }
    public static void change(int[] x){
        x[1]=100;
//        x=20;
//        System.out.println(x);

    }
}
