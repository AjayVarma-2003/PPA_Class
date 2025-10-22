class Demo
{}

class ObjectClass1
{
    public static void main(String A[])
    {
        Demo dObj = new Demo();

        System.out.println(dObj.hashCode());
        System.out.println(dObj.getClass());
    }
}