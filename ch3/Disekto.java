package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Disekto {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = 0;
        System.out.println("Please insert a year:");
        year = in.nextInt();

        boolean disekta = (year%4==0) && (year%100!=0 || year%400==0);

        if ( disekta )
        {
            System.out.println("To etos einai disekto");
        }

        else{
            System.out.println("to etos den einai disekto");
        }





    }
}
