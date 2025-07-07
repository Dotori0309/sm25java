package exception;

import java.io.*;

public class Ex1 {
    public static void main(String[] args) {
        File file = new File("/Users/dotori/IdeaProjects/sm25java/0707/src/a.txt");
        System.out.println("File: "+ file.getName());

        try {
            Reader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e){
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
