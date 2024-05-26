package gr.aueb.cf.ch6;

public class ArrErgasia {
    public static void main(String[] args) {
        final int element = 5;
        int[] arr = {1, 2, 3, 4, 5, -6};
        int [] mapp;
        int position = 0;
        int value = 5;
        int i = 0;


        position = findElement(arr, value);
        System.out.printf("position: %d, value %d\n ", position, arr[position]);


        even(arr);

        mapp=map(arr);
        for (int num:mapp)

        System.out.print( num + " " );

        boolean isPositive = positive(arr);
        System.out.println("\n Is positive:" + isPositive);


        boolean allPositive=allpositive(arr);
        System.out.println("\n Is All positive:"  + allPositive);
    }




    public static  int findElement (int [] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;

            }
        }

        return -1;
    }

    public static void even (int [] arr)  {
        for (int i=0; i< arr.length; i++) {
            if (arr[i]%2==0) {
                System.out.print(  arr[i] + " \n");

            }
        }

    }

    public static int [] map(int [] arr) {
        for (int i=0; i< arr.length; i++) {
            arr[i]*=2;

            }
        return arr;

        }




        public static boolean positive(int [] arr) {
        boolean isPositive=false;
        for (int i=0; i< arr.length; i++) {
            if (arr[i]>0) {
                isPositive=true;
                break;
            }
        }
        return isPositive;
    }

    public static boolean allpositive(int [] arr) {
        boolean allPositive = false;
        for(int i=0; i< arr.length; i++) {
            if (arr[i]<0) {
                return false;

            }
        }
        return true;

    }

}
