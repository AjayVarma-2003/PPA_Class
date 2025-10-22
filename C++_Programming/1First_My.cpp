# include <iostream>

using namespace std;

class Demo
{
    public:
        int iNo1;    // Characters
        int iNo2;

        // Behaviours

        Demo()    // Default constructor
        {
            iNo1 = 0;
            iNo2 = 0;
        }

        Demo(int a, int b)    // Parameterized constructor
        {
            iNo1 = a;
            iNo2 = b;
        }

        ~Demo()    // Destructor
        {
            // Logic
        }
};

int main()
{
    Demo obj1;    // object of class Demo. Here the default constructor will get called
    Demo obj2(11, 21);    // object of class Demo. Here the parameterized constructor will get called.

    cout<< "Jay Ganesh ..."<< endl;

    cout<< "obj1.iNo1 = "<< obj1.iNo1<< "\n";
    cout<< "obj1.iNo2 = "<< obj1.iNo2<< "\n";
    
    cout<< "obj2.iNo1 = "<< obj2.iNo1<< "\n";
    cout<< "obj2.iNo2 = "<< obj2.iNo2<< "\n";

    return 0;
}