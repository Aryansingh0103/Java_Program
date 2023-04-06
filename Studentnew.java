// Abstract class Student
public abstract class Student {
    private int rollNo;
    private int regNo;

    public Student(int rollNo, int regNo) {
        this.rollNo = rollNo;
        this.regNo = regNo;
    }

    // Abstract method
    public abstract void course();

    // Getters and setters
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }
}
