// WashingMachine class that implements the Motor interface
public class WashingMachine implements Motor {
    @Override
    public void run() {
        System.out.println("Washing machine motor is running.");
    }

    @Override
    public void consume() {
        System.out.println("Washing machine is consuming power.");
    }

    public static void main(String[] args) {
        System.out.println("Capacity of washing machine: " + Motor.capacity);
    }
}
