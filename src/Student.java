//Elijah Chandler
/**
 * A subclass of Person that represents a Student
 *
 * Created for Menlo School CS2
 *
 * @author: Ms. Namasivayam & Mr. Blick
 * @version: 2022-2023
 */
public class Student extends Person
{
    private int grade;
    /* Student constructor that takes in the first and last name of the student as well as their phone number and grade/
    it puts the firstName, lastName, and phoneNumber into the constructor of the superclass
     */
    public Student(String firstName, String lastName, String phoneNumber, int grade)
    {
        super(firstName, lastName, phoneNumber);
        this.grade = grade;
    }
    public int getGrade()
    {
        return grade;
    }
    //overrides the person tostring and prints outs the superclass tostring and the grade
    @Override
    public String toString()
    {

        return super.toString() + " " + grade;
    }
    // TODO: Modify and complete this class
}
