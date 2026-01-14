public class Point {

    protected int x;
    protected int y;

    public Point() {
        this(0, 0);}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;}

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;}

    public int getX() {
        return x;}

    public int getY() {
        return y;}

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";}

    public int distanceFromOrigin() {
        return (int)Math.round(Math.sqrt(x * x + y * y));}

    public boolean isInRectangle(Point topLeft, Point bottomRight) {
        return x >= topLeft.x && x <= bottomRight.x &&
               y <= topLeft.y && y >= bottomRight.y;}

    public boolean isInCircle(Point center, int radius) {
        int dx = x - center.x;
        int dy = y - center.y;
        return dx * dx + dy * dy <= radius * radius;}
}
