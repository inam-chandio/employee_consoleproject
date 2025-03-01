public class FullTimeEmployee extends Employee {
    private double salary;

    public FullTimeEmployee(String firstName, String lastName, String dateOfBirth, String email, String employeeId, String dateOfEmployment, double salary) {
        super(firstName, lastName, dateOfBirth, email, employeeId, dateOfEmployment);
        this.salary = salary;
    }

    @Override
    public double computeSalary() {
        return salary;
    }
}
