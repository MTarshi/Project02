import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileDemo {
    public static void main(String[] args) throws IOException {
        //this demo shows how to read properties of file.
        //steps to read a file.
        //1: we need to know the path or location of that file.
        String path = "FILES/Config.properties";


        //Navigating to that path where file is stored
        FileInputStream fileInputStream = new FileInputStream(path);
        //2: we need to have a special software that understands that file that we
        //can use to open and edit that file.
        Properties properties = new Properties();
        properties.load(fileInputStream);

        System.out.println(properties.get("user"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("URL"));
    }
}
