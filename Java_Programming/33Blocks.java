class Demo
{
    public int i;
    static public int j;

    static 
    {
        System.out.println("Inside static block.");
        j = 21;
    }

    public Demo()
    {
        System.out.println("Inside constructor");
        this.i = 11;
    }
}

class Blocks
{
    public static void main(String A[])
    {
        System.out.println("Inside main");

        Demo dObj1 = new Demo();
        Demo dObj2 = new Demo();
        Demo dObj3 = new Demo();
    }
}