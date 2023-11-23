import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String name;
    private String adress;
     private List<Long> phoneNumbers;
//     private long phoneNumberHome;

    public Contact(String name, String adress) {
        this.name = name;
        this.adress = adress;
        this.phoneNumbers = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }



    public void addPhoneNumber(long phoneNumber){
        phoneNumbers.add(phoneNumber);
    }

    public List<Long> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setPhoneNumbers(List<Long> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void displayContact(){
        System.out.println("name " +name);
        System.out.println("Adress "+ adress);

        System.out.println("Phone numbers:");
        for (Long phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);}
    }
    public void clearPhoneNumbers() {
        this.phoneNumbers.clear();
    }
}

