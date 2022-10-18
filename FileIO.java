import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileIO {
    public static void main(String[] args) {

        String[] fruits = { "Apple", "Banana", "Mango", "Orange" };

        // File writer
        try {

            // Using BufferedWriter class to write on a file result.txt
            BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt"));
            writer.write("Written on the wall");
            writer.write("\nnew line"); // "\n" allows you to write in new line

            for (String fruit : fruits) {
                writer.write("\n" + fruit);
            }

            writer.close(); // If we were not to close this, nothing gets written on the file
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // File reader
        try {
            BufferedReader reader = new BufferedReader(new FileReader("result.txt"));
            try {
                System.out.println(reader.readLine()); // returns a string, reads only one line

                // so we use loop to read all the texts in the file
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

                reader.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}