# include <iostream>
using namespace std;

class Demo
{
    public:
        int iNo1;
        int iNo2;

        Demo()
        {
            this -> iNo1 = 0;
            this -> iNo2 = 0;
        }

        Demo(int a)
        {
            this -> iNo1 = a;
            this -> iNo2 = 0;
        }

        Demo(int a, int b)
        {
            this -> iNo1 = a;
            this -> iNo2 = b;
        }
};

int main()
{
    Demo dObj1;
    Demo dObj2(11);
    Demo dObj3(11, 21);

    return 0;
}