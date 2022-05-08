
public class pattern1 {
    public static void main(String[] args) {
        // starPattern(4);
        // allrowcolStarPattern(4);
        reverseStarPattern(5);
      
    }



    static void allrowcolStarPattern(int n){
        for(int row=1;row<=n;row++){
            for(int col = 1; col<= n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void starPattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void reverseStarPattern(int n){
        for(int row = n; row >= 1; row--){
            for(int col = row; col >=1;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}