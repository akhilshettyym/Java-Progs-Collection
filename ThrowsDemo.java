public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException

    {
        System.out.println("Inside Throw one");
        throw new IllegalAccessException();
    }
    public static void main(String[] args)
    {
        try
        {
            throwOne();
    }
        catch (IllegalAccessException e)
        {
            System.out.println("caught"+e);
        }
    }
}
