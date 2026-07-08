package Methods;

import java.util.Scanner;

public class Permutation_And_Combination {
    public static int fact(int x){
        int f=1;
        for(int i=1;i<=x;i++){
            f*=i;
        }
        return f;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N: ");
        int n=sc.nextInt();
        System.out.print("Enter R: ");
        int r=sc.nextInt();

        int ncr=fact(n)/(fact(r)*fact(n-r));
        System.out.println(ncr);

        int npr=fact(n)/fact(n-r);
        System.out.println(npr);



    }
}
