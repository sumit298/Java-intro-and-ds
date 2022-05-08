public class Problem15 {
    public static void main(String[] args) {
        for (int i = 0, j = 1; i <= 3 && j > 0; i++, j++) {
            System.out.println(j);
        }
    }
}

// i<=3 this section is loop stopper because j alone will result in infinite loop.
// i=0, j=1 and 0<=3 && 1>0
// j = 1
// i=1, j=2 and 1<=3 && 2>0
// j=2
// i=2, j=3 and 2<=3 && 3 >0
// j=3
// i=3, j=4 and 3<=3 && 4 >0
// j = 4
// i=4, j=5 and 4 <=3 and 5>0 false
// exit of loop