package account;

public class Student {

    private final String name;
    private final int studentID;
    private double gpa;

    public Student(String name, int studentID, double gpa) {
        this.name = name;
        this.studentID = studentID;
        this.gpa = gpa;
    }

    public void updateGPA(double gpa) {
        this.gpa = gpa;
    }

    public double getGPA() {
        return this.gpa;
    }

    // Remove `pay` method, as it doesn't make sense for a Student to have one
}
