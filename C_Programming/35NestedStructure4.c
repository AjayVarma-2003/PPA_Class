# include <stdio.h>

struct Demo
{
    int i;
    float f;
    // struct Demo dObj;    // Not Allowed to make the object of same structure inside it.
};

int main()
{
    printf("Size of structure Demo is : %lu \n", sizeof(struct Demo));

    return 0;
}