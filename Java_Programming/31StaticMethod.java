class Demo
{
    public int i;
    static public int j = 21;

    public Demo()
    {
        this.i = 11;
    }

    public void fun()       // Instance method
    {
        System.out.println("fun i : " + this.i);
        System.out.println("fun j : " + Demo.j);
    }

    public static void gun()    // Static method
    {
        // System.out.println("fun i : " + this.i);     // Not allowed
        System.out.println("fun j : " + Demo.j);
    }
}

class StaticMethod
{
    public static void main(String A[])
    {
        Demo.gun();
        System.out.println(Demo.j);

        Demo dObj = new Demo();

        System.out.println(dObj.i);
        dObj.fun();
    }
}