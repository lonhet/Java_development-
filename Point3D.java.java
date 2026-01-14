public class Point3D extends Point {

    protected double z;

    public Point3D() {
        this(0, 0, 0);}

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;}

    public void setLocation(double x, double y, double z) {
        super.setLocation(x, y);
        this.z = z;}

    public double getZ() { return z; }

    public void rotateX(double angle) {
        double newY = y * Math.cos(angle) - z * Math.sin(angle);
        double newZ = y * Math.sin(angle) + z * Math.cos(angle);
        y = newY;
        z = newZ;}

    public void rotateY(double angle) {
        double newX = x * Math.cos(angle) + z * Math.sin(angle);
        double newZ = -x * Math.sin(angle) + z * Math.cos(angle);
        x = newX;
        z = newZ;}

    public void rotateZ(double angle) {
        double newX = x * Math.cos(angle) - y * Math.sin(angle);
        double newY = x * Math.sin(angle) + y * Math.cos(angle);
        x = newX;
        y = newY;}

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";}
}
