package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class HeapSortTest {

    @Test
    public void testSortWithUnsortedArray() {
        int[] inputArray = {4, 9, 3, 5, 1};
        int[] expectedArray = {1, 3, 4, 5, 9};

        HeapSort.sort(inputArray);
        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testSortWithAlreadySortedArray() {
        int[] inputArray = {1, 2, 3, 4, 5};
        int[] expectedArray = {1, 2, 3, 4, 5};

        HeapSort.sort(inputArray);
        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testSortWithReversedArray() {
        int[] inputArray = {5, 4, 3, 2, 1};
        int[] expectedArray = {1, 2, 3, 4, 5};

        HeapSort.sort(inputArray);
        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testSortWithSingleElementArray() {
        int[] inputArray = {42};
        int[] expectedArray = {42};

        HeapSort.sort(inputArray);
        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testSortWithEmptyArray() {
        int[] inputArray = {};
        int[] expectedArray = {};

        HeapSort.sort(inputArray);
        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testSortWithDuplicates() {
        int[] inputArray = {3, 3, 2, 2, 1, 1};
        int[] expectedArray = {1, 1, 2, 2, 3, 3};

        HeapSort.sort(inputArray);
        assertArrayEquals(expectedArray, inputArray);
    }

}