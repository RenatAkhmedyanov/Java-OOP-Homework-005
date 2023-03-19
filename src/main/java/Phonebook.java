import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Phonebook implements Writing, Reading {
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
    public void deleteContact(ArrayList list){
        System.out.println("Введите порядковый номер контакта для удаления");
        Scanner scan = new Scanner(System.in);
        int in = scan.nextInt();
        list.remove(in - 1);
    }
    @Override
    public void writeToFile(ArrayList<Contact> contactsList) throws IOException {
        FileWriter writer = new FileWriter("phonebook.csv", false);
        for(Contact c  : contactsList) {
            writer.write(c.getPhoneNumber() + "," + c.getFirstName() + "," + c.getLastName() + "\n");
        }
        writer.close();
    }

    public void readFromFile(ArrayList contactsList){
        File file = new File("phonebook.csv");
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String phoneNumber = Arrays.asList(line.split(",")).get(0);
                    String firstName = Arrays.asList(line.split(",")).get(1);
                    String lastName = Arrays.asList(line.split(",")).get(2);
                    contactsList.add(new Contact(phoneNumber, firstName, lastName));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
