interface A
{
    int no = 11;
    void fun();
}

interface B
{
    int no = 21;
    void fun();
}

class Demo implements A, B
{
    public void fun()
    {
        System.out.println("Inside fun " + A.no);
    }
}

class InterfaceDemo7
{
    public static void main(String A[])
    {
        Demo dObj = new Demo();
        dObj.fun();
    }
}