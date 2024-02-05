import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.InputStreamReader;

public class Bubble{
        public static int[] createRandomArray(int arrayLength){
            int[] array;
            Random rand = new Random();
            array = new int[arrayLength];
            for(int i=0; i<array.length;i++){
                array[i]=rand.nextInt(100);
                System.out.println(array[i]);
            }

            
            return array;
        }   
    
        
        
        public static void writeArrayToFile(int[] array, String filename) throws IOException{
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            for(int i = 0; i < array.length; i++) {
                writer.write(String.valueOf(array[i]));     
                writer.newLine();
            }
            writer.close();
        }

        
        public static int[] readFileToArray(String filename) throws IOException{
            BufferedReader fileReader = new BufferedReader(new FileReader(filename));
            int[] array2;
            int lines = 0;
            while(fileReader.readLine() != null) lines++;
            fileReader.close();
            BufferedReader fileRead = new BufferedReader(new FileReader(filename));
            array2 = new int[lines];
            for(int i=0; i< lines; i++){
                String values = fileRead.readLine();
                if(values == null){
                    break;
                }
                int test = Integer.parseInt(values);
                array2[i] = test;
                
            }
            
            fileRead.close();
            return array2;
        

        }


        public static void bubbleSort(int[] array)throws IOException{
            
            int n = array.length;  
            int temp = 0;  
            for(int i=0; i < n; i++){  
                for(int j=1; j < (n-i); j++){  
                    if(array[j-1] > array[j]){  
                                   
                        temp = array[j-1];  
                        array[j-1] = array[j];  
                        array[j] = temp;  
                    }
                }
            }
                       
        }

        
        public static void main(String[] args) throws IOException{
            int arrayLength;
            
            String filename;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter the name of the file. ");
            filename = scanner.nextLine();
            if(filename != "arrayfile.txt"){
                int[] revArray = readFileToArray(filename);
                bubbleSort(revArray);
                BufferedWriter writer = new BufferedWriter(new FileWriter("sortstore.txt"));
                for(int i = 0;i<revArray.length;i++){
                    writer.write(String.valueOf(revArray[i]));     
                    writer.newLine();
                }
                writer.close();
            }
            else{
                System.out.println("Please enter the length of the array. ");
            
                arrayLength = scanner.nextInt();


            
                int[] array = createRandomArray(arrayLength);
                writeArrayToFile(array, filename);
                int[] revArray = readFileToArray(filename);
                for(int i=0; i<revArray.length;i++){
                    System.out.println(revArray[i]);
                }
            
            
            
            
                scanner.close();
            }
        }








    



}