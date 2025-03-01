public abstract class Employee extends Person {
    private String employeeId;
    private String dateOfEmployment;

    public Employee(String firstName, String lastName, String dateOfBirth, String email, String employeeId, String dateOfEmployment) {
        super(firstName, lastName, dateOfBirth, email);
        this.employeeId = employeeId;
        this.dateOfEmployment = dateOfEmployment;
    }

    // Add getters for employeeId and dateOfEmployment
    public String getEmployeeId() {
        return employeeId;
    }

    public String getDateOfEmployment() {
        return dateOfEmployment;
    }

    public abstract double computeSalary() throws MissingInformationException, InvalidArgumentException;
}