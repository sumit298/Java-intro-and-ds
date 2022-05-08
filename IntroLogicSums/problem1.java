
public class problem1 {
    public static void main(String[] args) {
        int[] a = {100, 89, 6, 3};
        for(int i=1;i<a.length;i++){
            a[i] = a[i-1]%a[i];

            System.out.println(a[i]);
        }
        System.out.println(a.length);
        System.out.println(a[3]);
    }
}

// Logic Behind Problem:
// a[1] = a[0]% a[1]
// a[1] = 11;
// a[2] = a[1] % a[2]
// a[2] = 11 % 6 = 5
// a[3] = a[2] % a[3]
// a[3] = 5 % 3 = 2
