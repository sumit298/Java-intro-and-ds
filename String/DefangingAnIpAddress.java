public class DefangingAnIpAddress {
    public static String defangingIp(String address){
        StringBuilder str = new StringBuilder();
        for(int i=0; i<address.length();i++){
            if(address.charAt(i) == '.'){
                str.append("[.]");
            }
            else{
                str.append(address.charAt(i));
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        String s  = "255.255.255.255";
        System.out.println(defangingIp(s));
    }
}
