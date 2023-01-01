public class Add_Two_Binary {
    public static String addBinary(String a, String b){
        // with function
        // giving number format exception

        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
        
    }

    // Without functions
    public static String addBinary2(String a, String b){
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
        System.out.println(addBinary2(a, b));
    }

}
