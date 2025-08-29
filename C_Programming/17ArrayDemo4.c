# include <stdio.h>

int main()
{
    int arr[5] = {10, 20, 30, 40, 50};

    printf("Size of arr : %lu \n", sizeof(arr)); // 20

    printf("arr : %lu \n", arr);
    printf("&arr : % lu \n", &arr);

    printf("Arr + 1 : %lu \n", arr + 1);
    printf("(&arr) + 1 : %lu \n", (&arr) + 1);

    return 0;
}