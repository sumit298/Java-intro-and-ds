public class Multiply_Strings {
    public static String multiply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] pos = new int[m + n];
        
        for(int i = m - 1; i >= 0; i--){
            for(int j = n - 1; j >= 0; j--){
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j, p2 = i + j + 1;
                int sum = mul + pos[p2];
                
                pos[p1] += sum / 10;
                pos[p2] = (sum) % 10;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int p : pos){
            if(!(sb.length() == 0 && p == 0)){
                sb.append(p);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}


// This is a method that takes in two strings, num1 and num2, representing two positive integers and returns their product as a string.

// The method first initializes an integer array pos of length m + n, where m and n are the lengths of num1 and num2 respectively. The array pos will be used to store the intermediate products of each digit multiplication.

// The method then performs the standard multiplication algorithm that you would use by hand, looping through the digits of num1 and num2 and performing the multiplication of each pair of digits. The resulting product is then added to the corresponding position in the pos array.

// After the multiplication is complete, the method creates a new string builder object, sb, and appends each digit in the pos array to it, ignoring any leading zeros. If the resulting string is empty, the method returns "0", otherwise it returns the string built by sb.


// int m = num1.length(), n = num2.length();
// This initializes two integer variables, m and n, and assigns to them the lengths of num1 and num2 respectively.


// int[] pos = new int[m + n];
// This initializes an integer array pos with length m + n. This array will be used to store the intermediate products of each digit multiplication.


// for(int i = m - 1; i >= 0; i--){
//     for(int j = n - 1; j >= 0; j--){
//         int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
//         int p1 = i + j, p2 = i + j + 1;
//         int sum = mul + pos[p2];
        
//         pos[p1] += sum / 10;
//         pos[p2] = (sum) % 10;
//     }
// }
// This is the main loop of the multiplication algorithm. It loops through the digits of num1 and num2 and performs the multiplication of each pair of digits.

// The variable mul stores the result of the multiplication of the current digits of num1 and num2, which are obtained by using the charAt() method to get the character at the corresponding index and then subtracting '0' to get the numerical value of the digit.

// The variables p1 and p2 are the indices in the pos array where the product of the current multiplication should be stored. These indices are calculated based on the current indices i and j of the loop and the lengths of num1 and num2.

// The variable sum is the result of adding mul to the value at index p2 in the pos array. The value at index p1 is then updated by adding the tens digit of sum to it, and the value at index p2 is updated with the units digit of sum.


// StringBuilder sb = new StringBuilder();
// for(int p : pos){
//     if(!(sb.length() == 0 && p == 0)){
//         sb.append(p);
//     }
// }
// return sb.length() == 0 ? "0" : sb.toString();
// This loop iterates through each element p in the pos array and appends it to a string builder object, sb, unless p is a leading zero and sb is empty.

// Finally, the method returns the string built by sb. If sb is empty, it returns "0", otherwise it returns the string built by sb.



