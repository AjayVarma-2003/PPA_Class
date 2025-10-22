# include <iostream>
using namespace std;

class Arithmatic
{
    public:
        int iNo1;
        int iNo2;

        Arithmatic()
        {
            this -> iNo1 = 0;
            this -> iNo2 = 0;
        }

        Arithmatic(int a, int b)
        {
            this -> iNo1 = a;
            this -> iNo2 = b;
        }

        int Addition()
        {
            int iAns = 0;
            iAns = this -> iNo1 + this -> iNo2;
            return iAns;
        }

        int Substraction()
        {
            int iAns = 0;
            iAns = this -> iNo1 - this -> iNo2;
            return iAns;
        }
};

int main()
{
    int iRet = 0;

    Arithmatic aObj1(11, 10);
    Arithmatic aObj2(21, 20);

    iRet = aObj1.Addition();
    cout << "Addition is : "<< iRet<< "\n";

    iRet = aObj1.Substraction();
    cout<< "Substraction is : "<< iRet<< "\n";

    iRet = aObj2.Addition();
    cout << "Addition is : "<< iRet<< "\n";

    iRet = aObj2.Substraction();
    cout<< "Substraction is : "<< iRet<< "\n";

    return 0;
}