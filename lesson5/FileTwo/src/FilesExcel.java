import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FilesExcel
{
    public static void Numbers() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input1 = bufferedReader.readLine();
        String input2 = bufferedReader.readLine();

        bufferedReader.close();

        InputStream inputStream1 = Files.newInputStream(Path.of(input1));
        InputStream inputStream2 = Files.newInputStream(Path.of(input2));

        ArrayList<String> arrayList = new ArrayList<>();

        while (inputStream1.available() > 0)
            arrayList.add(String.valueOf(inputStream1.read()));

        while(inputStream2.available() > 0)
            arrayList.add(String.valueOf(inputStream2.read()));

        OutputStream outputStream = Files.newOutputStream(Path.of(input1));
        for(String i : arrayList){
            outputStream.write(i.getBytes());
        }
        inputStream1.close();
        inputStream2.close();
        outputStream.close();

    }
}
