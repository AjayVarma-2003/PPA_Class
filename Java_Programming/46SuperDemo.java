class Hello
{
    public int i;

    public Hello(int no)
    {
        System.out.println("Inside Hello constructor ...");
        this.i = no + 1;
    }

    public void Display()
    {
        System.out.println("Inside Hello Display ...");
    }
}

class Demo extends Hello
{
    public int i;

    public Demo(int a)
    {
        super(a);   // calls to the Hello constructor. Because it has only parameterized constructor.   // First use.
        System.out.println("Inside Demo constructor ...");
        this.i = a;
    }

    public void Display()
    {
        int i = 0;

        System.out.println("Inside Display " + this.i);     // 51
        System.out.println("Inside Display " + i);          // 0
        System.out.println("Inside Display " + super.i);    // Access the parent class characteristics. // 52   // Second use

        super.Display();    //  Hello Display   // Third use.
    }
}

class SuperDemo
{
    public static void main(String A[])
    {
        Demo dObj = new Demo(51);

        dObj.Display();
    }
}