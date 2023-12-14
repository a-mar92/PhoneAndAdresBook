import java.util.List;
import java.util.Scanner;

public class AdressBookConsol {
    //*Scanner
    //*Display
    AdresBookData adresBookData;
    public AdressBookConsol(AdresBookData adresBookData) {
        this.adresBookData = adresBookData;}
    Scanner scanner = new Scanner(System.in);

    public Scanner getScanner() {
        return scanner;
    }

    public void displayContact(){
        for (Contact contact: adresBookData.getContacts()
        ) {

            System.out.println("number of contact :" + Integer.valueOf( adresBookData.getContacts().indexOf(contact)+1));
            System.out.println("name: "+contact.getName());
            System.out.println("adress: " + contact.getAdress());
            List<Long> phoneNumbers = contact.getPhoneNumbers();
            System.out.print("Phone numbers: ");
            for (Long phoneNumber : phoneNumbers) {
                System.out.print(phoneNumber + ", ");
            }
            System.out.println();

            }
        }
    }
