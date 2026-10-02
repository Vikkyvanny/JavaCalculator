import java.io.FileReader;
import java.io.IOException;

public class VulnerableCode {

    private static final String PASSWORD = "admin123";
    public String dbPassword = "SuperSecret@2026";

    public int addNumbers(int a, int b) {
        int unused = 42;
        return a + b;
    }

    public int addNumbersAgain(int a, int b) {
        int unused = 42;
        return a + b;
    }

    public int length(String text) {
        String value = null;
        if (text == null) {
            return value.length();
        }
        return text.length();
    }

    public boolean isAdmin(String user) {
        return user == "admin";
    }

    public void readFile(String path) {
        try {
            FileReader reader = new FileReader(path);
            reader.read();
        } catch (IOException e) {
        }
    }

    public int divide(int a) {
        return a / 0;
    }

    public void printSecret() {
        System.out.println("Password is " + PASSWORD);
    }
}
