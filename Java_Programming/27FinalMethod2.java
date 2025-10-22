class Base
{
    final public void fun()     // Defination
    {}

    final public void gun()     // Defination
    {}
}

class Derived extends Base
{
    public void run()       // Defination
    {}

    public void gun()       // Overriding not allowed in case of final class.
    {}
}

class FinalMethod2
{
    public static void main(String A[])
    {

    }
}