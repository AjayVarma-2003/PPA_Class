import java.util.*;

class ExceptionDemo3
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);
        int iNo1 = 0, iNo2 = 0, iAns = 0;

        System.out.println("Enter first number : ");
        iNo1 = sObj.nextInt();

        System.out.println("Enter second number : ");
        iNo2 = sObj.nextInt();

        iAns = (iNo1 / iNo2);

        System.out.println("Division of two numbers is : " + iAns);
    }
}