import java.io.File;
import java.io.IOException;
import java.util.Map;

public class FrequencyDictionary {
    public static void run() {
        try {
            // Запросить у пользователя имя исходного файла и файла для записи результатов
            String inputFileName = UserInput.getFileName("Введите имя файла для чтения: ");
            String outputFileName = UserInput.getFileName("Введите имя файла для записи результатов: ");
            
            // Проверка существования файла
            File inputFile = new File(inputFileName);
            if (!inputFile.exists()) {
                throw new IOException("Файл не найден: " + inputFileName);
            }
            
            // Подсчёт частоты символов
            Map<Character, Integer> frequencyMap = FrequencyCounter.countCharacterFrequency(inputFile);
            
            // Запись результатов в файл
            ResultWriter.writeToFile(outputFileName, frequencyMap);
            System.out.println("Результаты записаны в файл: " + outputFileName);
            
        } catch (IOException e) {
            System.err.println("Ошибка ввода-вывода: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
