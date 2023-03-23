import java.io.FileWriter;  
public class FileWriterEx{  
    public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("file.txt");    
           fw.write("hii this is new file.");    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Successfully added the data");    
     }    
}  