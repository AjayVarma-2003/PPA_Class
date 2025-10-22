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
}

class Constructor
{
    public static void main(String Arg[])
    {
        Demo dObj1 = new Demo();                // Demo dObj1();    In C++

        Demo dObj2 = new Demo(11, 21);          // Demo dObj2(11, 21);    In C++
    }
}