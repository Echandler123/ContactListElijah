import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class that stores subclasses of Person as a contact list.
 * The user is presented with a menu of options and may add, sort,
 * search, or list the contacts.
 *
 * Created for Menlo School CS2
 *
 * @author: Ms. Namasivayam & Mr. Blick
 * @version: 2022-2023
 */

public class ContactList
{
    // TODO: Create your array contacts
    private ArrayList<Person> contacts;
    // TODO: Write a Constructor
    public ContactList()
    {
        contacts = new ArrayList<Person>();
    }

    public void printMenuOptions() {
        System.out.println("Menu: ");
        System.out.println("1. Add Contact");
        System.out.println("2. List All Contacts By First Name");
        System.out.println("3. List All Contacts By Last Name");
        System.out.println("4. List All Contacts By Phone Number");
        System.out.println("5. List All Students");
        System.out.println("6. Search By First Name");
        System.out.println("7. Search By Last Name");
        System.out.println("8. Search by Phone Number");
        System.out.println("0. Exit");
    }

    /**
     * Asks user for input to create and add a new Person
     * to the contact list
     */
    public void addContact() {
        // TODO: Complete the addContact method
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select the type of contact to add:");
        System.out.println("1. Student");
        System.out.println("2. Teacher");
        int choice = sc.nextInt();
        if(choice == 1)
        {
            System.out.println("Please fill in the following information.");
            System.out.println("First Name:");
            sc.nextLine();
            String firstName = sc.nextLine();
            System.out.println("Last Name:");
            String lastName = sc.nextLine();
            System.out.println("Grade:");
            int grade = sc.nextInt();
            System.out.println("Phone Number:");
            sc.nextLine();
            String phoneNumber = sc.nextLine();
            Student s = new Student(firstName,lastName,phoneNumber,grade);
            contacts.add(s);
        }
        else
        {
            System.out.println("Please fill in the following information.");
            System.out.println("First Name:");
            String firstName = sc.nextLine();
            System.out.println("Last Name:");
            String lastName = sc.nextLine();
            System.out.println("subject:");
            String subject = sc.nextLine();
            System.out.println("Phone Number:");
            String phoneNumber = sc.nextLine();
            Teacher t = new Teacher(firstName,lastName,phoneNumber, subject);
            contacts.add(t);
        }
    }

    /**
     * Loops through and prints all contacts
     */
    public void printContacts() {
        // TODO: Complete the printContacts method
        for(int i =0; i < contacts.size(); i++)
        {
            System.out.println(contacts.get(i));
        }
    }

    /**
     * Bubble sorts the contacts in the list by firstName,
     * lastName, or phoneNumber
     * @param sortBy: 0=firstName, 1=lastName, 2=phoneNumber
     */
    public void sort(int sortBy) {
        // TODO: Complete the sort method
        if(sortBy == 0)//first name
        {
            int n = contacts.size();
            for(int i=0; i<n-1; i++) {
                for(int j=0; j<n-i-1; j++){
                    if (contacts.get(j).getFirstName().compareTo(contacts.get(j+ 1).getFirstName()) > 0)
                        contacts.add(j,contacts.get(j + 1));
                        contacts.remove(j + 2);
                }
            }
        }
        else if(sortBy == 1) //last name
        {
            int n = contacts.size();
            for(int pass = 1; pass < n; pass++) {
                for(int comp = 0; comp < n - pass; comp++){
                    if (contacts.get(comp).getLastName().compareTo(contacts.get(comp + 1).getLastName()) > 0)
                        contacts.add(comp,contacts.get(comp + 1));
                    contacts.remove(comp + 2);
                }
            }
        }
        else if(sortBy == 2)//phonenumber
        {
            int n = contacts.size();
            for(int pass = 1; pass < n; pass++) {
                for(int comp = 0; comp < n - pass; comp++){
                    if (contacts.get(comp).getPhoneNumber().compareTo(contacts.get(comp + 1).getPhoneNumber()) > 0)
                        contacts.add(comp,contacts.get(comp + 1));
                        contacts.remove(comp + 2);
                    }
                }
            }

        }


    // TODO: Write searchByFirstName
    public Person searchByFirstName(String firstName)
    {
         for(int i = 0; i < contacts.size(); i++)
         {
             if(firstName.equals(contacts.get(i).getFirstName()))
             {
                 return contacts.get(i);
             }
         }
         return null;
    }


    // TODO: Write searchByLastName
    public Person searchByLastName(String lastName)
    {
        for(int i = 0; i < contacts.size(); i++)
        {
            if(lastName.equals(contacts.get(i).getLastName()))
            {
                return contacts.get(i);
            }
        }
        return null;
    }

    // TODO: Write searchByPhoneNumber
    public Person searchByPhoneNumber(String phoneNumber)
    {
        for(int i = 0; i < contacts.size(); i++)
        {
            if(phoneNumber.equals(contacts.get(i).getPhoneNumber()))
            {
                return contacts.get(i);
            }
        }
        return null;
    }

    /**
     * Lists just the Student objects in the Contact List
     */
    public void listStudents() {
        // TODO: Complete the listStudents method
        for(int i =0; i < contacts.size(); i++)
        {
            if (contacts.get(i) instanceof Student)
            {
                System.out.println(contacts.get(i));
            }
        }
    }

    /**
     * Loops providing menu options to the user
     * until the user exits
     */
    public void run() {
        Scanner sc = new Scanner(System.in);
        int input = -1;
        System.out.println("Welcome to your Contacts List");
        System.out.println("Please pick from the following menu options");

        while(input != 0) {
            printMenuOptions();
            input = sc.nextInt();
            if (input == 1) {
                this.addContact();
            }
            if (input == 2) {
                sort(1);
                printContacts();
            }
            if (input == 3) {
                sort(2);
                printContacts();
            }
            if (input == 4) {
                sort(0);
                printContacts();
            }
            if (input == 5) {
                listStudents();
            }
            if (input == 6) {
                System.out.println("Enter a name");
                String name = sc.nextLine();
                searchByFirstName(name);
            }
            if (input == 7) {
                System.out.println("Enter a last name");
                String lastname = sc.nextLine();
                searchByLastName(lastname);
            }
            if (input == 8) {
                System.out.println("Enter a phone number");
                String phonenumber = sc.nextLine();
                searchByPhoneNumber(phonenumber);
            }
        }
        // TODO: Complete the run method
    }


    public static void main(String[] args)
    {
        ContactList cl = new ContactList();
        cl.run();
    }
}
