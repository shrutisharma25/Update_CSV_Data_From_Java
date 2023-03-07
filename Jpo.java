import java.io.*;

public class Jpo {
    public static void main(String[] args) {
        String sourceFilePath = "input.csv";
        String targetFilePath = "output.csv";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(targetFilePath, true)); // Append to file
            String line = "";
            int row = 0;

            while ((line = reader.readLine()) != null) {
                String[] cells = line.split(",");
                // Perform any updates to the cells as needed
                cells[1] = "Updated Value";
                String updatedLine = String.join(",", cells);
                writer.write(updatedLine + "\n");
                row++;
            }

            reader.close();
            writer.close();

            System.out.println("CSV file updated successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while updating the CSV file.");
            e.printStackTrace();
        }
    }
}
