
public class CompareTriplets {

    public static int[] compareTriplet(int alice[], int bob[]) {
        int aliceScore = 0;
        int bobScore = 0;
        int result[] = new int[3];
        for (int i = 0; i < 3; i++) {
            if (alice[i] > bob[i]) {
                aliceScore = aliceScore + 1;
                result[0] = aliceScore;
            }
            if (alice[i] < bob[i]) {
                bobScore = bobScore + 1;
                result[1] = bobScore;
            }
        }
        return result;
    }

    // public static int[] compareTripletOptimized() {
    //     int pointsAlice = ((a0 > b0) ? 1 : 0) + ((a1 > b1) ? 1 : 0) + ((a2 > b2) ? 1 : 0);
    //     int pointsBob = ((a0 < b0) ? 1 : 0) + ((a1 < b1) ? 1 : 0) + ((a2 < b2) ? 1 : 0);
    //     System.out.println(pointsAlice + " " + pointsBob);
    // }

    public static void main(String[] args) {
        int alice[] = { 17, 28, 30 };
        int bob[] = { 99, 16, 8 };
        int result[] = compareTriplet(alice, bob);
        for (int i = 0; i < result.length - 1; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
