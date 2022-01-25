class Shape2{
    private int h; //height
    private int w; // width

    public void setHeight(int height){
        h = height;
    
    }
    public void setWidth(int width){
        w = width;
    }

    public int getHeight(){
        return h;
    }
    public int getWidth(){
        return w;
    }
}

public class Prob2 {
    public static void main(String[] args) {
        Shape2 s = new Shape2();
        // s.height = 2; height is private, so you can't access that.
        s.setHeight(15);
        // int res = s.getHeight();
        System.out.println(s.getHeight());

    }
}

// As height is a private data member of class Shape, thus it can’t be accessed
// outside the class.
// You have to write getter and setter for accessing private members of class.