import java.util.ArrayList;
import java.util.List;

public class AttendanceManager {
    private List<Student> students; // List of students
    private Attendance attendance;   // Attendance object to manage attendance records

    // Constructor
    public AttendanceManager() {
        students = new ArrayList<>(); // Initialize the student list
        attendance = new Attendance();  // Initialize the attendance manager
    }

    // Method to add a student
    public void addStudent(String name, int id) {
        students.add(new Student(name, id)); // Add new student to the list
        System.out.println("Added student: " + name);
    }

    // Method to mark attendance for a student
    public void markAttendance(int id, boolean isPresent) {
        for (Student student : students) {
            if (student.getId() == id) {
                attendance.markAttendance(student, isPresent); // Mark attendance
                System.out.println("Marked attendance for: " + student.getName() + " as " + (isPresent ? "Present" : "Absent"));
                return; // Exit after marking attendance
            }
        }
        System.out.println("Student with ID " + id + " not found."); // If student not found
    }

    // Method to display attendance records
    public void displayAttendance() {
        attendance.displayAttendance(); // Display attendance records
    }
}
