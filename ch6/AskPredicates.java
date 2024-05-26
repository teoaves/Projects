package gr.aueb.cf.ch6;

import java.util.Scanner;

public class AskPredicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Παρακαλώ εισάγεται 6 ακεραίους από το 1-49");
        int[] numbers = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Αριθμός " + (i + 1) + ": ");
            numbers[i] = in.nextInt();

            if (numbers[i] < 1 || numbers[i] > 49) {
                System.out.println("Οι αριθμοί πρέπει να είναι από το 1 έως το 49. Παρακαλώ προσπαθήστε ξανά.");
                return;
            }
        }
        if (!areOver3ven(numbers)) {
            System.out.println("Υπάρχουν πάνω από 3 άρτιοι.");
        }
        if (!areOver3odds(numbers)) {
            System.out.println("Υπάρχουν πάνω από 3 περιττοί");
        }
        if (!areOver3consecutive(numbers)) {
            System.out.println("Υπάρχουν πάνω από 3 συνεχόμενοι");
        }
        if (areOver3endings(numbers)) {
            System.out.println("Υπάρχουν πάνω από τις 3 με τον ίδιο λήγοντα");
        }
        if(areOver3tenPlace(numbers)) {
            System.out.println("Υπάρχουν πάνω από 3 στην ίδια δεκάδα");
        }
    }


    public static boolean areOver3ven(int[] arr) {
        if (arr == null) return false;

        int count = 0;

        for (int item : arr) {
            if (item % 2 == 0) {
                count++;
            }
        }
        return count <= 3;
    }


    public static boolean areOver3odds(int[] arr) {
        if (arr == null) return false;

        int count = 0;

        for (int item : arr) {
            if (item % 2 != 0) {
                count++;
            }
        }
        return count <= 3;
    }

    public static boolean areOver3consecutive(int[] arr) {
        if (arr == null) return false;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] + 1 == arr[i + 1] && arr[i + 1] + 1 == arr[i + 2]) {
                return false;
            }

        }
        return true;
    }

    public static boolean areOver3endings(int[] arr) {
        if (arr == null) return false;
        int[] endings = new int[10];
        boolean hasSameEndings = false;

        for (int item : arr) {
            endings[item % 10]++;

        }
        for (int item : endings) {
            if (item > 3) {
                hasSameEndings = true;
                break;
            }
        }
        return hasSameEndings;

    }

    public static boolean areOver3tenPlace(int[] arr) {
        if (arr == null) return false;
        int[] endings = new int[10];
        boolean hasSameTenPlace = false;

        for (int item : arr) {
            endings[item / 10]++;

        }
        for (int item : endings) {
            if (item > 3) {
                hasSameTenPlace = true;
                break;
            }
        }
        return hasSameTenPlace;

    }
}










