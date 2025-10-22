import java.util.*;

class ExceptionDemo10
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        int iArr[]= {10, 20, 30, 40, 50};
        int iIndex = 0, iData = 0;

        
        System.out.println("Enter the index number : ");
        iIndex = sObj.nextInt();
        
        try
        {
            System.out.println("Inside try block ...");
            iData = iArr[iIndex];
        }
        catch(ArrayIndexOutOfBoundsException aObj)
        {
            System.out.println("Inside specific catch ...");
            System.out.println("Exception caused due to : " + aObj);
        }
        catch(Exception eObj)
        {
            System.out.println("Inside generic catch ...");
            System.out.println("Exception caused due to : " + eObj);
        }
        finally
        {
            System.out.println("Inside finally ...");
        }

        System.out.println("Element at that index is : " + iData);
    }
}