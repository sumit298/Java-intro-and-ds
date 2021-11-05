public class Problem6 {
    public static void main() {
        System.out.println("Bye");
    }
    public static void main(String[] args) {
        System.out.println("Welcome");
        main();
    }
}
// Logic behind code
// main should be enclosed with String[] args then it will considered as main function
// otherwise it is considered as ordinary method.