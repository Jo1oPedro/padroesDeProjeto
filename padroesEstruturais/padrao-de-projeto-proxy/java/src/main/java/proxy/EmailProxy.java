package proxy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EmailProxy implements IEmail {


    @Override
    public String enviaEmail(String dadosSender, String dadosRecipient, String subject, String body) {
        this.realizaLog(dadosSender, dadosRecipient, subject, body);
        return (new Email()).enviaEmail(dadosSender, dadosRecipient, subject, body);
    }

    private void realizaLog(String dadosSender, String dadosRecipient, String subject, String body)
    {
        String filePath = "log.txt";

        try {
            // Create a File object representing the file
            File file = new File(filePath);

            // Check if the file already exists; if not, create it
            if (!file.exists()) {
                file.createNewFile();
            }

            // Create a FileWriter to write to the file
            FileWriter fileWriter = new FileWriter(file, true);

            // Create a BufferedWriter for efficient writing
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Write data to the file
            bufferedWriter.write("dados sender: " + dadosSender + " / dados recipient: " + dadosRecipient + " / subject: " + subject + " / body: " + body + "\n");

            // Close the BufferedWriter and FileWriter to release resources
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
