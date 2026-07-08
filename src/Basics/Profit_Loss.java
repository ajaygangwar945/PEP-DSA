package Basics;

import javax.sound.midi.SysexMessage;
import java.util.*;

public class Profit_Loss {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter CP: ");
        int cp=sc.nextInt();
        System.out.print("Enter SP: ");
        int sp=sc.nextInt();

        if(sp>cp){
            System.out.print("Profit: ");
            int profit=sp-cp;
            System.out.println(profit);
        }
        else if (cp>sp) {
            System.out.print("Loss: ");
            int loss=cp-sp;
            System.out.println(loss);
        }
        else {
            System.out.print("Balanced: ");
            int balanced=sp-cp;
            System.out.println(balanced);
        }

    }
}
