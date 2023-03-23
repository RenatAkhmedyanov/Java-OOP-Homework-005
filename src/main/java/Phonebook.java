import java.util.ArrayList;
import java.util.Scanner;

public class Phonebook {
    public void addContact(ArrayList list) {
        System.out.println("Добавить новый контакт?");
        System.out.println("q - Выход, Enter - продолжение");
        Scanner scn = new Scanner(System.in);
        while (true) {
            String input = scn.nextLine();
            if (input.equals("q")) {
                break;
            } else {
                System.out.println("Введите номер телефона:");
                String inputPhone = scn.nextLine();
                System.out.println("Введите Имя:");
                String inputFirstName = scn.nextLine();
                System.out.println("Введите Фамилию:");
                String inputLastName = scn.nextLine();
                System.out.println("q - Выход, Enter - продолжение");
                list.add(new Contact(inputPhone, inputFirstName, inputLastName));
            }
        }
    }

    public void setAdditionalNumber(ArrayList<Contact> list) {
        System.out.println("Введите номер, фамилию или имя контакта");
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        for (Contact c : list) {
            if (c.contains(input)) {
                System.out.println("Введите номер: ");
                input = scn.nextLine();
                c.setPhoneNumber(input);
            }
        }
    }
    public void deleteContact(ArrayList list){
        System.out.println("Введите порядковый номер контакта для удаления");
        Scanner scan = new Scanner(System.in);
        int in = scan.nextInt();
        list.remove(in - 1);
    }

    public void searchContact(ArrayList<Contact> list){
        System.out.println("Введите номер, фамилию или имя контакта");
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        for (Contact c : list) {
            if (c.contains(input)) {
                c.print();
            }
        }
    }
}
