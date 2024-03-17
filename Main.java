
class CourseInformation extends Student {
    private String semester;
    private int marks;

    public CourseInformation(String name, int age, String semester, int marks) {
        super(name, age);
        this.semester = semester;
        this.marks = marks;
    }

    public void displayCourseInfo() {
        System.out.println("Semester: " + semester);
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a student object
        // Date dob = new Date(2000, 5, 15);
        Student student = new Student("John Doe", 24);

        // Displaying student information
        System.out.println("Student Information:");
        student.displayInfo();

        // Creating course information object
        CourseInformation courseInfo = new CourseInformation("Jane Doe", 21, "Semester 1", 85);

        // Displaying course information
        System.out.println("\nCourse Information:");
        courseInfo.displayInfo(); // Accessing parent class method
        courseInfo.displayCourseInfo(); // Accessing child class method
    }
}
