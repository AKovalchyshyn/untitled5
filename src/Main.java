// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Create Student and Employee instances
        Student student = new Student("Female", 15);
        Employee employee = new Employee("Male", 40);

        // Print information
        student.getInfo();
        employee.getInfo();
    }
}
