# include <stdio.h>

int main()
{
    double arr [] = {10.0, 20.0, 30.0, 40.0};

    printf("Size of arr is : %lu \n", sizeof(arr));    // 32

    // arr++;    // we can not update the base address of the array in any language. // error

    return 0;
}