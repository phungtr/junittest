package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

@SuppressWarnings("unused")
public class App {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // Binary Search
    public static int binarySearch(int[] arr, int target) {
        // Nếu mảng đã sắp xếp, bạn không cần phải sắp xếp lại nữa
        // Arrays.sort(arr); // Đảm bảo mảng được sắp xếp trước khi tìm kiếm
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Nếu không tìm thấy
    }

    // Check Prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Check Palindrome
    public static boolean isPalindrome(String str) {
        // Loại bỏ tất cả ký tự không phải chữ cái hoặc chữ số và chuyển tất cả thành chữ thường
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Depth First Search (DFS)
    public static List<Integer> dfs(Map<Integer, List<Integer>> graph, int start) {
        List<Integer> visited = new ArrayList<>();
        if (!graph.containsKey(start)) {
            return visited; // Trả về danh sách rỗng nếu đồ thị trống hoặc không có nút khởi đầu
        }
        Set<Integer> visitedSet = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (!visitedSet.contains(node)) {
                visited.add(node);
                visitedSet.add(node); // Đánh dấu đỉnh là đã duyệt
                List<Integer> neighbors = graph.get(node);
                if (neighbors != null) {
                    // Sắp xếp các láng giềng trước khi thêm vào stack
                    neighbors.sort(Integer::compareTo); // Sắp xếp các láng giềng để duyệt theo thứ tự
                    for (int neighbor : neighbors) {
                        stack.push(neighbor);
                    }
                }
            }
        }
        return visited;
    }
}
