# include <stdio.h>

int main()
{
    int iNo1 = 10;
    const int iNo2 = 20;

    iNo1++;    // iNo1 = iNo1 + 1;

    // Below lines generates errors
    // iNo2++;    // iNo2 = iNo2 + 1;    error
    // iNo2 = 30;    // error

    return 0;
}