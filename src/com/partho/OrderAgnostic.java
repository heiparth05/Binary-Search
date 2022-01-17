package com.partho;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr1 = {-5, -1, 0, 4, 6, 9, 12, 15, 21, 23, 28, 31};
        int[] arr2 = {31, 28, 24, 19, 14, 11, 7, 3, 0, -5, -9, -13};
        int target = 0;

        int ans1 = agnostic(arr1, target);
        System.out.println("For ascending order target element is : " + ans1);

        int ans2 = agnostic(arr2, target);
        System.out.println("For descending order target element is : " + ans2);
    }

    static int agnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = (start + ((end - start) / 2));

            if (isAscending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                }
                else if (target < arr[mid]) {
                    end = mid - 1;
                }
                else {
                    return mid;
                }
            }

            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                }
                else if (target < arr[mid]) {
                    start = mid + 1;
                }
                else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
