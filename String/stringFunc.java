public class stringFunc {
    public static void main(String[] args) {
        String str = "ABCDEFGH";
        String str2 = "IJKLMNOP";
        System.out.println("The length of first String is: " + str.length());
        System.out.println("The lower case of first String is: " + str.toLowerCase());
        System.out.println("The upper case of first string is: " + str.toUpperCase());
        System.out.println("The formatted string is " + String.format(" | %8s |", str));
        System.out.println("The substring of str between index 2 to index 5 is: " + str.substring(2, 5));
        System.out.println("The index of str2 in 4th position is: " + str2.indexOf(4));
        System.out.println("The concatenation of str with str2 is: " + str.concat(str2));
        System.out.println("The char at index 4 in str is: " + str.charAt(4));
        System.out.println("Is str empty? " + str.isEmpty());
        System.out.println("Is str contains ABC or given string ? " + str.contains("ABC"));
    }
}
