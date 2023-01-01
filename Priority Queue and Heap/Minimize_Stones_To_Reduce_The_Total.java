import java.util.PriorityQueue;

public class Minimize_Stones_To_Reduce_The_Total {
    public static int minStoneSum(int piles[], int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);
        for (int num : piles) {
            heap.add(num);
        }

        for (int i = 0; i < k; i++) {
            int curr = heap.remove();
            int remove = curr / 2;
            heap.add(curr - remove);
        }

        int ans = 0;
        for (int num : heap) {
            ans += num;
        }

        return ans;
    }

    // another appraoch
    public static int minStoneSum2(int piles[], int k) {
        int n = piles.length;
        int[] heap = new int[n + 1];
        for (int i = 0; i < n; i++) {
            heap[i + 1] = piles[i];
        }

        for (int i = n / 2; i >= 1; i--) {
            sink(heap, i, n);
        }

        for (int i = 0; i < k; i++) {
            int curr = heap[1];
            int remove = curr / 2;
            heap[1] = curr - remove;
            sink(heap, 1, n);
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += heap[i];
        }

        return ans;
    }

    private static void sink(int[] heap, int i, int n) {
        while (2 * i <= n) {
            int j = 2 * i;
            if (j < n && heap[j] < heap[j + 1]) {
                j++;
            }

            if (heap[i] >= heap[j]) {
                break;
            }

            swap(heap, i, j);
            i = j;
        }
    }

    private static void swap(int[] heap, int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

}

// Approach: Greedy + Max Heap
// Intuition

// At any given step, which number should we choose? We want to minimize the
// total number of stones remaining, which means we want to maximize the number
// of stones we remove at each step, so we should choose greedily choose the
// largest number at every step.

// Every time we complete an operation, the data changes and we need to find the
// maximum number again. The best data structure for this would be a heap, as it
// allows us to update the data and always retrieve the maximum value in
// O(log⁡n)O(\log{}n)O(logn) time, compared to O(n)O(n)O(n) if we just used an
// array.

// Algorithm

// Initialize a max heap from piles.

// Perform the following k times:

// Pop the maximum element from the heap, call it curr.
// Calculate how many stones remove should be removed from curr after performing
// the operation. It is the floor of curr / 2.
// Push curr - remove onto the heap.
// Return the sum of the elements in the heap.

// Implementation

// Note: C++'s priority_queue doesn't allow iteration, so we'll track the answer
// as we perform the heap operations.

// Python's heapq only implements min heaps, which is why we need to make all
// the values negative to simulate a max heap.

// Complexity Analysis

// Given nnn as piles.length,

// Time complexity: O(n+k⋅log⁡n)O(n + k \cdot \log{}n)O(n+k⋅logn)

// An array can be converted to a heap in linear time (O(n)O(n)O(n)) using a
// method like Python's heapq.heapify(). After converting the input to a heap,
// we perform k heap operations. Each heap operation costs
// O(log⁡n)O(\log{}n)O(logn), which gives us a time complexity of
// O(n+k⋅log⁡n)O(n + k \cdot \log{}n)O(n+k⋅logn).

// Space complexity: O(n)O(n)O(n)

// The heap's length is equal to nnn, which is all the extra space we use.



// Second Approach: for minStoneSum2

// This looks like a Java method that tries to minimize the sum of a given array of integers piles by taking k operations on the elements of the array. In each operation, the element with the largest value is divided by 2 and replaced with the result.

// The method first constructs a heap from the given piles array and performs the required number of operations on it by using the sink method. The sink method is used to maintain the heap property of the array, which is that for every element at index i, the value of the element at index i must be greater than or equal to the value of its children. The method does this by continuously swapping the element at index i with the larger of its children until the heap property is satisfied.

// After all the operations are completed, the method returns the sum of all the elements in the heap.


// The minStoneSum2 method takes in an integer array piles and an integer k as input, and it returns an integer.

// First, the method declares a variable n that is equal to the length of the piles array. It then creates a new array heap that is one element larger than piles, and copies the elements of piles into heap, starting from the second element. This is done so that the heap can be constructed using the standard heap layout, where the root node is at index 1 and the children of a node at index i are at indices 2i and 2i + 1.

// The method then constructs the heap by iterating over the elements in the array heap from the middle to the first element, and calling the sink method on each element. The sink method is used to maintain the heap property by continuously swapping the element at index i with the larger of its children until the heap property is satisfied.

// Next, the method performs the required number of operations on the heap by calling the sink method on the root node (index 1) k times. In each call to the sink method, the root node is divided by 2 and replaced with the result, and the heap property is maintained by sinking the root node until it is in the correct position.

// Finally, the method calculates the sum of all the elements in the heap and returns it as the result.

// The sink method takes in an integer array heap, an integer i, and an integer n as input, and it does not return any value. It is used to maintain the heap property of the heap array by continuously swapping the element at index i with the larger of its children until the heap property is satisfied.

// The method first checks if the element at index i has children by checking if 2 * i is less than or equal to n. If it does, it sets a variable j to 2 * i, which is the index of the left child. It then checks if the element at index j + 1 exists and is greater than the element at index j. If it is, it sets j to j + 1, which is the index of the right child. This ensures that j is the index of the larger of the two children.

// If the element at index i is less than the element at index j, the method swaps the two elements and sets i to j, which is the index of the element that was previously at index i. The method then repeats the process until the heap property is satisfied.

// The swap method is a helper method that takes in an integer array heap, an integer i, and an integer j as input, and it does not return any value. It swaps the elements at indices i and j in the heap array.