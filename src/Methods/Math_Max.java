package Methods;

public class Math_Max {

    public static int max(int a, int b, int c){
        if(a>=b && a>=c){
            return a;
        }
        else if(b>=a && b>=c){
            return b;
        }
        else{
            return c;
        }
    }

    public static void main(String[] args){
//        max(2,3,4); // store value int data as return
        System.out.println(max(2,3,4));
    }
}
