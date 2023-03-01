import java.util.*;
   public class simplecompound{
   public static void main(String []args){
      double p,r,t,sinterest,cinterest;
      Scanner sc = new Scanner (System. in);
      System.out.println("Enter the value of Principal = ");
      p=sc.nextDouble();
      System. out. println("Enter the Annual Rate of Interest = ");
      r=sc.nextDouble();
      System. out. println("Enter the Time (years) = ");
      t=sc.nextDouble();
      sinterest =(p*r*t)/100;
      cinterest =p*Math.pow(1.0+r/100.0,t)-p;
      System.out.println("Simple Interest: "+sinterest);
      System.out. println("Compound Interest: "+cinterest);
     
   }
}