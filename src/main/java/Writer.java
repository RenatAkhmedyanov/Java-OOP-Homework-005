import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Writer implements Writing{
    @Override
    public void writeToFile(ArrayList<Contact> contactsList) throws IOException {
        FileWriter writer = new FileWriter("phonebook.csv", false);
        for(Contact c  : contactsList) {
            writer.write(c.getPhoneNumber() + "," + c.getFirstName() + "," + c.getLastName() + "\n");
        }
        writer.close();
    }
}
