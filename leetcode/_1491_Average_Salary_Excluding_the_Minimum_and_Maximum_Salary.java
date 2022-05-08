public class _1491_Average_Salary_Excluding_the_Minimum_and_Maximum_Salary {
    public double average(int[] salary) {
        double min = salary[0];
        double max = salary[0];
        double sum = 0;
        double result;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] < min) {
                min = salary[i];
            }
            if (salary[i] > max) {
                max = salary[i];

            }
            sum = sum + salary[i];
        }
        result = (sum - min - max) / (salary.length - 2);
        return result;

    }
}

// public double average(int[] salary) {
// double sum = 0d;
// int M = Integer.MIN_VALUE, m = Integer.MAX_VALUE;
// for (int s : salary) {
// m = Math.min(m, s);
// M = Math.max(M, s);
// sum += s;
// }
// return (sum - m - M) / (salary.length - 2);
// }
// def average(self, salary: List[int]) -> float:
// m, M, total = math.inf, -math.inf, 0.0
// for s in salary:
// m, M = min(m, s), max(M, s)
// total += s
// return (total - m - M) / (len(salary) - 2)
// Short code:

// import java.util.IntSummaryStatistics;

// public double average(int[] salary) {
// IntSummaryStatistics stat =
// Arrays.stream(salary).boxed().collect(Collectors.summarizingInt(i -> i));
// return (double)(stat.getSum() - stat.getMax() - stat.getMin()) /
// (stat.getCount() - 2);
// }
// def average(self, salary: List[int]) -> float:
// return (sum(salary) - max(salary) - min(salary)) / (len(salary) - 2)
// Analysis:

// Time: O(n), space: O(1).