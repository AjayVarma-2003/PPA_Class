import java.util.*;

class ExceptionDemo5
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);
        int iNo1 = 0, iNo2 = 0, iAns = 0;

        System.out.println("Enter first number : ");
        iNo1 = sObj.nextInt();

        System.out.println("Enter second number : ");
        iNo2 = sObj.nextInt();

        try
        {
            System.out.println("Inside try block ...");
            iAns = (iNo1 / iNo2);
        }
        catch(ArithmeticException aObj) // Specific catch
        {
            System.out.println("Inside catch block ...");
            System.out.println("Exception caused due to : " + aObj);
        }
        catch(Exception eObj)   // Generic catch
        {
            System.out.println("Inside generic catch ...");
            System.out.println("Exception caused due to : " + eObj);
        }

        System.out.println("Division of two numbers is : " + iAns);
    }
}