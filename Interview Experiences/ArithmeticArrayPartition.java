import java.util.ArrayList;
import java.util.List;

public class ArithmeticArrayPartition {
    public static void arithmeticPartition(String arithmeticOperator, double arithmeticResult,
            List<Integer> arrayofInteger) {
        if(arrayofInteger.size() % 2 !=0){
            return;
        }
        // Create array of size 2 and then add it to the list
        List<List<Integer>> listOfList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arrayofInteger.size(); i++) {
            for (int j = i + 1; j < arrayofInteger.size(); j++) {
                if (arithmeticOperator.equals("+")) {
                    if (arrayofInteger.get(i) + arrayofInteger.get(j) == arithmeticResult) {
                        result.add(arrayofInteger.get(i));
                        result.add(arrayofInteger.get(j));
                        listOfList.add(result);
                        result = new ArrayList<>();
                    }
                } else if (arithmeticOperator.equals("-")) {
                    if (arrayofInteger.get(i) - arrayofInteger.get(j) == arithmeticResult) {
                        result.add(arrayofInteger.get(i));
                        result.add(arrayofInteger.get(j));
                        listOfList.add(result);
                        result = new ArrayList<>();


                    }
                } else if (arithmeticOperator.equals("*")) {
                    if (arrayofInteger.get(i) * arrayofInteger.get(j) == arithmeticResult) {

                        result.add(arrayofInteger.get(i));
                        result.add(arrayofInteger.get(j));
                        listOfList.add(result);
                        result = new ArrayList<>();
                    }

                } else if (arithmeticOperator.equals("/")) {
                    if (arrayofInteger.get(i) / arrayofInteger.get(j) == arithmeticResult) {
                        result.add(arrayofInteger.get(i));
                        result.add(arrayofInteger.get(j));
                        listOfList.add(result);
                    }
                }
            }

            
        }
        // listOfList.add(result);
        System.out.println(listOfList);

    }
    public static void main(String[] args) {
        String operator = "+";
        double result = 8;
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(4);
        arithmeticPartition(operator, result, array);
    }
}
