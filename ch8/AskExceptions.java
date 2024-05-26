package gr.aueb.cf.ch8;

import java.util.Scanner;

public class AskExceptions {


    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = 0;
        printMenu();
        choice = getChoice();


        try {
            printChoice(choice);
            if (choice == 5) {
                System.out.println("thanks for using our app");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Int can only be 1-5");
        }

    }

    public static void printMenu() {
        System.out.println("");
        System.out.println(" Επιλέξτε ένα από τα παρακάτω ");
        System.out.println("1. Μενου");
        System.out.println("2. Ανακοινωσεις");
        System.out.println("3. Πληροφοριες");
        System.out.println("4. Προσωπικό");
        System.out.println("5. Έξοδος από το πρόγραμμα");
    }

    public static int getChoice() {
        while (!in.hasNextInt()) {
            System.out.println("Please insert a valid int");
            in.next(); // Καθαρισμός της μη έγκυρης εισαγωγής
        }

        int choice = in.nextInt();
        in.nextLine();
        return choice;
    }

    public static void printChoice(int choice) throws IllegalArgumentException {

        if (choice < 1 || choice > 5) {

            throw new IllegalArgumentException("Η επιλογή πρέπει να είναι μεταξύ 1 και 5.");
        } else {
            System.out.println("Επιλέξατε: " + choice);


        }
    }
}





