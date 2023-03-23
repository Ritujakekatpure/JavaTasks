import java.io.FileInputStream;  
public class FileInputEx {  
     public static void main(String args[]){    
          try{    
            FileInputStream f=new FileInputStream("file.txt");    
            int i=0;    
            while((i=f.read())!=-1){    
             System.out.print((char)i);    
            }    
            f.close();    
          }
          catch(Exception e){System.out.println(e);}    
         }    
        }  
