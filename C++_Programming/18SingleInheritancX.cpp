# include <iostream>
using namespace std;

class Base
{
    public:
        int i, j;

        void fun()
        {
            cout << "Inside Base fun ... \n";
        }
};

class Derived : public Base
{
    public:
        int x;

        void gun()
        {
            cout << "Inside Derived gun ... \n";
        }
};

int main()
{
    Base bObj;
    Derived dObj;

    bObj.fun();
    dObj.fun();
    dObj.gun();

    return 0;
}