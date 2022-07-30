import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
class fileHandling {
 
    public static void main(String[] args)
    {
 
        
        try {
        	File Obj = new File("fileinput.txt"); 

        			            if (Obj.createNewFile()) { 

        			                System.out.println("File created: "  + Obj.getName());
        			}
 
            
            FileReader fr = new FileReader("fileinput.txt");
 
             
            FileWriter fw = new FileWriter("Fileoutput");
 
            
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