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

        void fun()    // void Fun(Demo * const this)
        {
            cout<< "Inside fun \n";
        }

        static void gun()    // static void gun(0)
        {
            cout<< "Inside gun \n";
        }
};

int Demo :: x = 11;

int main()
{
    Demo :: gun();

    cout<< "Value of X is : "<< Demo :: x<< "\n";

    return 0;
}