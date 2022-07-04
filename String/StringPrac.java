public class StringPrac {
    public static void main(String[] args) {
        String a  = "sumit";
        String b = "sumit";
        // System.out.println(a);
        // a = "Raci";
        // how to print address of variable
        // System.out.println(a.hashCode());
        // System.out.println(b.hashCode());
        // a = "Ravi";
        System.out.println(a==b);
        // System.out.println(b);
        // System.out.println(a.hashCode());
        // System.out.println(b.hashCode());
        int arr1[] = {1};
        int arr2[] = {1};
        int arr3[] = {1};
        arr1[0] = 3;
        arr2[0] = arr1[0];
        arr3[0] = arr2[0];
        // System.out.println(arr1.hashCode());
        // System.out.println(arr2.hashCode());
        // System.out.println(arr3.hashCode());
        // System.out.println(arr1[0]);
        // System.out.println(arr3[0]);
        // Example to show array mutability
        String s1 = new String("Ravi");
        String s2 = new String("Ravi");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1==s2);


    }
}
