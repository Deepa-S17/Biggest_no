import java.util.Date;

class Student {
    protected String name;
    protected int age;
    // protected Date dob;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        // this.dob = dob;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        // System.out.println("Date of Birth: " + dob);
    }
}
