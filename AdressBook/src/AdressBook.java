import java.util.*;

public class AdressBook {

Scanner scanner = new Scanner(System.in);
String name;
   private List<Contact> contacts = new ArrayList<>();
   private Set<Long> workPhoneNumbers = new HashSet<>();
   private Set<Long> homePhoneNumbers = new HashSet<>();

   private Map<String,Contact> contactPhone = new HashMap<>();



    public void addContactName() {
        System.out.println("add Name:");
       this.name = scanner.nextLine();

        System.out.println("give adress");
        String adress = scanner.nextLine();
        Contact contact = new Contact(name,adress);
        System.out.println("How many phone numbers do you want to add?");
        int numOfPhoneNumbers = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numOfPhoneNumbers; i++) {
            System.out.println("Enter phone number " + (i + 1) + ":");
            long phoneNumber = scanner.nextLong();
            scanner.nextLine();
            contact.addPhoneNumber(phoneNumber);
            contactPhone.put(name, contact);
        }


        contacts.add(contact);

    }
    public void displayContatctByPhoneNumber(){
        System.out.println("Enter Name:");
        String enteredName = scanner.nextLine();

        Contact contact = contactPhone.get(enteredName);

        if (contact != null) {
            contact.displayContact();

            System.out.println("Contact not found for the entered name.");
        }else {
            }
    }

public void deleteContact(){
    System.out.println("Enter Name:");
    String enteredName = scanner.nextLine();
    Contact removedContact = contactPhone.remove(enteredName);
    contacts.remove(enteredName);
    boolean removed = false;
    for (Contact contact : contacts) {
        if (contact.getName().equals(enteredName)) {
            contacts.remove(contact);
            removed = true;
            break;
        }}
    if (removedContact!=null&&removed){
        System.out.println("removed contact : " + removedContact.getName());
    }
    else
        System.out.println("Contact not found for the entered name.");

    System.out.println("done");
}
    public void displayContact(){
        for (Contact contacts: contacts
             ) {contacts.displayContact();


        }
    }




}
