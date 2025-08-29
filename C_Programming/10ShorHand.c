# include <stdio.h>

int main()
{
    int i = 10, j = 10;
    int iAns = 0, jAns = 0;

    iAns = i++;
    jAns = ++j;

    printf("Value of i : %d \n", i);                // 11
    printf("Value of iAns is : %d \n", iAns);       // 10

    printf("Value of j is : %d \n", j);             // 11
    printf("Value of jAns is : %d \n", jAns);       // 11

    return 0;
}