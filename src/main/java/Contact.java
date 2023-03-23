public class Contact implements Printable {

    private StringBuilder phoneNumber = new StringBuilder();
    private String firstName;
    private String lastName;

    public Contact(String phoneNumber, String firstName, String lastName) {
        this.phoneNumber.append(phoneNumber);
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public StringBuilder getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber.append("; " + phoneNumber);
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
        return this.phoneNumber.toString().contains(str) || this.firstName.contains(str) || this.lastName.contains(str);
    }

    @Override
    public void print() {
        System.out.println(this.phoneNumber + " " + this.firstName + " " + this.lastName);
    }
}
