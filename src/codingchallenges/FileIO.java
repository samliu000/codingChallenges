import java.io.*;
import java.util.Scanner;

public class FileIO
{
   public static void main (String []args)throws IOException
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("enter input filename: ");
      String input = kb.nextLine();
      File inputName = new File(input);
      if(!inputName.exists())
      {
         System.out.println("File not found");
         System.exit(0);
      }
      Scanner inputFile = new Scanner(inputName);

      System.out.print("enter output filename: ");
      String outName = kb.nextLine();
      PrintWriter file = new PrintWriter(outName);

      System.out.print("enter another output filename(append): ");
      String append = kb.nextLine();
      FileWriter appendName = new FileWriter(append, true);
      PrintWriter appendFile = new PrintWriter(appendName);

      String name;
      while(inputFile.hasNext())
      {
         name = inputFile.nextLine().toUpperCase();
         file.println(name);
         appendFile.println(name);
      }

      file.close();
      appendFile.close();
      inputFile.close();
      System.out.println("data written to the \"" + outName + "\" and \"" + append + "\"");
   }
}
