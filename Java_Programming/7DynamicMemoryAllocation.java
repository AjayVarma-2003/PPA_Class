
import java.util.Scanner;

class DynamicMemoryAllocation
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        int iLength = 0;
        int Arr[];

        System.out.println("Enter the number of elements : ");
        iLength = sObj.nextInt();

        Arr = new int[iLength];

        if(Arr == null)
        {
            System.out.println("Unable to allocate memory");
        }
        else
        {
            System.out.println("Memory got successfully allocated");
        }

        Arr = null;
        System.gc();
    }
}