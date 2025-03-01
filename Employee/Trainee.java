public class Trainee extends Employee {
    private double score;

    public Trainee(String firstName, String lastName, String dateOfBirth, String email, String employeeId, String dateOfEmployment) {
        super(firstName, lastName, dateOfBirth, email, employeeId, dateOfEmployment);
    }

    // Add getter for score
    public double getScore() {
        return score;
    }

    public void setScore(double score) throws InvalidArgumentException {
        if (score < 0 || score > 1) {
            throw new InvalidArgumentException("Invalid score for trainee.");
        }
        this.score = score;
    }

    @Override
    public double computeSalary() throws MissingInformationException {
        if (score == 0) {
            throw new MissingInformationException("Score for trainee is missing.");
        }
        return Configuration.TRAINEE_RATE * score;
    }
}