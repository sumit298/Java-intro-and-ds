public class _1790_Check_if_One_String_Swap_Can_Make_Strings_Equal{
    public static boolean areAlmostEqual(String s1, String s2) {
        if(s1 == s2){
            return true;
        }
        
        char[] ch = s2.toCharArray();
        char temp = ch[0];
        ch[0] = ch[ch.length-1];
        ch[ch.length-1] = temp;
        
        s2 = String.valueOf(ch);
        System.out.println(s2);
        System.out.println(s1);
        if(s1 == s2){
            return true;
        }
        
        return false;      
    }
    
    public static void main(String[] args) {
        String s1 = "bank";
        String s2 = "kanb";
        System.out.println(areAlmostEqual(s1, s2));
    }
}