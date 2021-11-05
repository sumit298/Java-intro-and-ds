public class Problem14 {
    public static void main(String[] args) {
        int a = 2;
        for(;; a+=a){
            if(a>5){
                break;
            }
        }
        System.out.println(a);
    }
}

// Loop will run
// a = 2 then check 2>5 not true then a = a+2; a=4
// check 4>5 false then a = a+4; a = 8
// then 8>5 then break and exit out of the loop;
