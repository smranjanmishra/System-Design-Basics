public class StudentAttendanceSystem {
    public static void main(String[] args) {
        AttendanceManager manager = new AttendanceManager(); // Create attendance manager

        // Adding students
        manager.addStudent("Alice", 1);
        manager.addStudent("Bob", 2);
        manager.addStudent("Charlie", 3);

        // Marking attendance
        manager.markAttendance(1, true);   // Alice is present
        manager.markAttendance(2, false);  // Bob is absent
        manager.markAttendance(3, true);   // Charlie is present

        // Displaying attendance
        manager.displayAttendance(); // Show attendance records
    }
}