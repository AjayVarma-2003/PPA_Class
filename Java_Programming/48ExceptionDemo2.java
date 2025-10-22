import java.util.*;

class ExceptionDemo2
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);
        int iNo1 = 0, iNo2 = 0;
        float fAns = 0;

        System.out.println("Enter first number : ");
        iNo1 = sObj.nextInt();

        System.out.println("Enter second number : ");
        iNo2 = sObj.nextInt();

        fAns = ((float)iNo1 / (float)iNo2);     // explicit typecasting.

        System.out.println("Division of two numbers is : " + fAns);
    }
}