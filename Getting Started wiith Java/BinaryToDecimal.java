public class BinaryToDecimal {
    public static int converter(int binary[]) {
        int result = 0;
        for (int i = 0; i < binary.length; i++) {
            result = result + (int) (Math.pow(2, i) * binary[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 1 };
        System.out.println(converter(arr));
    }
}
