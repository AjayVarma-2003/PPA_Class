import java.util.Scanner;

class SelectionDemo1
{
    public static void main(String a[])
    {
        Scanner sObj = new Scanner(System.in);
        int iNo = 0;

        System.out.println("Enter your age : ");
        iNo = sObj.nextInt();

        if(iNo >= 18)
        {
            System.out.println("You can vote.");
        }
        else
        {
            System.out.println("You can not vote.");
        }
    }
}