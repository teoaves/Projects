package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ParkingApp {
    public static void main(String[] args) {
        int [] [] arr = {{1012, 1136}, {1317, 1417}, {1015, 1020}, {1012,1}, {1136,0}, {1317,1}, {1417,0},
                {1015,1},{1020,0}};

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        int maxCars = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][1] == 1) {
                count++;
                maxCars = Math.max(maxCars, count);
            } if(arr[i][1]==0) {
                count--;
            }
        }

        System.out.println("Ο μέγιστος αριθμός αυτοκινήτων που είναι σταθμευμένα ταυτόχρονα είναι: " + maxCars);
    }
}



