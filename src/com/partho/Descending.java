package com.partho;

public class Descending {
    public static void main(String[] args) {
        int[] arr = {31, 28, 24, 19, 14, 11, 7, 3, 0, -5, -9};
        int target = 0;
        int ans = binarySearch(arr, target);
        System.out.println("Target element index is : " + ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
