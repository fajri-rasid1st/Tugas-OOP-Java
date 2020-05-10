package tugas2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class DataHandling {
    static String dataKelompok = "";

    public static void addData(String data) throws IOException {
        FileWriter fileOutput = new FileWriter("src\\main\\java\\tugas2\\Group.txt", true);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        bufferOutput.write(data);
        bufferOutput.flush();
        bufferOutput.newLine();
        bufferOutput.close();
        fileOutput.close();
    }

    public static String seeData() throws IOException {
        dataKelompok = "";
        FileReader fileInput = new FileReader("src\\main\\java\\tugas2\\Group.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);
        String data = bufferInput.readLine();

        while (data != null) {
            StringTokenizer sTokens = new StringTokenizer(data);
            dataKelompok += (sTokens.nextToken() + "\n");
            data = bufferInput.readLine();

        }

        bufferInput.close();
        fileInput.close();
        return dataKelompok;
    }
}