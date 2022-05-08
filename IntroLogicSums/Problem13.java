public class Problem13{
    public static void main(String args[]){
        char[]x = "197".toCharArray();
        System.out.println(x[0] + " " + x[1] + " " + x[2]);
        int nine = Integer.parseInt("" + x[1]);
        System.out.println(""+x[1]+nine);
        System.out.println("9"+9);
    }
}

// Logic behind code
// toCharArray() will convert string into a new character Array
// converted to int nine = x[1] = 9
// x[1] + nine = "9" + 9 = 99