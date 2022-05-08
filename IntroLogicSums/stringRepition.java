public class stringRepition {
    // public String stringRepition(String word){
    //     String 
    // }
    public static int areaoftriangle(int side1, int side2, int side3){
        int semiPerimeter = 0;
        int area;
        if((side1+side2) > side3 && (side2+ side3) > side1 && (side1+side3) > side2){
           
            semiPerimeter = ((side1 + side2 + side3)/2);
            area = (int) Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        }
        else{
            System.out.println("sum of two side is greater than third side");
            return -1;
        }
    return area;

    }
    public static void main(String[] args) {
        System.out.println(areaoftriangle(10, 200, 30000));
    }

}
