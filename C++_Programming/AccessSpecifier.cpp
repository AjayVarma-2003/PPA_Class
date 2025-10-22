# include <iostream>
using namespace std;

class Base    // 12
{
    public:
        int i;
    
    private:
        int j;

    protected:
        int k;

    public:
        Base()
        {
            this -> i = 10;
            this -> j = 20;
            this -> k = 30;
        }

        void fun()
        {
            cout << i << "\n";    // Allowed
            cout << j << "\n";    // Allowed
            cout << k << "\n";    // Allowed
        }
};

class Derived : public Base    // 16
{
    public:
        int x;

        void display()
        {
            cout << i << "\n";    // Allowed
            cout << j << "\n";    // Not allowed because it is private.
            cout << k << "\n";    // Allowed
        }
};

int main()
{
    Base bObj;
    Derived dObj;

    cout << bObj.i << "\n";    // Allowed
    cout << bObj.j << "\n";    // Not allowed
    cout << bObj.k << "\n";    // Not allowed

    cout << dObj.i << "\n";    // Allowed
    cout << dObj.j << "\n";    // Not allowed
    cout << dObj.k << "\n";    // Not allowed

    dObj.fun();     // Allowed
    dObj.display(); // Allowed

    return 0;
}