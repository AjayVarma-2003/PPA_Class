# include <stdio.h>

int main()
{
    int arr[4] = {10, 20, 30, 40};
    
    printf("arr : %lu \n", arr);
    printf("&arr : %lu \n", &arr);
    printf("&(arr[0]) : %lu \n", &(arr[0]));

    return 0;
}