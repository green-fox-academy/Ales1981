import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TelephoneBook2 {
    public static void main(String [] args){
        /*
        Create a map with the following key-value pairs.

        Name (key)	Phone number (value)
        William A. Lathan	405-709-1865
        John K. Miller	402-247-8568
        Hortensia E. Foster	606-481-6467
        Amanda D. Newland	319-243-5613
        Brooke P. Askew	307-687-2982

        Create an application which solves the following problems.

            What is John K. Miller's phone number?
            Whose phone number is 307-687-2982?
            Do we know Chris E. Myers' phone number?

         */

        HashMap<String,String> phoneBook = new HashMap<>();
        phoneBook.put("William A. Lathan","405-709-1865");
        phoneBook.put("John K. Miller","402-247-8568");
        phoneBook.put("Hortensia E. Foster","606-481-6467");
        phoneBook.put("Amanda D. Newland","319-243-5613");
        phoneBook.put("Brooke P. Askew","307-687-2982");

        System.out.println("----------");
        System.out.println("Hello, i am your phonebook-bot.");
        System.out.println("----------");
        System.out.println("Please, what do you want me to do?");
        System.out.println("----------");
        System.out.println("Press 1 - to look for a number in the phonebook");
        System.out.println("Press 2 - to look for a name in the phonebook");
        System.out.println("Press 3 - to add new contact to the phonebook");
        System.out.println("Press 4 - to see the list of contacts");
        System.out.println("Press 5 - to end phonebook");
        System.out.println("----------");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice){
            case 1:
                lookForNumberByName(phoneBook);
                break;
            case 2:
                lookForNameByNumber(phoneBook);
                break;
            case 3:
                addNewContact(phoneBook); // this doesn't work yet
                break;
            case 4:
                toSeeList(phoneBook);
                break;
            case 5:
                System.out.println("phonebook ends");
                //exit;

        }



    }

    private static void toSeeList(HashMap<String, String> phoneBook) {
        System.out.println("Contacts stored: ");
        for ( String name : phoneBook.keySet()) {
            System.out.println(name+": "+phoneBook.get(name));
        }

    }

    private static void addNewContact(HashMap<String, String> phoneBook) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please, write here new contact to add to the phonebook: ");
        System.out.println("First add name: ");
        String name = scanner.nextLine();
        System.out.println("Second add number: ");
        String number = scanner.nextLine();
        phoneBook.put(""+name, ""+number);

    }

    private static void lookForNameByNumber(HashMap<String, String> phoneBook) {
        System.out.println("please, write the number and i will look for his/her name ");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        if (phoneBook.containsValue(number)) {
            for ( Map.Entry<String,String> entry : phoneBook.entrySet()) {
                if (entry.getValue().equals(number)){
                    System.out.println("i have it here "+entry.getKey());
                }
            }
        }
        else {
            System.out.println("I don't know this number.");
        }
    }

    private static void lookForNumberByName(HashMap<String, String> phoneBook) {
        System.out.println("please, write the name and i will look for his/her number ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("contact: "+name+"has this number: "+phoneBook.get(name));
    }


}

