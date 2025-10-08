import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException{
        Properties p=new Properties();//legacy class
        FileInputStream fis=new FileInputStream("E:\\Programming\\2.Java Programming\\Resources\\02.Collection\\06.Map\\test.properties");
        p.load(fis);
        System.out.println(p);
        String ss=p.getProperty("idli");
        System.out.println(ss);
        p.setProperty("idli", "20");
        System.out.println(p);
        FileOutputStream fos=new FileOutputStream("E:\\Programming\\2.Java Programming\\Resources\\02.Collection\\06.Map\\test.properties");
        p.store(fos, "Updated price");


    }
}
