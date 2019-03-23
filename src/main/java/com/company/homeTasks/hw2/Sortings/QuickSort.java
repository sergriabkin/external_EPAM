package com.company.homeTasks.hw2.Sortings;

public class QuickSort {

    public static void sort(int [] numbers){
        int n = numbers.length;
        quicksort(numbers, 0, n-1);
    }

    // Quick sort algorithm
    public static void quicksort(int[] numbers, int low, int high) {

        if (low < high) {
            int dp = partition(numbers, low, high);
            quicksort(numbers, low, dp-1);
            quicksort(numbers, dp+1, high);
        }
    }

    // partition numbers[low] to numbers[high] using numbers[low] as the pivot
    private static int partition(int[] numbers, int low, int high) {
        int pivot = numbers[low];
        int i = low;
        for (int j = low + 1; j <= high; j++)
            if (numbers[j] < pivot) {
                ++i;
                swap(numbers, i, j);
            }
        //end for
        swap(numbers, low, i);
        return i;
    }

    // Exchange list[i] and list[j] values
    private static void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}