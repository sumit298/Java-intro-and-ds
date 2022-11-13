import java.util.HashMap;

public class BasicCalcStatic {
    public static HashMap<String, String> storeNumbers(String str){
        HashMap<String, String> operands = new HashMap<String, String>();
        operands.put("one", "1");
        operands.put("two", "2");
        operands.put("three", "3");
        operands.put("four", "4");
        operands.put("five", "5");
        operands.put("six", "6");
        operands.put("seven", "7");
        operands.put("eight", "8");
        operands.put("nine", "9");
        operands.put("zero", "0");
        return operands;
        
    }
    public static String calculate(String str){
        HashMap<String, String> operands = storeNumbers(str);
        HashMap<String, String> operators = new HashMap<String, String>();
        String result = "";
        operators.put("plus", "+");
        operators.put("minus", "-");
        if(str.length() == 0){
            return "-1";
        }
        for(int i=0; i<str.length();i++){
            if(operands.containsKey(str.substring(i, i+3))){
                result += operands.get(str.substring(i, i+3));
                i += 2;
            }
            else if(operands.containsKey(str.substring(i, i+4))){
                result += operands.get(str.substring(i, i+4));
                i += 3;
            }
            else if(operators.containsKey(str.substring(i, i+5))){
                result += operators.get(str.substring(i, i+5));
                i += 4;
            }
            else{
                result += operators.get(str.substring(i, i+4));
                i += 3;
            }
            
        }
        // if result less than -1 return "-1";
        return result;


    }
    public static void main(String[] args) {
        String str = "oneplusone";
        System.out.println(calculate(str));

    }
}
