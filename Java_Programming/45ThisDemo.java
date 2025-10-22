class Demo
{
    public int i;
    public static int j;

    static
    {
        j = 21;
    }

    public Demo()
    {
        System.out.println("Inside default constructor ...");
        this.i = 11;        // First use
    }

    public Demo(int A)
    {
        this();            // goes to default constructor first then continues.   // Second use
        System.out.println("Inside Parameterized constructor ...");
    }

    public void Display()
    {
        System.out.println("Inside Display " + this.i);     // Third use
    }
}

class ThisDemo
{
    public static void main(String A[])
    {
        Demo dObj = new Demo(51);

        dObj.Display();
    }
}