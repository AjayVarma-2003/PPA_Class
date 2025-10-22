class Demo
{
    public int Division(int no1, int no2) throws ArithmeticException
    {
        int iAns = 0;
        iAns = no1 / no2;
        return iAns;
    }
}

class ThrowsDemo
{
    public static void main(String A[])
    {
        Demo dObj = new Demo();
        int iRet = 0;

        try
        {
            iRet = dObj.Division(11, 0);
        }
        catch(ArithmeticException aObj)
        {
            System.out.println("Inside catch : " + aObj);
        }

        System.out.println("Division is : " + iRet);
    }
}