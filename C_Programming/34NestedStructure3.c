# include <stdio.h>

struct Hello
{
    int no;
    float marks;
    struct Demo
    {
        int i;
        float f;
    } dobj;
};

int main()
{
    printf("Size of Structure Hello is : %lu \n", sizeof(struct Hello));

    return 0;
}