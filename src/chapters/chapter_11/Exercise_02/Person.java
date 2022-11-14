package chapters.chapter_11.Exercise_02;

public class Person {

    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;

    public Person(){

        this("Default", "Not Mentioned", "Unknown", "Not mentioned");
    }

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nTHIS IS THE PERSON CLASS\nName: " + getName() + "\nAddress: " + getAddress() +
                "\nPhone number: " + getPhoneNumber() + "\nEmail address: " + getEmail();
    }
}
