public class Main {
    private String name;
    private int rollNumber;
    private int marks;
    private double gpa;

    public Main(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.gpa = calculateGPA();
    }

    private double calculateGPA() {
        // Assuming a scale of 0-100 for marks and 0-4 for GPA
        return (double) marks / 25;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("GPA: " + gpa);
    }

    public static void main(String[] args) {
        Main student = new Main("Priya Sinha", 12, 97);
        student.displayDetails();

    }
}
