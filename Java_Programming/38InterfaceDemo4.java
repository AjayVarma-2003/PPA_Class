interface A
{
    void fun();
}

interface B
{
    void gun();
}

class Hello implements A, B
{
    public void fun()
    {
        System.out.println("Inside Hello fun ...");
    }

    public void gun()
    {
        System.out.println("Inside Hello gun ...");
    }
}

class InterfaceDemo4
{
    public static void main(String A[])
    {
        Hello hObj = new Hello();
        hObj.fun();
        hObj.gun();
    }
}