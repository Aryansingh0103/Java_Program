import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;

            do {
                System.out.println("Choose a shape:");
                System.out.println("1. Circle");
                System.out.println("2. Square");
                System.out.println("3. Triangle");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter the radius of the circle: ");
                        double radius = scanner.nextDouble();
                        double areaOfCircle = Math.PI * Math.pow(radius, 2);
                        System.out.println("The area of the circle is: " + areaOfCircle);
                        break;
                    case 2:
                        System.out.print("Enter the length of one side of the square: ");
                        double length = scanner.nextDouble();
                        double areaOfSquare = Math.pow(length, 2);
                        System.out.println("The area of the square is: " + areaOfSquare);
                        break;
                    case 3:
                        System.out.print("Enter the base of the triangle: ");
                        double base = scanner.nextDouble();
                        System.out.print("Enter the height of the triangle: ");
                        double height = scanner.nextDouble();
                        double areaOfTriangle = 0.5 * base * height;
                        System.out.println("The area of the triangle is: " + areaOfTriangle);
                        break;
                    case 0:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid choice.");
                }
                System.out.println();
            } while (choice != 0);
        }
    }
}
