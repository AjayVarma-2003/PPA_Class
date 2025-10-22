interface Demo
{
    int no = 11;
    void Display();
}

abstract class Hello implements Demo
{

}

class InterfaceDemo2
{
    public static void main(String A[])
    {
        Hello hObj = new Hello();           // Error
    }
}