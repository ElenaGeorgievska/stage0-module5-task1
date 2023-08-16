package com.epam.mjc.stage0;






/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        String[] array1 = {"Winter", "Spring", "Summer", "Autumn"};

        return array1;
    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        // Random rd = new Random(); // creating Random object
        //int[] arr = new int[10];
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = new int[length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr1[i] = arr[i];
                arr1[i] = length - 1;
            }
            // System.out.println(arr[i]); // printing each array element
        }


//        int[] positiveIntegers = {1};
//        int[] positiveIntegers1 = new int[]{1, 2, 3};
//        int[] positiveIntegers2 = {1, 2, 3, 4, 5};
//
//        return positiveIntegers2;
        return arr1;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        int first = -1;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == number) {
                first = i;
                break;
            }
//            if (number != arr[i])
//                continue;
        }
        System.out.println(first);
        return first;
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        StringBuilder reverse = new StringBuilder();
        for (int i = arr.length; i > 0; i--) {

            reverse.append(arr[i - 1]).append(" ");
            //System.out.println(reverse.append(arr[i-1]).append(" "));
        }
        String[] temp = reverse.toString().split(" ");

        return temp;


//        String[] arr1 = new String[arr.length];
//        for (int i = arr.length - 1; i >= 0; i--) {
//            arr1[i] = arr[i];
//           System.out.println(arr1[i]);
//        }
//        String[] temp = arr1.toString().split(" ");
//        return temp;
    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int count = 0;
        for (int n : arr) {
            if (n > 0) {
                count++;
            }
        }
        int[] nums = new int[count];
        int i = 0;
        for (int n : arr) {
            if (n > 0) {
                nums[i] = n;
                i++;
            }
        }

        return nums;

    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {          // rows = arr.length
            for (int j = 0; j < arr[i].length - 1; j++) {   //columns= arr[i].length
                for (int k = 0; k < arr[i].length - j - 1; k++) {
                   //sorting elements in an one dimensional array in ascending order
                    if (arr[i][k] > arr[i][k + 1]) {
                        int temp = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = temp;
                    }

                    //swapping the rows in an array
//                    int first = arr[j].length;
//                    int second = arr[j + 1].length;
//
//                    if (first > second) {
//                        //Swap arr[j] and arr[j+1]
//
//                        int[] temp2 = arr[j];
//                        arr[j] = arr[j + 1];
//                        arr[j + 1] = temp2;
//                    }

//                        int temp1 = arr[j][k];
//                        arr[j][k] = arr[j+1][k];
//                        arr[j+1][k] = temp1;

                    //  System.out.println(first);
                    // System.out.println(second);
                    //}
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {          // rows = arr.length

            for (int j = 0; j < arr[i].length - 1; j++) {   //columns= arr[i].length

                    int first = arr[j].length;
                    int second = arr[j + 1].length;

                    if (first > second) {

                        int[] temp2 = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp2;
                    }

            }
        }


//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length-i-1; j++) {
//                for (int k = 0; k < arr[i].length - j - 1; k++) {
//                    int first = arr[j].length;
//                    int second = arr[j + 1].length;
//
//                    if (first > second) {
//                        // Swap arr[j] and arr[j+1]
////                        int temp = first;
////                        first = second;
////                        second = temp;
//
//                        int temp1 = arr[j][k];
//                        arr[j][k] = arr[j+1][k];
//                        arr[j+1][k] = temp1;
//
//                      //  System.out.println(first);
//                       // System.out.println(second);
//                    }
//                }
//            }
//        }



        //}
       // System.out.println(Arrays.deepToString(arr));
        return arr;
    }



    public static void main (String[]args){
        ArrayTasks at = new ArrayTasks();
//        at.generateNumbers(5);
        //at.findIndexOfNumber(new int[]{1,2,4,-6,3,6,3,9,90}, 3);
        // at.reverseArray(new String[]{"pineapple", "apple", "pen"});
        //at.getOnlyPositiveNumbers(new int[]{1, 2, 3, 4, -5, -6, -7, 8});


        at.sortRaggedArray(new int[][]{{5, 6, 4, 3, 1}, {2, 6, 5}});   //new int[] {5, 6, 4, 3, 2},{2,6,5})
    }

}