import java.util.HashMap;
import java.util.Map;

public class Attendance {
    private Map<Integer, Boolean> attendanceRecord; // Map to store attendance record with student ID and status

    // Constructor
    public Attendance() {
        attendanceRecord = new HashMap<>(); // Initialize the attendance record
    }

    // Method to mark attendance
    public void markAttendance(Student student, boolean isPresent) {
        attendanceRecord.put(student.getId(), isPresent); // Add/Update attendance record
    }

    // Method to display attendance
    public void displayAttendance() {
        System.out.println("Attendance Record:");
        for (Map.Entry<Integer, Boolean> entry : attendanceRecord.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Present: " + (entry.getValue() ? "Yes" : "No"));
        }
    }
}
