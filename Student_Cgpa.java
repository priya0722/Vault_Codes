public class Student {
    private String name;
    private int rollNumber;
    private int marks;
    private double gpa;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.gpa = calculateGPA();
    }

    private double calculateGPA() {
        // Assuming a 4.0 scale and 100 point grading system
        if (marks >= 90) {
            return 4.0;
        } else if (marks >= 80) {
            return 3.0;
        } else if (marks >= 70) {
            return 2.0;
        } else if (marks >= 60) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("GPA: " + gpa);
    }
}
