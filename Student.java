import java.util.Scanner;

public class Student {
    private int roll;
    private String name;
    private double cgpa;

    public Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of students: ");
            int n = scanner.nextInt();

            Student[] students = new Student[n];
            double minCgpa = Double.MAX_VALUE;
            String lowestCgpaName = "";

            for (int i = 0; i < n; i++) {
                System.out.println("Enter the details of student " + (i + 1) + ":");
                System.out.print("Roll: ");
                int roll = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("CGPA: ");
                double cgpa = scanner.nextDouble();
                scanner.nextLine();

                students[i] = new Student(roll, name, cgpa);

                if (cgpa < minCgpa) {
                    minCgpa = cgpa;
                    lowestCgpaName = name;
                }
            }

            System.out.println("Details of all students:");
            for (int i = 0; i < n; i++) {
                Student student = students[i];
                System.out.println(
                        "Roll: " + student.getRoll() + ", Name: " + student.getName() + ", CGPA: " + student.getCgpa());
            }

            System.out.println("The name of the student with the lowest CGPA is: " + lowestCgpaName);
        }
    }
}
