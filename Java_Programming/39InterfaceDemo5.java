interface A
{
    void fun();
}

interface B
{
    void fun();
}

class Demo implements A, B
{
    public void fun()
    {
        System.out.println("Inside fun ...");
    }
}

class InterfaceDemo5
{
    public static void main(String A[])
    {
        Demo dObj = new Demo();
        dObj.fun();
    }
}