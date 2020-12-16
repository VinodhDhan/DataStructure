package sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {8,5,2,9,5,6,3};
        quickSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }

    private static void quickSort(int[] arr, int start, int end) {
        if(start>=end)
            return;

        int pivotIdx = start;
        int left = start +1;
        int right = end;

        while(left<=right){

            if(arr[left] > arr[pivotIdx] && arr[right]< arr[pivotIdx]){
                swap(arr, left, right);
            }

            if(arr[left] <= arr[pivotIdx]){
                left++;
            }
            if(arr[right]>= arr[pivotIdx]){
                right--;
            }
        }

        // if left exceeds right, then always right will be smaller than pivot, hence swap pivot and right
        swap(arr,pivotIdx,right);
        boolean isLeftSmaller = right-1-start < end - right+1;
        if(isLeftSmaller){
            quickSort(arr,start,right-1);
            quickSort(arr,right+1,end);
        } else{
            quickSort(arr,right+1,end);
            quickSort(arr,start,right-1);
        }
    }


    public static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
