import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static Map<Character, Integer> countCharacterFrequency(File file) throws IOException {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        try (FileReader reader = new FileReader(file)) {
            int c;
            while ((c = reader.read()) != -1) {
                char character = (char) c;
                // Проверяем, является ли символ буквой английского алфавита
                if (Character.isLetter(character) && character <= 'z' && character >= 'A') {
                    frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
                }
            }
        }
        return frequencyMap;
    }
}
