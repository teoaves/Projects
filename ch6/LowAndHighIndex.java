package gr.aueb.cf.ch6;

public class LowAndHighIndex {
    public static void main(String[] args) {
        int [] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int key =8;
        int[] indices = getLowAndHighIndexOf(arr, key);
        System.out.println("Low index: " + indices[0]);
        System.out.println("High index: " + indices[1]);


    }

    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int low = -1;
        int high = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == key) {
                low = i;
                break;
            }
        }
                for ( int j = arr.length -1; j>=0; j--) {
                    if(arr[j]==key) {
                        high=j;
                        break;
                    }
                }
                return new int [] {low,high};

    }


}
