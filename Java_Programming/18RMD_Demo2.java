class Base
{
    public int i, j;

    public void fun()
    {
        System.out.println("Inside Base fun ");
    }

    public void gun()
    {
        System.out.println("Inside Base gun ");
    }

    public void sun()
    {
        System.out.println("Inside Base sun ");
    }

    public void bun()
    {
        System.out.println("Inside Base bun ");
    }
}

class Derived extends Base
{
    public int x;

    public void gun()
    {
        System.out.println("Inside Derived gun ");
    }

    public void sun()
    {
        System.out.println("Inside Derived sun ");
    }

    public void run()
    {
        System.out.println("Inside Derived run ");
    }

    public void mun()
    {
        System.out.println("Inside Derived mun ");
    }
}

class RMD_Demo2
{
    public static void main(String A[])
    {
        Base bp = new Derived();       // upcasting

        bp.fun();   // Base fun
        bp.gun();   // Derived gun    // This will cause beacause all functions in the java are virtual.
        bp.sun();   // Derived sun
        //bp.run();   // Error
        //bp.mun();   // Error
        bp.bun();   // Base bun
    }
}