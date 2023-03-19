import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Phonebook phonebook = new Phonebook();
        ArrayList<Contact> contactsList = new ArrayList<>();
        phonebook.readFromFile(contactsList);
        Menu menu = new Menu();

        while (true) {
            menu.mainMenu();
            Scanner scn = new Scanner(System.in);
            String input = scn.nextLine();
            if (input.equals("q")) {
                break;
            } else if (input.equals("1")) {
                for (int i = 0; i < contactsList.size(); i++) {
                    System.out.print(i + 1 + ". ");
                    contactsList.get(i).print();
                }

                System.out.println("Enter для продолжения...");
                input = scn.nextLine();

            } else if (input.equals("2")) {
                phonebook.addContact(contactsList);
            } else if (input.equals("3")) {
                System.out.println("Введите номер, фамилию или имя контакта");
                input = scn.nextLine();
                for (Contact c : contactsList) {
                    if (c.contains(input)) {
                        c.print();
                    }
                }
                System.out.println("Enter для продолжения...");
                input = scn.nextLine();
            } else if (input.equals("4")) {
                phonebook.deleteContact(contactsList);
                System.out.println("Enter для продолжения...");
                input = scn.nextLine();
            } else if (input.equals("5")) {
                phonebook.writeToFile(contactsList);
            }
        }
    }
}
