public class Problem8 {
    void printSequence(int n){
        int term1 = 1, comRatio = 2;
        int[] sequence = new int[n];
        for(int i = 0; i < sequence.length; i++){
            sequence[i] = term1;
            term1 += comRatio;
            System.out.println(sequence[i] + " ");
        }
    }
    public static void main(String[] args) {
        Problem8 problem8 = new Problem8();
        problem8.printSequence(4);
    }
}

// Logic behind the problem:
// in for loop we are printing the sequence of terms.
// term1 = 1 sequence[0] = 1 
// term1 = 1 + comRatio, sequence[1] = 3
// term1 = 3 + 2, sequence[2] = 5
// term1 = 5 + 2, sequence[3] = 7
