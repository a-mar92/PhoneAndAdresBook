import java.util.*;

public class AdresBookData {
    private List<Contact> contacts = new ArrayList<>();
    private Set<Long> workPhoneNumbers = new HashSet<>();
    private Set<Long> homePhoneNumbers = new HashSet<>();

    private Map<String,Contact> contactPhone = new HashMap<>();


    public void addContact(Contact contact){
        contacts.add(contact);
    }
    public void addToContactPhone(String name, Contact contact ){
        contactPhone.put(name,contact);
    }

    public List<Contact> getContacts() {
        return this.contacts;
    }

    public Map<String, Contact> getContactPhone() {
        return contactPhone;
    }
}

