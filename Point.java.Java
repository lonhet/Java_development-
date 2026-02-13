public class Point {

    protected double x;
    protected double y;

    public Point() {
        this(0, 0);}

    public Point(double x, double y) {
        this.x = x;
        this.y = y;}

    public void setLocation(double x, double y) {
        this.x = x;
        this.y = y;}

    public double getX() { return x; }
    public double getY() { return y; }

    public void rotate(double angle) {
        double newX = x * Math.cos(angle) - y * Math.sin(angle);
        double newY = x * Math.sin(angle) + y * Math.cos(angle);
        x = newX;
        y = newY;}

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";}
}
