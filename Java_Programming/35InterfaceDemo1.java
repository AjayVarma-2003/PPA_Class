interface Demo
{
    int no = 11;
    void Display();
}

class Hello implements Demo                 // This will cause error.
{
    // Error
}

class InterfaceDemo1
{
    public static void main(String A[])
    {
        Hello hObj = new Hello();
    }
}