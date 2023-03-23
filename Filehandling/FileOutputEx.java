import java.io.FileOutputStream;  
public class FileOutputEx {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("file.txt");    
             fout.write(88);    
             fout.close();    
             System.out.println("successfully added");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  
