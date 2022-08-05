public class Find_Number_closest_to_Zero {
    public static int number_close_to_zero(int arr[], int n) {
        if (n == 0) {
            return 0;
        }
        int closest = arr[0];
        for (int i = 0; i < n; i++) {
            int number = arr[i];
            int absNumber = Math.abs(number);
            int absClose = Math.abs(closest);
            if (absNumber < absClose) {
                closest = number;
            } else if (absNumber == absClose && closest < 0) {
                closest = number;
            }
        }
        return closest;
    }

    public static void main(String[] args) {

    }
}
