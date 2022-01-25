class Box{
    int width;
    int height;
    int length;

    void volume(){
        System.out.println("Volume of the box is: " + width*height*length);
    }

}

public class Prob3 {
    public static void main(String[] args) {
        Box b = new Box();
        b.height = 5;
        b.width = 6;
        // b.length = 7; Solution
        b.volume();
    }
}

// Because length is not specified, it will take length as 0.
// therefore 0*5*6 = 0, Volume of the box is: 0
