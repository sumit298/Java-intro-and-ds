public class Problem9 {
    public static void main(String[] args) {
        int[] ints = { 0, 1, 2 };
        double doubles[] = { 1.0, 1.1, 1.2 };
        int sum = 0;
        int maximum = Math.max(ints.length, doubles.length);
        for (int i = 0; i < maximum; i++) {
            sum = 10;
            sum += ints[i] + doubles[i];
        }
        System.out.println(sum);
    }
}

// Logic behind the code
// here in for loop we are reinitializing the sum to 10 again.
// we are adding the sum of the ints and doubles and then printing the sum.
// sum = 10 + 0 + 1.0 = 11.1 = 11
// sum = 10 + 1 + 1.1 = 12.1 = 12
// sum = 10 + 2 + 1.2 = 13.2 = 13 because we are using int.