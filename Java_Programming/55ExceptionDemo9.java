import java.util.*;

class ExceptionDemo9
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        int iArr[]= {10, 20, 30, 40, 50};
        int iIndex = 0, iData = 0;

        
        System.out.println("Enter the index number : ");
        iIndex = sObj.nextInt();
        
        iData = iArr[iIndex];   // Exception prone code.

        System.out.println("Element at that index is : " + iData);
    }
}