package gr.aueb.cf.ch5;

import java.util.Scanner;

public class AskStars {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int choice = 0;
        int num = 0;
        int result ;

        do {
            printMenu();
            choice = getUserChoice();

            if (choice < 1 || choice > 6) {
                System.out.println("Λάθος Επιλογή");
                continue;
            }
            if (choice==6) {
                System.out.println("thanks for using our app");
                break;
            }

            System.out.println("please insert a num");
            num = getOneNumber();
            result = getResult(choice, num);


        } while (true);


    }

    public static void printMenu() {
        System.out.println("");
        System.out.println(" Επιλέξτε ένα από τα παρακάτω ");
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 – n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n – 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
    }

    public static int getUserChoice() {
        return in.nextInt();
    }
    public static int getOneNumber() {
        return in.nextInt();
    }
    public static int getResult(int choice, int num) {


        switch (choice) {
            case 1:
                orizontia(num);
                break;

            case 2:
                katheta(num);
                break;

            case 3:
                ngrames(num);
                break;

            case 4:
                onen(num);
                break;

            case 5:
                none(num);
                break;

        }
        return 0;

    }
           public static void orizontia(int n) {
               for (int i = 0; i < n; i++) {
                   System.out.print("*");
               }
               System.out.println();
           }
           public static void katheta(int n) {
               for (int i = 0; i < n; i++) {
                   System.out.println("*");
               }
               System.out.println();
           }
           public static void ngrames(int n) {
               for (int i = 0; i < n; i++) {
                   orizontia(n);
               }
           }

               public static void onen(int n) {
                   for (int i = 1; i <= n; i++) {
                       {
                           orizontia(i);
                       }
                   }
               }
               public static void none(int n) {
                   for (int i = n; i >= 1; i--) {
                       orizontia(i);
                   }




    }

}
