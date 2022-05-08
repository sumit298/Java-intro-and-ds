public class SpecialSumOfArray {
    public static int sum(int arr[]) {
        int sumOfArray = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfArray = sumOfArray + arr[i];
        }
        // System.out.println(sumOfArray);
        int remainder;
        int sumOfdigits = 0;
        int tempSum = 0;
        if (sumOfArray > 10) {
            while (sumOfArray != 0) {
                remainder = sumOfArray % 10;
                sumOfArray /= 10;
                tempSum = tempSum + remainder;

            }
            if(tempSum > 9){
                while(tempSum!=0){
                    remainder = tempSum % 10;
                    tempSum/=10;
                    sumOfdigits = sumOfdigits + remainder;

                }
            }
            else{
                sumOfdigits = tempSum;
            }
        } else {
            sumOfdigits = sumOfArray;
        }

        return sumOfdigits;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 6, 2, 3, 7, 4, 3, 1, 9, 2, 4, 2, 8, 7, 5, 1, 9, 7, 3, 7, 1, 6, 8, 8, 8, 4,1, 8, 6, 7, 8, 3, 4, 8, 9, 6, 4, 9, 9, 8, 7, 6, 8, 2, 9, 9, 2, 5, 1, 6, 2, 1, 7, 7, 6, 1, 5, 4, 3, 1, 5, 6, 9, 7, 2, 3, 3, 2, 3, 6, 8, 6, 2, 6, 2, 8, 4, 9, 1, 9, 7, 9, 2, 4, 2, 5, 7, 9, 2, 4, 4, 1, 6, 3, 7, 9, 1, 3, 1, 4, 2, 7, 2, 4, 3, 5, 9, 7, 4, 3, 7, 3, 2, 1, 1, 5, 1, 1, 2, 8, 9, 2, 6, 2, 9, 8, 2, 5, 7, 4, 4, 8, 6, 7, 6, 1, 3, 1, 5, 1, 6, 7, 5, 9, 1, 3, 2, 6, 2, 3  };
        System.out.println(sum(arr));
    }
}