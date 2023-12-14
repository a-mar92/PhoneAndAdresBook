import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        AdresBookData adresBookData = new AdresBookData();
        AdressBookConsol adressBookConsol = new AdressBookConsol(adresBookData);
        AdressBookLogic adressBookLogic = new AdressBookLogic(adressBookConsol, adresBookData);

        boolean chooseMenu = true;


        String name;
        while (chooseMenu) {
            System.out.println("Phone and Aress Book");
            System.out.println("0 - Show adress Book");
            System.out.println("1 - add contact");
            System.out.println("2 - delete contact");
            System.out.println("3 - edit contact");
            System.out.println("4 - find contact");
            System.out.println("5 - exit");

            System.out.println("");
            Integer menu = Integer.valueOf(scanner.nextInt());
            switch (menu) {
                case 0:
                    adressBookConsol.displayContact();
                    break;
                case 1:

                    adressBookLogic.addContactName();
                    break;
                case 2:
                    adressBookLogic.deleteContact();
                    break;
                case 3:
                 adressBookLogic.editContatctByPhoneNumber();
                    break;
                case 4:
                    adressBookLogic.displayContatctByName();
                    break;
                case 5:
                    System.out.println("exit");
                    chooseMenu = false;
                    break;
                default:
                    System.out.println("error");
            }
        }
    }
}
