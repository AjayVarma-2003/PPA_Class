abstract class Base
{
    public int i, j;

    public int Addition(int A, int B)
    {
        return A + B;
    }

    abstract public int Substraction(int A, int B);
}

// class Derived extends Base
// {
//     public int x;

//     public int Substraction(int A, int B)
//     {
//         return A - B;
//     }

//     public int Multiplication(int A, int B)
//     {
//         return A * B;
//     }
// }

class AbstractDemo1
{
    public static void main(String A[])
    {
        //Base bp = new Base();       // Nocasting and error due to we are trying to make object of abstract class
    }
}