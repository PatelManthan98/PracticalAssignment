package Prac2;

public class TestPolygon
{
    public static void main(String[] args) {
        Regularpolygon p1 = new Regularpolygon();
         Regularpolygon p2 = new Regularpolygon(5, 10);
         Regularpolygon p3 = new Regularpolygon(20, 98, 7, 16);

         System.out.println("Polygon 1");
         p1.print();
         System.out.println("Polygon 2");
         p2.print();
         System.out.println("Polygon 3");
         p3.print();
    }
}
