public class Contact {

    private String phoneNumber;
    private String firstName;
    private String lastName;

    public Contact(String phoneNumber, String firstName, String lastName) {
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) {
        return this.firstName.equals(obj) && this.lastName.equals(obj);
    }
    public boolean contains(String str) {
        return this.phoneNumber.contains(str) || this.firstName.contains(str) || this.lastName.contains(str);
    }

    public void print() {
        System.out.println(this.phoneNumber + " " + this.firstName + " " + this.lastName);
    }
}
