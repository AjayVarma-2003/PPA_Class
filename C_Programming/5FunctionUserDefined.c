# include <stdio.h>

int Addition(int iNo1, int iNo2)
{
    int iSum = 0;

    iSum = iNo1 + iNo2;
    
    return iSum;
}

int main()
{
    int iValue1 = 0, iValue2 = 0, iAns = 0;

    iValue1 = 10;
    iValue2 = 11;

    iAns = Addition(iValue1, iValue2);

    printf("Addition is : %d \n", iAns);

    return 0;
}