package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppTest {

    // Test QuickSort
    @Test
    public void testQuickSort() {
        int[] arr = {3, 6, 8, 10, 1, 2, 1};
        App.quickSort(arr, 0, arr.length - 1);
        int[] expected = {1, 1, 2, 3, 6, 8, 10};
        assertArrayEquals(expected, arr);

        // Test empty array
        int[] emptyArr = {};
        App.quickSort(emptyArr, 0, emptyArr.length - 1);
        int[] expectedEmpty = {};
        assertArrayEquals(expectedEmpty, emptyArr);

        // Test array with one element
        int[] singleElementArr = {5};
        App.quickSort(singleElementArr, 0, singleElementArr.length - 1);
        int[] expectedSingleElement = {5};
        assertArrayEquals(expectedSingleElement, singleElementArr);
    }

    // Test Binary Search
    @Test
    public void testBinarySearch() {
        int[] arr = {1, 1, 2, 3, 6, 8, 10};
        int index = App.binarySearch(arr, 1);
        assertTrue(index == 0 || index == 1);  // Kiểm tra giá trị bằng 1 có thể xuất hiện ở chỉ số 0 hoặc 1
        
        assertEquals(6, App.binarySearch(arr, 10));
        assertEquals(-1, App.binarySearch(arr, 4));

        // Test with an empty array
        int[] emptyArr = {};
        assertEquals(-1, App.binarySearch(emptyArr, 1));

        // Test with a single element
        int[] singleElementArr = {3};
        assertEquals(0, App.binarySearch(singleElementArr, 3));
        assertEquals(-1, App.binarySearch(singleElementArr, 4));
    }


    // Test isPrime
    @Test
    public void testIsPrime() {
        assertTrue(App.isPrime(2));
        assertFalse(App.isPrime(4));
        assertTrue(App.isPrime(17));
        assertFalse(App.isPrime(100));

        // Test negative and zero
        assertFalse(App.isPrime(-5));
        assertFalse(App.isPrime(0));
    }

    // Test isPalindrome
    @Test
    public void testIsPalindrome() {
        assertTrue(App.isPalindrome("radar"));
        assertFalse(App.isPalindrome("hello"));
        assertTrue(App.isPalindrome("level"));
        assertTrue(App.isPalindrome("abcba"));

        // Test empty string
        assertTrue(App.isPalindrome(""));

        // Test string with special characters
        assertTrue(App.isPalindrome("A man, a plan, a canal, Panama!"));
    }

    // Test DFS
    @Test
    public void testDFS() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(2));
        graph.put(2, Arrays.asList(0, 3));
        graph.put(3, Arrays.asList(3));

        List<Integer> result = App.dfs(graph, 2);
        List<Integer> expected = Arrays.asList(2, 0, 1, 3);
        assertTrue(result.containsAll(expected) && expected.containsAll(result));  // Kiểm tra tất cả các đỉnh có mặt trong kết quả

        // Test with a graph with a single node
        Map<Integer, List<Integer>> singleNodeGraph = new HashMap<>();
        singleNodeGraph.put(0, Arrays.asList());
        List<Integer> singleNodeResult = App.dfs(singleNodeGraph, 0);
        List<Integer> singleNodeExpected = Arrays.asList(0);
        assertEquals(singleNodeExpected, singleNodeResult);

        // Test with an empty graph
        Map<Integer, List<Integer>> emptyGraph = new HashMap<>();
        List<Integer> emptyGraphResult = App.dfs(emptyGraph, 0);
        List<Integer> emptyGraphExpected = Arrays.asList();
        assertEquals(emptyGraphExpected, emptyGraphResult);
    }

}
