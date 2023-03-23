import java.io.*;  
public class BufferedInputEx{    
 public static void main(String args[]){    
  try{    
    FileInputStream f=new FileInputStream("file.txt");    
    BufferedInputStream b=new BufferedInputStream(f);    
    int i;    
    while((i=b.read())!=-1){    
     System.out.print((char)i);    
    }    
    b.close();    
    f.close();    
  }catch(Exception e){System.out.println(e);}    
 }    
}