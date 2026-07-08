package Methods;

public class Pass_By_Value_And_Reference {
    public static void change(int x){
        x=10;
        System.out.println(x);
    }

    public static void main(String[] args){
        int x=6;
        System.out.println(x);
        change(x); // interger ki value ki jati hai pass
        System.out.println(x);
    }
}
