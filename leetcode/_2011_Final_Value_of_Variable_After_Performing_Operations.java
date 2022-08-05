public class _2011_Final_Value_of_Variable_After_Performing_Operations{
    public static int finalValue(String[] operations){
        int x = 0; 
        for(int i=0; i<operations.length;i++){
            if(operations[i] == "X++" || operations[i] == "++X"){
                x = x+1;
            }
            else if(operations[i] == "--X" || operations[i]== "X--"){
                x = x-1;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        String operations[] = {"++X","++X","X++"};
        System.out.println(finalValue(operations));

    }
}