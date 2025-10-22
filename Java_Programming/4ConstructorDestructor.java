class Demo
{
    public int iNo1;
    public int iNo2;

    public Demo()
    {
        System.out.println("Inside default constructor ...");
    }

    public Demo(int i, int j)
    {
        System.out.println("Inside parameterized constructor ...");
    }

    protected void finalize()    // ~Demo
    {
        System.out.println("Inside finalize ...");
    }
}

class ConstructorDestructor
{
    public static void main(String Arg[])
    {
        Demo dObj1 = new Demo();                // Demo dObj1();    In C++

        Demo dObj2 = new Demo(11, 21);          // Demo dObj2(11, 21);    In C++

        dObj1 = null;
        dObj2 = null;

        System.gc();    // gc = garbage collector.

        System.out.println("End of main ...");
    }
}