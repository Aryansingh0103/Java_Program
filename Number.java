import java.util.Scanner;

public class Number {
    private int[] arr;
    private int n;

    public Number(int n) {
        this.n = n;
        arr = new int[n];
    }

    public void read() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
        }
    }

    public void swap() {
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            } else if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
    }

    public void display() {
        System.out.println("The modified array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of integers: ");
            int n = scanner.nextInt();

            Number number = new Number(n);
            number.read();
            number.swap();
            number.display();
        }
    }
}
