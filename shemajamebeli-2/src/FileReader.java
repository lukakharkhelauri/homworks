import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class FileReader {
    public static List<Student> FileRead(String fileName) {
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                    students.add(new Student(line.split(',')));
            }catch (IOException e) {

            }
        }
    }
}
