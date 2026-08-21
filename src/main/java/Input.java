import java.io.InputStream;
import java.util.Properties;

public class Input {

    public static void main(String[] args) {

        Properties properties = new Properties();

        try {
            InputStream input = Input.class
                    .getClassLoader()
                    .getResourceAsStream("config.properties");

            if (input == null) {
                System.out.println("config.properties not found!");
                return;
            }

            properties.load(input);

            System.out.println("App Name: "
                    + properties.getProperty("app.name"));

            System.out.println("Version: "
                    + properties.getProperty("app.version"));

            input.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
