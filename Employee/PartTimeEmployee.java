public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String firstName, String lastName, String dateOfBirth, String email, String employeeId, String dateOfEmployment, double hourlyRate) {
        super(firstName, lastName, dateOfBirth, email, employeeId, dateOfEmployment);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = 0;
    }

    // Add getters for hourlyRate and hoursWorked
    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hours) throws InvalidArgumentException {
        if (hours < 0 || hours > Configuration.MAX_PART_TIME_HOURS) {
            throw new InvalidArgumentException("Invalid number of hours worked.");
        }
        this.hoursWorked = hours;
    }

    @Override
    public double computeSalary() throws MissingInformationException {
        if (hoursWorked == 0) {
            throw new MissingInformationException("Hours worked is missing.");
        }
        return hourlyRate * hoursWorked;
    }
}