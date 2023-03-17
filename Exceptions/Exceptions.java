public class Exceptions {
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) 
        {
            throw new ArithmeticException("must be under 18 ");
        } else 
        {
            System.out.println("You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(30);
    }
}