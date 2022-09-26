import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Time
{
    public static void Time()

    {
        String input = "В колледж я пришел в 09:00";
        Pattern pattern = Pattern.compile("(2[0-3]|[0-1]\\d):[0-5]\\d");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find())
        {
            System.out.println(matcher.group());
        }
    }

}
