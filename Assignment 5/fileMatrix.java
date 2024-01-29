import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class fileMatrix {
    // to handle exceptions include throws
    public static void main(String[] args) throws IOException
    {
        String firstFile;
        String secondFile;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter your first file");
        firstFile = scanner.nextLine();
        
        System.out.println("Please enter your first file");
        secondFile = scanner.nextLine();

        List<String> listOfFile1 = new ArrayList<String>();
       
        BufferedReader file1 = new BufferedReader(new FileReader(firstFile));
       
        String line1 = file1.readLine();
       
        while (line1 != null) 
        {
            listOfFile1.add(line1);
            line1 = file1.readLine();
        }    
        
        file1.close();
       
        String[] array1 = listOfFile1.toArray(new String[0]);
       
        for (String str : array1) 
        {
            System.out.println(str);
        }


        List<String> listOfFile2 = new ArrayList<String>();
       
        BufferedReader file2 = new BufferedReader(new FileReader(secondFile));
       
        String line2 = file2.readLine();
       
        while (line2 != null) 
        {
            listOfFile2.add(line2);
            line2 = file2.readLine();
        }    
        
        file1.close();
       
        String[] array2 = listOfFile2.toArray(new String[0]);
       
        for (String str : array2) 
        {
            System.out.println(str);
        }


        scanner.close();
    }
}
