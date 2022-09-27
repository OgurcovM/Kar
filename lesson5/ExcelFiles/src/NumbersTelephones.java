import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.DecimalFormat;
import java.util.List;

public class NumbersTelephones
{
    public static void Number() throws IOException
    {
        int i = 1;

        File file = new File("C:\\Users\\ogurt\\Desktop\\number.csv");
        List<String> list = Files.readAllLines(file.toPath());
        DecimalFormat phoneFmt = new DecimalFormat("###-###-####");

        for (String line : list)
        {
            System.out.println("Номер телефона №" + i++ + ": " + String.valueOf(line).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3"));
        }
    }
}

