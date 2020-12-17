package sort;

import java.util.Arrays;

// Time Complexity Best - O(nlogn) |  space - O(nlogn)
//                 Worst - O(nlogn) | space - O(nlogn)
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {8,5,2,9,5,6,3};
        int[] sortArray = mergeSort(arr);
        Arrays.stream(sortArray).forEach(System.out::println);
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length <=1){
            return arr;
        }

        int middleIdx = arr.length / 2;
        int[] leftSubArray = Arrays.copyOfRange(arr, 0, middleIdx);
        int[] rightSubArray = Arrays.copyOfRange(arr, middleIdx, arr.length);
        return mergeSortedArrays(mergeSort(leftSubArray), mergeSort(rightSubArray));
    }

    private static int[] mergeSortedArrays(int[] leftSubArray, int[] rightSubArray) {
        int[] sortedArray = new int[leftSubArray.length+rightSubArray.length];
        int k=0;
        int j=0;
        int i=0;
        while(i < leftSubArray.length && j < rightSubArray.length) {

            if (leftSubArray[i] <= rightSubArray[j]) {
                sortedArray[k++] = leftSubArray[i++];
            } else {
                sortedArray[k++] = rightSubArray[j++];
            }
        }

            while(i<leftSubArray.length){
                sortedArray[k++] = leftSubArray[i++];
            }

            while(j<rightSubArray.length){
                sortedArray[k++] = rightSubArray[j++];
            }

        return sortedArray;
    }
}
