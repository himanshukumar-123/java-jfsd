import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
class filehandling {
 
    public static void main(String[] args)
    {
 
        
        try {
 
            
            FileReader fr = new FileReader("fileinput.txt");
 
             
            FileWriter fw = new FileWriter("fileoutput.txt");
 
            
            String str = " ";
 
            int i;
 
            while ((i = fr.read()) != -1) {
 
                // Storing every character in the string
                str += (char)i;
            }
 
             
            System.out.println(str);
  
            fw.write(str);
 
            
            fr.close();
            fw.close();
 
            // Display message
            System.out.println(
                "File reading and writing both done");
        }
 
        catch (IOException e) 
        {
            System.out.println(e);
        }
    }
} 
