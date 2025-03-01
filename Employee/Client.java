public class Client extends Person {
    private String preferredContactMethod;
    private String phoneNumber;

    public Client(String firstName, String lastName, String dateOfBirth, String email, String preferredContactMethod, String phoneNumber) {
        super(firstName, lastName, dateOfBirth, email);
        this.preferredContactMethod = preferredContactMethod;
        this.phoneNumber = phoneNumber;
    }
}
