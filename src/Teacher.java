//Elijah Chandler
public class Teacher extends Person
{
        private String subject;
        /* Teacher constructor that the first and last name of the teacher as well as their phone number and the
        subject they teach. it puts the firstName, lastName, and phoneNumber into the constructor of the superclas
         */
        public Teacher(String firstName, String lastName, String phoneNumber, String subject)
        {
            super(firstName, lastName, phoneNumber);
            this.subject = subject;
        }
        public String getSubject()
        {
            return subject;
        }
        //overrides the person tostring and prints outs the superclass tostring and the subject they teach
        @Override
        public String toString()
        {
            return super.toString() + " " + subject;
        }
        // TODO: Modify and complete this class
    }
