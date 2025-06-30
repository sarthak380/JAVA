package tester;

import java.util.Scanner;
import com.app.gemetry.Point2d;

public class TestPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x and y for Point 1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x and y for Point 2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        Point2d p1 = new Point2d(x1, y1);
        Point2d p2 = new Point2d(x2, y2);

        System.out.println("Point 1: " + p1.getDetails());
        System.out.println("Point 2: " + p2.getDetails());

        if (p1.isEqual(p2)) {
            System.out.println("Both points are at the same location.");
        } else {
            System.out.println("Points are at different locations.");
            double distance = p1.calculateDistance(p2);
            System.out.printf("Distance between the points: %.2f\n", distance);
        }

        sc.close();
    }
}
