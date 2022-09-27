import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class NumbersTelephones
{
    public static void Number() throws IOException
    {
        int i = 1;

        File file = new File("C:\\Users\\ogurt\\Desktop\\number.csv");
        List<String> list = Files.readAllLines(file.toPath());

        for (String line : list)
        {
            System.out.println("Номер телефона №" + i++ + ": " + line);
        }
    }
}

