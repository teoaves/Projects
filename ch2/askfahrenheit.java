package gr.aueb.cf.ch2;

import java.util.Scanner;

public class askfahrenheit {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int celsium = 0;
        int fahrenheit = 0;

        System.out.println("Please insert the fahrenheit deegres:");

        fahrenheit = in.nextInt();

        celsium = 5 * (fahrenheit-32) /9;
        System.out.printf("the: %d f, is %d c", fahrenheit, celsium);
    }
}
