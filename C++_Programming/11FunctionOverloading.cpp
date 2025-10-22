# include <iostream>
using namespace std;

class Demo
{
    public:
        // Overloading by changing number of parameters
        // fun@2ii
        void fun(int i, int j)
        {}
        // fun@3iii
        void fun(int i, int j, int k)
        {}

        // Overloading by changing sequence of parameters
        // gun@2id
        void gun(int A, double d)
        {}
        // gun@2di
        void gun(double d, int A)
        {}

        // Overloading by changing datatype of parameters
        // sun@2cc
        void sun(char ch1, char ch2)
        {}
        // sun@2ff
        void sun(float f1, float f2)
        {}

        /*
        // We can not overload by changing return type of function
        // run@2ii
        int run(int A, int B)
        {}
        // run@2ii
        float run(int A, int B)
        {}
        */
};

int main()
{

    return 0;
}