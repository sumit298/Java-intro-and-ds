import java.util.Scanner;

public class EatingCandies {
    // There are n candies put from left to right on a table. The candies are
    // numbered from left to right. The i-th candy has weight wi. Alice and Bob eat
    // candies.

    // Alice can eat any number of candies from the left (she can't skip candies,
    // she eats them in a row).

    // Bob can eat any number of candies from the right (he can't skip candies, he
    // eats them in a row).

    // Of course, if Alice ate a candy, Bob can't eat it (and vice versa).

    // They want to be fair. Their goal is to eat the same total weight of candies.
    // What is the most number of candies they can eat in total?

    // Input
    // The first line contains an integer t (1≤t≤104) — the number of test cases.

    // The first line of each test case contains an integer n (1≤n≤2⋅105) — the
    // number of candies on the table.

    // The second line of each test case contains n integers w1,w2,…,wn (1≤wi≤104) —
    // the weights of candies from left to right.

    // It is guaranteed that the sum of n over all test cases does not exceed 2⋅105.

    // Output
    // For each test case, print a single integer — the maximum number of candies
    // Alice and Bob can eat in total while satisfying the condition.

    // Example
    // inputCopy
    // 4
    // 3
    // 10 20 10
    // 6
    // 2 1 4 2 4 1
    // 5
    // 1 2 4 8 16
    // 9
    // 7 3 20 5 15 1 11 8 10
    // outputCopy
    // 2
    // 6
    // 0
    // 7
    // Note
    // For the first test case, Alice will eat one candy from the left and Bob will
    // eat one candy from the right. There is no better way for them to eat the same
    // total amount of weight. The answer is 2 because they eat two candies in
    // total.

    // For the second test case, Alice will eat the first three candies from the
    // left (with total weight 7) and Bob will eat the first three candies from the
    // right (with total weight 7). They cannot eat more candies since all the
    // candies have been eaten, so the answer is 6 (because they eat six candies in
    // total).

    // For the third test case, there is no way Alice and Bob will eat the same
    // non-zero weight so the answer is 0.

    // For the fourth test case, Alice will eat candies with weights [7,3,20] and
    // Bob will eat candies with weights [10,8,11,1], they each eat 30 weight. There
    // is no better partition so the answer is 7.
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int t = scanner.nextInt();
            for (int i = 0; i < t; i++) {
                int n = scanner.nextInt();
                int[] weights = new int[n];
                for (int j = 0; j < n; j++) {
                    weights[j] = scanner.nextInt();
                }
                int max = 0;
                for (int j = 0; j < n; j++) {
                    int sum = 0;
                    for (int k = j; k < n; k++) {
                        sum += weights[k];
                        max = Math.max(max, sum);
                    }
                }
                System.out.println(max);
            }
        }
    }
}
