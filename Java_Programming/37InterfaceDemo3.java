interface Demo
{
    int no = 11;                            // public static final
    void Display();                         // public abstract method
}

class Hello implements Demo
{
    public void Display()
    {
        System.out.println("Inside Hello Display...");
    }
}


class InterfaceDemo3
{
    public static void main(String A[])
    {
        System.out.println(Demo.no);        // no is public and static
        // Demo.no = 12;                    // Error. no is final

        Hello hObj = new Hello();
        hObj.Display();
    }
}