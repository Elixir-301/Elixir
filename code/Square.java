public class Square extends Shape {
    int width;
    int height;

    public Square(int x, int y, int width, int height, string colour) {
        this.width = width;
        this.height = height;
        super(x, y, colour);
    }
}