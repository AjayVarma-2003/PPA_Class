final class Base
{
    public void fun()
    {
        System.out.println("Inside Base fun");
    }
}

class Derived
{
    public Base bObj;   // Compostion
    
    public Derived()
    {
        bObj = new Base();
    }
}

class FinalClass2
{
    public static void main(String A[])
    {
        Derived dObj = new Derived();

        dObj.bObj.fun();
    }
}