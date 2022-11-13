import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Stack;

public class BasicCalculator {
    // consider a string which includes all digits and calculation in form of words.
    // "onetwoplusthreefour" in figures will be "12 + 34";
    // "oneplusone" in figures will be "1 + 1";
    // how to convert this string into figures and calculate the result?
    
    public static HashMap<String, String> storeNumbers(){
        HashMap<String, String> operands = new LinkedHashMap<>();
        
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
    
    public static String convert(String str){
        HashMap<String, String> operands = storeNumbers();
        HashMap<String, String> operators = new LinkedHashMap<>();
        operators.put("+", "plus");
        operators.put("-", "minus");
        String result = "";
        for(int i=0; i<str.length();i++){
            // check if the string is a operand or operator
            if(operands.containsKey(str.substring(i, i+3))){
                result += operands.get(str.substring(i, i+3));
                i += 2;
            }
            else if(operands.containsKey(str.substring(i, i+4))){
                result += operands.get(str.substring(i, i+4));
                i += 3;
            }
            else if(operators.containsValue(str.substring(i, i+5))){
                result += operators.get(str.substring(i, i+5));
                i += 4;
            }
            else{
                result += operators.get(str.substring(i, i+4));
                i += 3;
            }
            
            
        }
        System.out.println(result);
        return result;
    }
    public static int calculate(String s) {
        String str = convert(s);
        return helper(str);
    }
    
    
    private static int helper(String s) {
        int i = 0;
        int n = s.length();
           
        Stack<Integer> stack = new Stack<>();
        // 记录算式中的数字
        int num = 0;
        // 记录 num 前的符号，初始化为 +
        char sign = '+';
        
        while (i < n) {
            char ch = s.charAt(i++);
            // 如果是数字，连续读取到 num
            if(Character.isDigit(ch)) {
                num = 10 * num + (ch - '0');
            }
            if(ch == '(') {
                num = helper(s);
            }
            // 如果 c 非数字或括号
            // 如果不是数字，就是遇到了下一个符号，
            // 之前的数字和符号就要存进栈中
            if((!Character.isDigit(ch) && ch != ' ') || i == n) {
                switch (sign) {
                    case '+':
                        stack.push(num); break;
                        
                    case '-':
                        stack.push(-num); break;
                    // 只要拿出前一个数字做对应运算即可    
                    case '*':
                        int preMul = stack.pop();
                        stack.push(preMul * num);
                        break;
                        
                    case '/':
                        int preDiv = stack.pop();
                        stack.push(preDiv / num);
                        break;
                }
                // 更新符号为当前符号，数字清零
                sign = ch;
                num = 0;
            }
            
            if(ch == ')') {
                break;
            }
        }
        // 将栈中所有结果求和就是答案

        int sum = 0;
        
        while(!stack.isEmpty()) {
            sum += stack.pop();
        }
        
        return sum;
    }

        public static void main(String[] args) {
        String res = "onetwoplusthreefour";
        System.out.println(calculate(res));
    }
}
