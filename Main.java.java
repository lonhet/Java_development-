public class Main {

    public static void main(String[] args) {

        Point p = new Point(1, 0);
        p.rotate(Math.PI / 2); 
        System.out.println("2D rotate: " + p);

        Point3D p3 = new Point3D(1, 1, 1);

        p3.rotateX(Math.PI / 2);
        System.out.println("After X: " + p3);

        p3.rotateY(Math.PI / 2);
        System.out.println("After Y: " + p3);

        p3.rotateZ(Math.PI / 2);
        System.out.println("After Z: " + p3);}
}
