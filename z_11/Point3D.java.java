public class Point3D extends Point {

    protected int z;

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
        return (int)Math.round(Math.sqrt(x * x + y * y + z * z));}

    public boolean isInBox(Point3D a, Point3D b) {
        int minX = Math.min(a.x, b.x);
        int maxX = Math.max(a.x, b.x);
        int minY = Math.min(a.y, b.y);
        int maxY = Math.max(a.y, b.y);
        int minZ = Math.min(a.z, b.z);
        int maxZ = Math.max(a.z, b.z);

        return x >= minX && x <= maxX &&
               y >= minY && y <= maxY &&
               z >= minZ && z <= maxZ;}

    public boolean isInSphere(Point3D center, int radius) {
        int dx = x - center.x;
        int dy = y - center.y;
        int dz = z - center.z;
        return dx * dx + dy * dy + dz * dz <= radius * radius;}
}
