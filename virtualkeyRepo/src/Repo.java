import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Repo {
    public static void listingFile() {
    	File fileDir = new File("C:\\Users\\user\\Desktop\\practice_projects\\assisted\\java-jfsd\\repo\\");
        //Creating the directory
        		fileDir.mkdir();
       
        
       if(fileDir.isDirectory()){
            List <String>listFile = Arrays.asList(fileDir.list());
            Collections.sort(listFile);
            System.out.println("---------------------------------------");
            System.out.println("Sorting by filename in ascending order");
            for(String s:listFile){
                System.out.println(s);
                
            }
            }
            
      

//            writing in decending order.
//            System.out.println("---------------------------------------");
//            System.out.println("Sorting by filename in descending order");
//            Collections.sort(listFile,Collections.reverseOrder());
//            for(String s:listFile){
//                System.out.println(s);
//            }

        else{
           System.out.println(fileDir.getAbsolutePath() + " is not a directory");
        }Repo.mainMenu();

  }
    public static void createFile() {
//        Scanner sc = new Scanner(System. in ); //object of Scanner class
//        System.out.println("Enter the file name : ");
//        String name = sc.nextLine(); //variable name to store the file name
        File file = new File("C:\\Users\\user\\Desktop\\practice_projects\\assisted\\java-jfsd\\repo\\");
        //Creating the directory
        file.mkdir();
        
     
    Scanner sc = new Scanner(System. in ); //object of Scanner class
    System.out.println("Enter the file name : ");
    String name = sc.nextLine(); //variable name to store the file name
        File file1 = new File("C:\\Users\\user\\Desktop\\practice_projects\\assisted\\java-jfsd\\repo\\"+name);

        try {
            if (file1.createNewFile()) {
                System.out.println("File Created! :)");
                Repo.fileMenuOperations();
            } else {
                System.out.println("File already exists :(");
                Repo.fileMenuOperations();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }



    
    public static void deleteMethod() {
        String filename;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Name of File to Delete: ");
        filename = scan.nextLine();

        File file= new File("C:\\Users\\user\\Desktop\\practice_projects\\assisted\\java-jfsd\\repo\\"+filename);

        if (file.delete()) {
            System.out.println("File deleted successfully");
            Repo.fileMenuOperations();
        }
        else {
            System.out.println("Oops !! File not found.Please try again ");
            Repo.fileMenuOperations();
        }

    }
    public static void searchMethod() {
        System.out.println("Enter the name of the file to Search");
        Scanner s1 = new Scanner(System.in);
        String folderName = s1.next();
        File file = new File("C:\\Users\\user\\Desktop\\practice_projects\\assisted\\java-jfsd\\repo\\"+folderName);

        if (file.exists()) {
            System.out.println("Yep! File found!! :)"+"\n"+"This is the file location");
            System.out.println(file.getAbsolutePath());
            Repo.fileMenuOperations();
        } else {
            System.out.println("Sorry, File Not Found :(");
            Repo.fileMenuOperations();
        }

//        try {
//            PrintWriter pw = new PrintWriter(file);
//            pw.println("saved");
//            pw.close();
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//        }

    }
    public static void mainMenu() {
    	System.out.println("Please select one the following");
        System.out.println("1 for current file names in ascending order ");
        System.out.println("2 for your Business Operation");
        System.out.println("3 for exit application");
    	
    }
    
    public static void fileMenuOperations() {
    	
    	System.out.println("Please choose one of the following options :");
        System.out.println("1. Create a file");
        System.out.println("2. Delete a File");
        System.out.println("3. Search for a File");
        System.out.println("4. for main menu");
        Scanner sc2=new Scanner(System.in);
    	try {
    		
            int choice=sc2.nextInt();
             switch(choice) {
             case 1:
                 System.out.println("You have selected to create file");
                 createFile();

                 break;
             case 2:
                 System.out.println("You have selected to Delete file");
                 deleteMethod();
                 break;
             case 3:
                 System.out.println("You have Selected to search file");
                 searchMethod();
                 break;
             case 4:
                 System.out.println("Going back to MainMenu");
                 Repo.mainMenu();
                  break;
         }

        }catch(Exception e) {
           System.out.println("Oops!! Please Enter valid number");
          Repo.fileMenuOperations();
        }
        
		
 
    	
    }
    public static void main(String[] args) {

        System.out.println("**********************");
        System.out.println("Welcome to LOCK ME :) ");
        System.out.println("Repo.com");
        System.out.println("Created by HIMANSHU");
        System.out.println("**********************");
        
        Scanner sc=new Scanner(System.in);
        Repo.mainMenu();
        while(true) {
            
            
                try {
        	
              int option=sc.nextInt();
              switch(option) {
                case 1 :
                    System.out.println("These are the files in ascending");
                    listingFile();
                    break;
                case 2 :
                	Repo.fileMenuOperations();
                	break;
                    
                case 3 :
            	   System.out.println("Have a nice day!! Thanks for using locker ");
                   System.out.println("Application closed");

                   System.exit(option);
                    break;
                default:
                    System.out.println("Oops!! please enter the valid number");
                    break;

            }
        }catch(Exception e){
          System.out.println("Oops!! Please Enter valid number");
         Repo.main(args);
     }
}
}
}