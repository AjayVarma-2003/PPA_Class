# include <stdio.h>

struct Demo
{
    int i;
    float f;
    int j;
};

int main()
{

    printf("Size of Demo is : %lu \n", sizeof(struct Demo));    // Memory is not still allocated. This will show kiti memory milel.
    
    struct Demo obj;
    printf("Size of object is : %lu \n", sizeof(obj));

    return 0;
}