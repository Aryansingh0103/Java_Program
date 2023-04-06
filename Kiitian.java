// Subclass Kiitian
public class Kiitian extends Student {

    public Kiitian(int rollNo, int regNo) {
        super(rollNo, regNo);
    }

    // Implementation of abstract method from parent class
    @Override
    public void course() {
        System.out.println("I am enrolled in the Computer Science course.");
    }
}
