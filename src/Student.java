/**
 * A subclass of Person that represents a Student
 *
 * Created for Menlo School CS2
 *
 * @author: Ms. Namasivayam & Mr. Blick
 * @version: 2022-2023
 */

public class Student {
    private int grade;
    public Student(String firstName, String lastName, int PhoneNumber, int grade)
    {
        super(firstName,lastName, PhoneNumber);
        this.grade = grade;
    }
    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return super.toString() + " " + grade;
    }
    // TODO: Modify and complete this class
}
