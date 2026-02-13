public class Main {

    public static void main(String[] args) {

        Point p = new Point(3, 4);
        System.out.println("Point: " + p);
        System.out.println("Distance 2D: " + p.distanceFromOrigin());

        Point3D p3 = new Point3D(1, 2, 2);
        System.out.println("\nPoint3D: " + p3);
        System.out.println("Distance 3D: " + p3.distanceFromOrigin());

        p3.setLocation(5, 6);
        System.out.println("\nAfter setLocation(5,6): " + p3);

        Point3D a = new Point3D(0, 0, 0);
        Point3D b = new Point3D(10, 10, 10);

        System.out.println("\nIs in box: " + p3.isInBox(a, b));
        System.out.println("Is in sphere (r=5): " +
                p3.isInSphere(new Point3D(0,0,0), 5));}
}
