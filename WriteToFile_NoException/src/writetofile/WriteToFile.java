
package writetofile;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

// this is from the web.  We will clean it up

public class WriteToFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     try {
      FileWriter myWriter = new FileWriter("c:\\root\\filename.txt");
      myWriter.write("Files in Java might be tricky, but it is fun enough!");
      myWriter.write("\nToday is the first day of the rest of your life");
      myWriter.write("\nWise men think before acting\n");       
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
