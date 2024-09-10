package org.example;

public class HeapSort {
    public static void sort(int[] arr) {
        int length = arr.length;

        for (int i = length / 2 - 1; i >= 0; i--) {
            heapify(arr, length, i);
        }

        for (int i = length - 1; i > 0; i--) {
            swap(arr, i, 0);

            heapify(arr, i, 0);

        }
    }


    public static void heapify(int[] arr, int length, int i) {
        int largest = i;
        int left = i * 2 + 1;
        int right = i * 2 + 2;

        if (left < length && arr[largest] < arr[left]) {
            largest = left;
        }
        if (right < length && arr[largest] < arr[right]) {
            largest = right;
        }
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, length, largest);
        }
    }


    public static void print_array(int[] arr) {
        int length = arr.length;

        System.out.print('[');
        for (int i = 0; i < length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[length - 1] + "]");
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] array = {4, 9, 3, 5, 1};

        HeapSort.sort(array);

        print_array(array);
    }
}
