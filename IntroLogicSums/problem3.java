public class problem3 {
    public static void main(String[] args) {
        int x = 4;
        for(int i=1; i<5; ++i){
            if(x%i==1){
                continue;
            }
            System.out.println(i);
        }
    }
}

// output 124
// Logic behind problem
// 4%1 = 0 i=1
// 4%2 = 0 i=2
// 4%3 = 1 continue
// 4%4 = 0 i=4