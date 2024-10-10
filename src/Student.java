public class Student {
    private String name;  // Name of the student
    private int id;       // Unique ID for the student

    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getter for student name
    public String getName() {
        return name;
    }

    // Getter for student ID
    public int getId() {
        return id;
    }
}
