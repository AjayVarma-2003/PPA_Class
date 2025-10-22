# include <iostream>
using namespace std;

class Demo
{
    public:
        void Display()
        {
            cout << "Inside Demo Display ...\n";
        }
};

int main()
{
    Demo dObj;

    cout << sizeof(dObj) << "\n";    // 1 byte.

    return 0;
}