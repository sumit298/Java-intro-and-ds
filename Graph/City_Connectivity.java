import java.util.Scanner;

public class City_Connectivity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of cities");
        int countofCity = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the name of cities");
        String city[] = new String[countofCity];
        for (int index = 0; index < countofCity; index++) {
            city[index] = scan.nextLine();
        }
        System.out.println("Enter the kms between cities");
        int kms[][] = new int[countofCity][countofCity];
        for (int outindex = 0; outindex < countofCity; outindex++) {
            for (int inindex = 0; inindex < countofCity; inindex++) {
                if (inindex == outindex) {
                    kms[inindex][outindex] = 0;
                } else {
                    System.out
                            .println("Do you want a route from " + (inindex + 1) + " to " + (outindex + 1) + " Y or N");
                    boolean connection = scan.nextLine().trim().equalsIgnoreCase("y") ? true : false;
                    if (connection == true) {
                        System.out.println("Enter kms: ");
                        kms[inindex][outindex] = scan.nextInt();
                        scan.nextLine();
                    }
                }
            }
        }
        // to print kms matrix
        for (int index = 0; index < countofCity; index++) {
            System.out.print("    " + city[index]);
        }
        System.out.println();
        for (int outindex = 0; outindex < countofCity; outindex++) {
            System.out.print(city[outindex] + "  ");
            for (int inindex = 0; inindex < countofCity; inindex++) {
                System.out.print("  " + kms[inindex][outindex]);
            }
            System.out.println();
        }

    }
}
