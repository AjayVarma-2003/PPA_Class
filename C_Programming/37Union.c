# include <stdio.h>

union demo
{
    int i;
    float f;
    double d;
};

struct Hello
{
    int i;
    float f;
    double d;
};

int main()
{
    printf("Size of structure Hello with 1 int, 1 float and 1 double is : %lu \n", sizeof(struct Hello));

    printf("Size of union demo with 1 int, 1 float, and 1 double is : %lu \n", sizeof(union demo));

    return 0;
}