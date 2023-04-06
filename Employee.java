public class Employee {
    protected int empid;

    public float earnings(int empid, String ename, int basic) {
        float t = 1.95f * basic;
        System.out.println("\nEmployee ID = " + empid);

        System.out.println("Employee Name = " + ename);
        return t;
    }
}