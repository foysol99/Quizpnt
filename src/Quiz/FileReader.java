package Quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class FileReader extends Reader {
    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {

    }import java.io.BufferedReader;
import java.io.FileReader;

    public class DataReader {
        public static void main(String[] args) {
            FileReader fr = null;
            BufferedReader br = null;
            String fileName = "C:\\Surprse\\src\\quize\\Sample.txt";

            try {
                fr = new FileReader(fileName);
                br = new BufferedReader(fr);


                String data = "";
                while ((data = br.readLine()) != null) {
                    System.out.println(data);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("File was not found");
            } finally {
                try {
                    br.close();

                } catch (Exception ex2) {

                }
            }
        }

    }


}
