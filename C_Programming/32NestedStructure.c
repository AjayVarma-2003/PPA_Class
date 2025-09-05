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
    struct Demo dObj;    // Nested structure - one structure contains the object of another structure
};

int main()
{
    printf("Size of structure Hello is : %lu \n", sizeof(struct Hello));    // 16

    return 0;
}