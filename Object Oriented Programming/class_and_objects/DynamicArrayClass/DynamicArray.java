package DynamicArrayClass;

public class DynamicArray {
    int data[];
    int nextIndex;

    DynamicArray(){
        data = new int[5];
        nextIndex = 0;
    }

    int size(){
        return nextIndex;
    }
}
