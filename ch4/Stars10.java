package gr.aueb.cf.ch4;

import java.util.Scanner;

public class Stars10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("please insert a num");

        n = in.nextInt();

        for (int i = 1; i<=n; i++) {


            System.out.print("*");
        }
    }
}
