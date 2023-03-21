public class MyClass {
    static int count = 0;

    public MyClass() {
        count++;
    }

    public static void main(String[] args) {
        new MyClass();
        new MyClass();
        new MyClass();
        System.out.println("Number of objects created: " + count);
    }
}
