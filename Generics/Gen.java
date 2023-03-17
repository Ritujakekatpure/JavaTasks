public class Gen<T> {
    T ob;

    Gen(T ob)
    {
        this.ob=ob;
    }

    public void show() {
        System.out.println("The type of class is: " + ob.getClass().getName());
    }

    public T getob()
     {
        return ob;
     }
}
class GenDe{
     public static void main(String[] args)
     {
        Gen<String> g1 = new Gen<String>("Rituja");
        g1.show();
        System.out.println(g1.getob());

        Gen<Integer> g2 = new Gen<Integer>(10);
        g2.show();
        System.out.println(g2.getob());


     }
}