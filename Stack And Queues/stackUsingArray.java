import java.util.Scanner;

public class stackUsingArray {
    char data[];
    int top; //Top most element of the stack
    public stackUsingArray(){
        data = new char[10];
        top=-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
    
    public void push(char element){
        top++;
        if(top == data.length){
            System.out.println("Stack Overflow");
        }
        data[top] = element;

    }
    public char pop(){
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
            // return 0;
        }
        else{
            char deletedElement = data[top];
            top--;
            // System.out.println("The popped element is "+deletedElement);
            return deletedElement;
        }
    }
    public void display(){
        int index;
        for(index = top; index >= 0; index--){
            System.out.println(data[index]);
        }
    }

    public static boolean checkParenthesis(String str){
        
        stackUsingArray stack = new stackUsingArray();
        for(int index =0; index < str.length(); index++ ){
            char characterScanned = str.charAt(index);
            if(characterScanned== '[' || characterScanned == '{' || characterScanned == '('){
                stack.push(characterScanned);
            }
            else if(stack.isEmpty() || characterScanned == ']'){
                if(stack.pop() != '[' ){
                    return false;
                }
                

            }
            else if(stack.isEmpty() || characterScanned == '}'){
                if(stack.pop() != '{'){
                    return false;
                }
                
            }
            else if(stack.isEmpty() || characterScanned == ')'){
                if(stack.pop() != '('){
                    return false;
                }
                
            }
        }
        stack.display();
        return stack.isEmpty();

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Brackets: ");
        String str = scan.nextLine();
        scan.close();
        boolean result  = checkParenthesis(str);
        if(result){
            System.out.println("Parenthesis Matched");
        }
        else{

            System.out.println("Parenthesis Not Matched");
        }
        
    }    
}
