public class Pentagon extends Shape {
    int sideLength;

    // Constructor
    public Pentagon(int sideLength, int x, int y, String colour) {
        super(x, y, colour);
        this.sideLength = sideLength;
    }
}