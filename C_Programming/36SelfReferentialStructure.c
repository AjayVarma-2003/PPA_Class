# include <stdio.h>

struct Demo
{
    int i;
    struct Demo *ptr;
};

int main()
{
    struct Demo obj1;
    struct Demo obj2;
    struct Demo obj3;

    obj1.i = 11;
    obj2.i = 21;
    obj3.i = 51;

    obj1.ptr = &obj2;
    obj2.ptr = &obj3;
    obj3.ptr = NULL;

    printf("obj1.i = %d \n", obj1.i);
    printf("obj2.i = %d \n", obj2.i);
    printf("obj3.i = %d \n", obj3.i);

    printf("\n");

    printf("address of structure Demo obj1 is : %lu \n", &obj1);
    printf("address of structure Demo obj2 is : %lu \n", &obj2);
    printf("address of structure Demo obj3 is : %lu \n", &obj3);

    printf("\n");

    printf("Value stored in pointer obj1.ptr is : %lu \n", obj1.ptr);
    printf("Value stored in pointer obj2.ptr is : %lu \n", obj2.ptr);
    printf("Value stored in pointer obj3.ptr is : %lu \n", obj3.ptr);

    printf("\n");

    printf("This becomes the linked list which will look like below : \n");
    printf("obj1 \t obj2 \t obj3 \n");
    printf("(11, %lu) -*> (21, %lu) -*> (51, NULL)", obj1.ptr, obj2.ptr);

    printf("\n");

    printf("Value of *obj1.ptr is : %d \n", *(obj1.ptr));
    printf("Value of *obj2.ptr is : %d \n", *(obj2.ptr));
    printf("Value of *obj3.ptr is : %d \n", NULL);

    return 0;
}