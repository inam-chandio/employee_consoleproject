import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            AppLogger.logSystemStart();

            FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Turki", "Mohammed", "1990-01-01", "turkimohammed@gmail.com", "E123", "2022-06-01", 5000.0);
            PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Khaled", "Ali", "1995-02-02", "khaledali@gmail.com", "E124", "2022-06-01", 20.0);
            partTimeEmployee.setHoursWorked(160);
            Trainee trainee = new Trainee("Mahmood", "Ali", "1998-03-03", "mahmood@gmail.com", "T125", "2022-06-01");
            trainee.setScore(0.8);

            // Output detailed information for each employee
            System.out.println("===== EMPLOYEE DETAILS =====");

            // Full-time employee details
            System.out.println("\n----- FULL-TIME EMPLOYEE -----");
            System.out.println("Name: " + fullTimeEmployee.getFirstName() + " " + fullTimeEmployee.getLastName());
            System.out.println("Date of Birth: " + fullTimeEmployee.getDateOfBirth());
            System.out.println("Email: " + fullTimeEmployee.getEmail());
            System.out.println("Employee ID: " + fullTimeEmployee.getEmployeeId());
            System.out.println("Date of Employment: " + fullTimeEmployee.getDateOfEmployment());
            System.out.println("Salary: $" + fullTimeEmployee.computeSalary());

            // Part-time employee details
            System.out.println("\n----- PART-TIME EMPLOYEE -----");
            System.out.println("Name: " + partTimeEmployee.getFirstName() + " " + partTimeEmployee.getLastName());
            System.out.println("Date of Birth: " + partTimeEmployee.getDateOfBirth());
            System.out.println("Email: " + partTimeEmployee.getEmail());
            System.out.println("Employee ID: " + partTimeEmployee.getEmployeeId());
            System.out.println("Date of Employment: " + partTimeEmployee.getDateOfEmployment());
            System.out.println("Hourly Rate: $" + partTimeEmployee.getHourlyRate());
            System.out.println("Hours Worked: " + partTimeEmployee.getHoursWorked());
            System.out.println("Salary: $" + partTimeEmployee.computeSalary());

            // Trainee details
            System.out.println("\n----- TRAINEE -----");
            System.out.println("Name: " + trainee.getFirstName() + " " + trainee.getLastName());
            System.out.println("Date of Birth: " + trainee.getDateOfBirth());
            System.out.println("Email: " + trainee.getEmail());
            System.out.println("Employee ID: " + trainee.getEmployeeId());
            System.out.println("Date of Employment: " + trainee.getDateOfEmployment());
            System.out.println("Score: " + trainee.getScore());
            System.out.println("Salary: $" + trainee.computeSalary());

        } catch (Exception e) {
            AppLogger.logException(e);
            System.out.println("Error: " + e.getMessage());
        } finally {
            AppLogger.logSystemStop();
        }
    }
}