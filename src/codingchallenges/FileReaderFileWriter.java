/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingchallenges;

import java.io.*;
import java.util.*;

/**
 *
 * @author boo13
 */
public class FileReaderFileWriter {
    public static void main(String[] args) throws IOException{
        File myFile = new File("ExperimentalTextFile.txt");
        if(!myFile.exists()){
            System.out.println("File not found");
            System.exit(0);
        }
        Scanner in = new Scanner(myFile);
        PrintWriter outputFile = new PrintWriter("OutputFile.txt");
        while(in.hasNext()){
            String current = in.nextLine();
            outputFile.print(current);
        }
        in.close();
        outputFile.close();
    }
}
