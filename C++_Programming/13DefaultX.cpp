# include <iostream>
using namespace std;

float Area(float Rad, float PI = 3.14)
{
    float fAns = 0.0f;
    fAns = PI * Rad * Rad;
    return fAns;
}

int main()
{
    float fRet = 0.0f;

    fRet = Area(10.5f);

    cout<< "Area of circle is : "<< fRet<< "\n";

    fRet = Area(10.5f, 9.5f);
    cout<< "Area of circle is : "<< fRet<< "\n";

    return 0;
}

/*
// Allowed
void fun(int a, int b, int c)
{}
void fun(int a, int b, int c = 11)
{}
void fun(int a, int b = 10, int c = 11)
{}

// Not Allowed
void fun(int a, int b = 10, int c)
{}
void fun(int a = 9, int b = 10, int c)
{}
void fun(int a = 9, int b, int c)
{}
*/