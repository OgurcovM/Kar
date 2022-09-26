import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number
{
    public static void Number()
    {
        String input = "А300АА Б200ББ МНЗ 2754";
        Pattern pattern = Pattern.compile("МНЗ 2754");
        Matcher matcher = pattern.matcher(input);
        if(matcher.find())
            System.out.println("Найдено совпадение номера: " + matcher.group());
        else
            System.out.println("Номера не найдены");
    }
}
