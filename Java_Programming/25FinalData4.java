class Demo
{
    public int i;
    final public int j;

    public Demo(int a, int b)
    {
        this.i = a;
        this.j = b;
    }
}

class FinalData4
{
    public static void main(String A[])
    {
        Demo dObj = new Demo(11, 21);

        System.out.println(dObj.i);
        System.out.println(dObj.j);

        dObj.i++;

        // dObj.j++;    // Error
    }
}