# include <iostream>
using namespace std;

class Demo
{
    public:
        int i;
        int j;
        static int x;

        Demo()
        {
            this -> i = 0;
            this -> j = 0;
        }

        Demo(int A, int B)
        {
            this -> i = A;
            this -> j = B;
        }

        void fun()
        {
            cout<< "Inside fun \n";
            cout<< "Value of i is : "<< this -> i<< "\n";
            cout<< "Value of j is : "<< this -> j<< "\n";
            cout<< "Value of x is : "<< x<< "\n";
        }

        static void gun()
        {
            cout<< "Inside gun \n";
        }
};

int Demo :: x = 11;

int main()
{
    Demo :: gun();

    cout<< "Value of X is : "<< Demo :: x<< "\n";

    Demo obj(10, 20);

    obj.fun();

    return 0;
}