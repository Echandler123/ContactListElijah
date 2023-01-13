/**
 * A class that represents a Person
 *
 * Created for Menlo School CS2
 *
 * @author: Ms. Namasivayam & Mr. Blick
 * @version: 2022-2023
 */

public class Person {
    String firstName;
    String lastName;
    String phoneNumber;
    public person(String firstName, String lastName, int PhoneNumber)
    {
        this.firstName  = firstName;
        this.lastName =  lastName;
        this.phoneNumber = phoneNumber;
    }
    // TODO: Complete the Person class

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return firstName + lastName + " - " + phoneNumber;
    }
}
