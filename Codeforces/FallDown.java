import java.util.Scanner;

public class FallDown {
    // There is a grid with n rows and m columns, and three types of cells:

    // An empty cell, denoted with '.'.
    // A stone, denoted with '*'.
    // An obstacle, denoted with the lowercase Latin letter 'o'.
    // All stones fall down until they meet the floor (the bottom row), an obstacle,
    // or other stone which is already immovable. (In other words, all the stones
    // just fall down as long as they can fall.)

    // Simulate the process. What does the resulting grid look like?

    // Input
    // The input consists of multiple test cases. The first line contains an integer
    // t (1≤t≤100) — the number of test cases. The description of the test cases
    // follows.

    // The first line of each test case contains two integers n and m (1≤n,m≤50) —
    // the number of rows and the number of columns in the grid, respectively.

    // Then n lines follow, each containing m characters. Each of these characters
    // is either '.', '*', or 'o' — an empty cell, a stone, or an obstacle,
    // respectively.

    // Output
    // For each test case, output a grid with n rows and m columns, showing the
    // result of the process.

    // You don't need to output a new line after each test, it is in the samples
    // just for clarity.

    // Example
    // inputCopy
    // 3
    // 6 10
    // .*.*....*.
    // .*.......*
    // ...o....o.
    // .*.*....*.
    // ..........
    // .o......o*
    // 2 9
    // ...***ooo
    // .*o.*o.*o
    // 5 5
    // *****
    // *....
    // *****
    // ....*
    // *****
    // outputCopy
    // ..........
    // ...*....*.
    // .*.o....o.
    // .*........
    // .*......**
    // .o.*....o*

    // ....**ooo
    // .*o**o.*o

    // .....
    // *...*
    // *****
    // *****
    // *****There is a grid with n rows and m columns, and three types of cells:

    // An empty cell, denoted with '.'.
    // A stone, denoted with '*'.
    // An obstacle, denoted with the lowercase Latin letter 'o'.
    // All stones fall down until they meet the floor (the bottom row), an obstacle,
    // or other stone which is already immovable. (In other words, all the stones
    // just fall down as long as they can fall.)

    // Simulate the process. What does the resulting grid look like?

    // Input
    // The input consists of multiple test cases. The first line contains an integer
    // t (1≤t≤100) — the number of test cases. The description of the test cases
    // follows.

    // The first line of each test case contains two integers n and m (1≤n,m≤50) —
    // the number of rows and the number of columns in the grid, respectively.

    // Then n lines follow, each containing m characters. Each of these characters
    // is either '.', '*', or 'o' — an empty cell, a stone, or an obstacle,
    // respectively.

    // Output
    // For each test case, output a grid with n rows and m columns, showing the
    // result of the process.

    // You don't need to output a new line after each test, it is in the samples
    // just for clarity.

    // Example
    // inputCopy
    // 3
    // 6 10
    // .*.*....*.
    // .*.......*
    // ...o....o.
    // .*.*....*.
    // ..........
    // .o......o*
    // 2 9
    // ...***ooo
    // .*o.*o.*o
    // 5 5
    // *****
    // *....
    // *****
    // ....*
    // *****
    // outputCopy
    // ..........
    // ...*....*.
    // .*.o....o.
    // .*........
    // .*......**
    // .o.*....o*

    // ....**ooo
    // .*o**o.*o

    // .....
    // *...*
    // *****
    // *****
    // *****
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                char[][] grid = new char[n][m];
                for (int j = 0; j < n; j++) {
                    String s = sc.next();
                    for (int k = 0; k < m; k++) {
                        grid[j][k] = s.charAt(k);
                    }
                }
                int count = 0;
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < m; k++) {
                        if (grid[j][k] == '*') {
                            count++;
                        }
                    }
                }
                if (count == 0) {
                    System.out.println("Impossible");
                } else {
                    for (int j = 0; j < n; j++) {
                        for (int k = 0; k < m; k++) {
                            if (grid[j][k] == '*') {
                                grid[j][k] = '.';
                            }
                        }
                    }
                    for (int j = n - 1; j >= 0; j--) {
                        for (int k = 0; k < m; k++) {
                            if (grid[j][k] == '.') {
                                grid[j][k] = '*';
                            }
                        }
                    }
                    for (int j = 0; j < n; j++) {
                        for (int k = 0; k < m; k++) {
                            System.out.print(grid[j][k]);
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}
