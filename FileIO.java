import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class FileIO {
    public static void main(String[] args) {

        String[] fruits = { "Apple", "Banana", "Mango", "Orange" };

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
    }
}