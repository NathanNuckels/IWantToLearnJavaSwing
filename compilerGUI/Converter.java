package compilerGUI;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Converter{
    public static String convert(Process process) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        StringBuilder builder = new StringBuilder();
        String line = null;
        while ( (line = reader.readLine()) != null) {
            builder.append(line);
            builder.append(System.getProperty("line.separator"));
        }
        String result = builder.toString();
        return result;
    }
}
