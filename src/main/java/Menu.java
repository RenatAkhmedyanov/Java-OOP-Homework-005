import java.util.Scanner;

public class Menu {
    public void mainMenu() {
        System.out.println("=".repeat(25) + "\n" +
                           "| Tелефонный справочник | \n" +
                           "=".repeat(25));
        System.out.println("Выберите необходимый пункт меню: \n" +
                             "1 - Вывести список контактов\n" +
                             "2 - Добавить новый контакт\n" +
                             "3 - Поиск контакта\n" +
                             "4 - Удалить контакт\n" +
                             "5 - Записать в файл\n" +
                             "q - Выход из программы");
    }

    public void pressEnter(){
        System.out.println("Enter для продолжения...");
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
    }
}
