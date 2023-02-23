public class calculator {

    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int subtract(int a, int b, int c) {
        return a - b - c;
    }

    public static void main(String[] args) {
        calculator calculator = new calculator();

        int result1 = calculator.subtract(10, 5);
        System.out.println("Result 1: " + result1);

        double result2 = calculator.subtract(3.14, 1.0);
        System.out.println("Result 2: " + result2);

        int result3 = calculator.subtract(20, 5, 3);
        System.out.println("Result 3: " + result3);
    }
}
