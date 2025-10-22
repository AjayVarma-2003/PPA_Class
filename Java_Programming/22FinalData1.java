class Demo
{
    public int i;
    final public int j;

    public Demo()
    {
        this.i = 11;
        this.j = 21;
    }
}

class FinalData1
{
    public static void main(String A[])
    {
        Demo dObj = new Demo();

        System.out.println(dObj.i);
        System.out.println(dObj.j);

        dObj.i++;
        dObj.j++;   // Error
    }
}