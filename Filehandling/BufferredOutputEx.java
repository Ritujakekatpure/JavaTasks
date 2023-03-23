import java.io.*;  
public class BufferredOutputEx{    
public static void main(String args[])throws Exception{    
     FileOutputStream f=new FileOutputStream("file.txt");    
     BufferedOutputStream b=new BufferedOutputStream(f);    
     String s="new things are added.";    
     byte by[]=s.getBytes();    
     b.write(by);      
     b.close();    
     f.close();    
     System.out.println("success");    
}    
}  
