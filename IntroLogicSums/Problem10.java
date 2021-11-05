public class Problem10 {
    public static void main(String[] args) {
        int n[] = { 0, 1, 0, -1 };
        for (int i = 1; i < n.length; i++) {
            if (n[i] == 0 && n[i - 1] != 0) {
                int x = n[i - 1];
                n[i - 1] = n[i];
                n[i] = x;
            }
            System.out.println(n[2]);
        }
    }
}

// Logic behind code
// The code is simple. The code is to find the first index of 0 and swap it with the previous index.
// n[i] == 0 && n[i - 1] != 0
// This is to check if the current index is 0 and the previous index is not 0.
// If it is true, then swap the current index with the previous index.
// n[i - 1] = n[i]
// This is to swap the current index with the previous index.
// n[i] = x
// int x = n[i - 1]
// This is to store the previous index in a variable.
// n[i - 1] = n[i]
// This is to swap the previous index with the current index.
