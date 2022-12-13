package algoritms.array;

import java.util.Arrays;

public class MultiplicationOfPrevAndNext {

    /**
     *  Given an array of integers, update every element with the multiplication of previous and next elements with the following exceptions.
     * a) The First element is replaced the by multiplication the of first and second.
     * b) The last element is replaced by multiplication of the last and second last.
     * Input : arr[]={2,3,4,5,6}
     * Output : arr[] = {6, 8, 15, 24, 30}
     */


    public static void main(String[] args) {

        int[] array = {2, 3, 4, 5, 6};

        System.out.println(Arrays.toString(multiplicationOfPrevAndNext(array)));

    }


    public static int[] multiplicationOfPrevAndNext(int[] arr) {

        int[] arr2 = new int[arr.length];

        arr2[0] = arr[0] * arr[1];

        arr2[arr.length - 1] = arr[arr.length - 1] * arr[arr.length - 2];

        for (int i = 0; i < arr.length; i++) {

            if (i == 0 || i == arr.length - 1) continue;

            arr2[i] = arr[i - 1] * arr[i + 1];

        }

        return arr2;
    }
}
