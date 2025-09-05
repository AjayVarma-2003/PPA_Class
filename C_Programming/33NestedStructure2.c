# include <stdio.h>

struct Demo
{
    int i;
    float f;
};

struct Hello
{
    int no;
    float marks;
    struct Demo dobj1;
    struct Demo dobj2;
};

int main()
{
    struct Hello hobj;

    printf("Size of structure hello is : %lu \n", sizeof(hobj));

    return 0;
}