public class AdressBookLogic {
    String name;
    /*
     *  addContact ++
     *  deleteContact ++
     *  editContact
     *  findByName ++
     */
    AdressBookConsol adressBookConsol;
    AdresBookData adresBookData;

    public AdressBookLogic(AdressBookConsol adressBookConsol, AdresBookData adresBookData) {
        this.adressBookConsol = adressBookConsol;
        this.adresBookData = adresBookData;
    }

    public void addContactName() {
        System.out.println("add Name:");
        this.name = adressBookConsol.getScanner().nextLine();
        System.out.println("give adress");
        String adress = adressBookConsol.getScanner().nextLine();
        Contact contact = new Contact(name, adress);
        System.out.println("How many phone numbers do you want to add?");
        int numOfPhoneNumbers = adressBookConsol.scanner.nextInt();
        adressBookConsol.scanner.nextLine();
        for (int i = 0; i < numOfPhoneNumbers; i++) {
            System.out.println("Enter phone number " + (i + 1) + ":");
            long phoneNumber = adressBookConsol.scanner.nextLong();
            adressBookConsol.scanner.nextLine();
            contact.addPhoneNumber(phoneNumber);
        }
        adresBookData.addContact(contact);
        adresBookData.addToContactPhone(name, contact);
    }

    public void displayContatctByName() {
        System.out.println("Enter Name:");
        String enteredName = adressBookConsol.getScanner().nextLine();
        Contact contact = adresBookData.getContactPhone().get(enteredName);

        if (contact != null) {
            contact.displayContact();

        } else {
            System.out.println("Contact not found for the entered name.");
        }

    }
    public void deleteContact() {
        System.out.println("Enter Name:");
        String enteredName = adressBookConsol.getScanner().nextLine();
        Contact removedContact = adresBookData.getContactPhone().remove(enteredName);
        adresBookData.getContacts().remove(enteredName);
        boolean removed = false;
        for (Contact contact : adresBookData.getContacts()) {
            if (contact.getName().equals(enteredName)) {
                adresBookData.getContacts().remove(contact);
                removed = true;
                break;
            }
        }
        if (removedContact != null && removed) {
            System.out.println("removed contact : " + removedContact.getName());
        } else
            System.out.println("Contact not found for the entered name.");

        System.out.println("done");

    }

    public void editContatctByPhoneNumber(){

        if (adresBookData.getContacts().isEmpty()) {
            System.out.println("Empty contact list. Cannot edit contacts.");
            return;
        }


        System.out.println("Enter contact name to edit:");
        String enteredName = adressBookConsol.getScanner().nextLine();

        Contact contact = adresBookData.getContactPhone().get(enteredName);

        if (contact != null) {
            contact.displayContact();

            System.out.println("Enter new name:");
            String newName = adressBookConsol.getScanner().nextLine();
            adresBookData.getContactPhone().remove(enteredName);
            contact.setName(newName);

            System.out.println("Enter new address:");
            String newAddress = adressBookConsol.getScanner().nextLine();
            contact.setAdress(newAddress);

            System.out.println("How many new phone numbers do you want to add?");
            int numOfPhoneNumbers = adressBookConsol.getScanner().nextInt();
            adressBookConsol.getScanner().nextLine();

            contact.clearPhoneNumbers();

            for (int i = 0; i < numOfPhoneNumbers; i++) {
                System.out.println("Enter new phone number " + (i + 1) + ":");
                long phoneNumber = adressBookConsol.getScanner().nextLong();
                adressBookConsol.getScanner().nextLine();
                contact.addPhoneNumber(phoneNumber);
            }

            System.out.println("Contact updated successfully.");
            adresBookData.getContactPhone().put(newName,contact);

        }else {
            System.out.println("Contact not found for the entered name.");
        }
    }



}
