import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Reader implements Reading{
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
