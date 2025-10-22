# include <iostream>
using namespace std;

class Arithmatic
{
    public:
        int iNo1;
        int iNo2;

        Arithmatic()
        {
            cout<< "Inside default constructor \n";
            iNo1 = 0;
            iNo2 = 0;
        }

        Arithmatic(int a, int b)
        {
            cout<< "Inside parameterized constructor \n";
            iNo1 = a;
            iNo2 = b;
        }

        int Addition()
        {
            int iAns = 0;
            iAns = iNo1 + iNo2;
            return iAns;
        }

        int Substraction()
        {
            int iAns = 0;
            iAns = iNo1 - iNo2;
            return iAns;
        }
};

int main()
{
    int iRet = 0;

    Arithmatic aObj1(11, 10);
    Arithmatic aObj2;

    iRet = aObj1.Addition();
    cout << "Addition is : "<< iRet<< "\n";

    iRet = aObj1.Substraction();
    cout<< "Substraction is : "<< iRet<< "\n";

    return 0;
}