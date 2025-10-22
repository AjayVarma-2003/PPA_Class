
import java.util.*;


class AgeInvalidException extends Exception
{
    public AgeInvalidException(String str)
    {
        super(str);
    }
}

class ThrowDemo
{
    public static void main(String A[])
    {
        Scanner sObj =  new Scanner(System.in);
        int iAge = 0;

        System.out.println("Enter your age : ");
        iAge = sObj.nextInt();

        try
        {
            if(iAge < 18)
            {
                throw new AgeInvalidException("Your age is below 18");
            }
            else
            {
                System.out.println("Hello");
            }
        }
        catch(AgeInvalidException aObj)
        {
            System.out.println("Exception is : " + aObj);
        }
    }
}