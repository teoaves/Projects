package gr.aueb.cf.ch6;

public class MaxandSecondMinApp {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,1,10};
        int maxposition;
        maxposition=findMax(arr, 0,arr.length-1);
        System.out.printf("max value: %d, max position: %d" , arr[maxposition], maxposition);
        int minPosition;
        int minPosition2;

        minPosition=findSecondMin(arr);
        System.out.printf("\nsecond min:%d, secondminpossition: %d" , arr[minPosition], minPosition);
    }


    public static int findMax (int [] arr, int low, int height ) {
        int max = Integer.MIN_VALUE;
        int maxposition=0;

        if((low<0) || height> arr.length-1) {
            System.out.println("error");
            return  -1;
        }

        for (int i=low; i<= height; i++) {
            if(arr[i]>max) {
                max=arr[i];
                maxposition=i;
            }
        }
        return maxposition;
    }



        public static int findSecondMin(int[] arr) {
            int min = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;
            int minPosition = -1;
            int minPosition2 = -1;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min2 = min;
                    min = arr[i];
                    minPosition2 = minPosition;
                    minPosition = i;
                }
                else if (arr[i] < min2 && arr[i] != min) {
                    min2 = arr[i];
                    minPosition2 = i;
                }
            }



            return minPosition2;
        }
    }

