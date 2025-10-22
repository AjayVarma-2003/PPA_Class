// class Demo extends Object
class Demo implements Cloneable                 // Cloneable is interface.
{
    public int i, j;

    public Demo(int A, int B)
    {
        this.i = A;
        this.j = B;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

class CloneDemo
{
    public static void main(String A[])
    {
        try
        {
            Demo dObj1 = new Demo(11, 21);

            Demo dObj2 = (Demo) dObj1.clone();      // Typecasting

            System.out.println(dObj2.i);
            System.out.println(dObj2.j);
        }
        catch(CloneNotSupportedException cObj)
        {}
    }
}