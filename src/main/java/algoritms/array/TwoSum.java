package algoritms.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /**
     * Given an array of integers nums and an integer target, return the two NUMBERS such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     */

    public static int[] twoSum(int[] array, int target) {

        Arrays.sort(array);

        for (int i = 0, j = array.length - 1; i < array.length && j >= 0; ) {

            int tot = array[i] + array[j];

            if (tot == target) return new int[]{array[i], array[j]};

            if (tot > target) j--;

            else i++;
        }

        return new int[]{};
    }

    /**
     * Given an array of integers nums and an integer target, return INDICES of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     */

    public static int[] twoSum2(int[] array, Integer target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {

            if (map.containsKey(target - array[i])) {

                return new int[]{i, map.get(target - array[i])};
            }
            map.put(array[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {


        int[] array = {16, 3, 11, 5, 15};
        int[] array2 = {1, 9, 7, 17, 19, 3, 2, 5, 10};

        System.out.println("returning indices : ");

        System.out.println(Arrays.toString(twoSum2(array, 8))); //   [3,1] (5,3)
        System.out.println(Arrays.toString(twoSum2(array, 26))); //  [4,2] (15,11)
        System.out.println(Arrays.toString(twoSum2(array, 18))); //  [4,1] (15,3)
        System.out.println(Arrays.toString(twoSum2(array2, 11))); // [6,1] (2,9)

        System.out.println("returning numbers : ");

        System.out.println(Arrays.toString(twoSum(array, 8))); //   [3,5]
        System.out.println(Arrays.toString(twoSum(array, 26))); //  [11,15]
        System.out.println(Arrays.toString(twoSum(array, 18))); //  [3,15]
        System.out.println(Arrays.toString(twoSum(array2, 11))); // [1,10]

    }
}
