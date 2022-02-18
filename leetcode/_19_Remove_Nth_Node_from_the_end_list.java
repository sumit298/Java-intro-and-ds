// LeetCode Problem 19: Remove Nth Node from the End of List
// Problem Description:
// Given a linked list, remove the n-th node from the end of list and return its head.
// Example:
// Given linked list: 1->2->3->4->5, and n = 2.

public class _19_Remove_Nth_Node_from_the_end_list {
    public static void main(String[] args) {

    }
}

// Approach:
// Two Pointers Method
// Time Complexity: O(n)
// Space Complexity: O(1)

// What is two pointers approach?
// We can use two pointers to solve this problem.
// The first pointer starts from the head of the list and the second pointer
// starts from the head of the list.
// The first pointer moves n nodes forward and the second pointer moves forward.
// When the first pointer reaches the end of the list, the second pointer will
// be at the nth node from the end.
// Then we can remove the nth node from the end of the list by moving the first
// pointer to the nth node from the beginning and then removing the node.
// We can also use a dummy node to simplify the code.


