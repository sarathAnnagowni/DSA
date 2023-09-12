package com.sorting;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high); // Get the pivot index
            quickSort(arr, low, pivotIndex - 1); // Sort the left sub-array
            quickSort(arr, pivotIndex + 1, high); // Sort the right sub-array
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the pivot element (typically the last element)
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j); // Swap arr[i] and arr[j]
            }
        }

        swap(arr, i + 1, high); // Swap arr[i + 1] and pivot (placing pivot in its correct position)
        return i + 1; // Return the index of the pivot element
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 1, 6, 8, 5, 3, 4};
        int n = arr.length;
        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
