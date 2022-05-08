public class Problem7 {
    public static void main(String[] args) {
        int x = 0;
        switch(x){
            case 1: 
                System.out.println(x%6);
            break;
            default:
                System.out.println(x%2);
        }
    }
}

// Logic behind code
// The switch statement is a control structure that allows you to execute different code depending on the value of a variable.
// 0%2 = 0
// 0%6 = 0
