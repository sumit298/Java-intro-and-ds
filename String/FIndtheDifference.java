public class FIndtheDifference {
    public static char findDifference(String s, String t){
        int a = 0;
        int b = 0;
        for(char c: s.toCharArray()){
            a += c;
        }
        for(char c: t.toCharArray()){
            b += c;
        }
        return (char)(b - a);
    }

    public static char findDifferenceBitManipulation(String s, String t){
        char r = 0;
        for(char c: s.toCharArray()){
            r ^= c;
        }
        for(char c: t.toCharArray()){
            r^=c;
        }
        return r;
    }
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findDifference(s, t));
        System.out.println(findDifferenceBitManipulation(s, t));
    }
        
}
