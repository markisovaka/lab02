import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class ResultWriter {
    public static void writeToFile(String fileName, Map<Character, Integer> frequencyMap) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + System.lineSeparator());
            }
        }
    }
}
