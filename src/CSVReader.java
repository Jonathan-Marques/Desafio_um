import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    private final String delimiter;

    public CSVReader(String delimiter) {
        this.delimiter = delimiter;
    }

    public List<String[]> readNext(String filePath) throws Exception {
        List<String[]> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(delimiter);
                records.add(values);
            }
        }
        return records;
    }
}
