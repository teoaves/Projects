package gr.aueb.cf.ch3;

import java.util.Scanner;

public class menu2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        do {
            System.out.println("Πάτηστε τον αντίστοιχο αριθμό για να επιλέξετε κάτι από τα παρακάτω");
            System.out.println("1 Εισαγωγή");
            System.out.println("2 Αναζήτηση");
            System.out.println("3 Διαγραφή");
            System.out.println("4 Ενημέρωση");
            System.out.println("5 Έξοδος");

            num = in.nextInt();

            if (num == 1) {
                System.out.println("εισαγωγή");
            } else if (num == 2) {
                System.out.println("αναζήτηση");
            } else if (num == 3) {
                System.out.println("διαγραφή");
            } else if (num == 4) {
                System.out.println("ενημέρωση");
            } else if (num == 5) {
                System.out.println("έξοδος");
            } else {
                System.out.println("Λάθος");
            }
        } while (num!=5);
        System.out.println("goodbye");
        }
}
