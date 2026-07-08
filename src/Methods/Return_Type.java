package Methods;

public class Return_Type {
    public static int ajay(int a){
        System.out.println("Ajay");
        System.out.println("Gangwar");
        if(a>0){
            return 5;
        }
        else{
            return 10;
        }
        // ek value jo ki ham use kr sakte hai
        // khatam function ki value
    }

    public static void main(String[] args){
        int x=ajay(7);
        System.out.println(3+x);
        ajay(7); // call kiya jo work no return
    }
}
