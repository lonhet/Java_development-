class Point {

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
        return (int) Math.sqrt(x * x + y * y);}

    public boolean isInRectangle(Point topLeft, Point bottomRight) {
        return x >= topLeft.x && x <= bottomRight.x &&
               y <= topLeft.y && y >= bottomRight.y;}

    public boolean isInCircle(Point center, int radius) {
        int dx = x - center.x;
        int dy = y - center.y;
        return dx * dx + dy * dy <= radius * radius;}

    public void rotate(double angleDegrees) {
        double angle = Math.toRadians(angleDegrees);
        int newX = (int) Math.round(x * Math.cos(angle) - y * Math.sin(angle));
        int newY = (int) Math.round(x * Math.sin(angle) + y * Math.cos(angle));
        x = newX;
        y = newY;}
}

class Point3D extends Point {
    private int z;
    public Point3D() {
        this(0, 0, 0);}

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;}

    public void setLocation(int x, int y, int z) {
        super.setLocation(x, y);
        this.z = z;}

    @Override
    public void setLocation(int x, int y) {
        super.setLocation(x, y);
        this.z = 0;}

    public int getZ() {
        return z;}

    @Override
    public String toString() {
        return "(" + x + "," + y + "," + z + ")";}

    @Override
    public int distanceFromOrigin() {
        return (int) Math.sqrt(x * x + y * y + z * z);}

    public boolean isInBox(Point3D c1, Point3D c2) {
        return x >= Math.min(c1.x, c2.x) && x <= Math.max(c1.x, c2.x) &&
               y >= Math.min(c1.y, c2.y) && y <= Math.max(c1.y, c2.y) &&
               z >= Math.min(c1.z, c2.z) && z <= Math.max(c1.z, c2.z);}

    public boolean isInSphere(Point3D center, int radius) {
        int dx = x - center.x;
        int dy = y - center.y;
        int dz = z - center.z;
        return dx * dx + dy * dy + dz * dz <= radius * radius;}

    public void rotateX(double angleDegrees) {
        double a = Math.toRadians(angleDegrees);
        int newY = (int) Math.round(y * Math.cos(a) - z * Math.sin(a));
        int newZ = (int) Math.round(y * Math.sin(a) + z * Math.cos(a));
        y = newY;
        z = newZ;}

    public void rotateY(double angleDegrees) {
        double a = Math.toRadians(angleDegrees);
        int newX = (int) Math.round(x * Math.cos(a) + z * Math.sin(a));
        int newZ = (int) Math.round(-x * Math.sin(a) + z * Math.cos(a));
        x = newX;
        z = newZ;}

    public void rotateZ(double angleDegrees) {
        rotate(angleDegrees); }
}

public class Main {

    public static void main(String[] args) {
        Point p = new Point(3, 4);
        System.out.println("Point: " + p);
        System.out.println("Distance: " + p.distanceFromOrigin());
        p.rotate(90);
        System.out.println("After rotate 90°: " + p);

        System.out.println();

        Point3D p3 = new Point3D(1, 2, 3);
        System.out.println("Point3D: " + p3);
        System.out.println("Distance: " + p3.distanceFromOrigin());

        p3.rotateX(90);
        System.out.println("Rotate X 90°: " + p3);

        p3.rotateY(90);
        System.out.println("Rotate Y 90°: " + p3);

        p3.rotateZ(90);
        System.out.println("Rotate Z 90°: " + p3);}
}
