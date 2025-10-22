# include <stdio.h>
# include <stdlib.h>

int main()
{
    int iLength = 0;
    int *Arr = NULL;

    printf("Enter the number of elements : \n");
    scanf("%d", &iLength);

    // Step 1 :- Allocate the memory
    Arr = (int *) malloc (iLength * sizeof(int));

    if(Arr == NULL)
    {
        printf("Unable to allocate memory \n");
    }
    else
    {
        printf("Memory gets successfully allocated \n");
    }

    // Step 2 :- Use the memory

    // Step 3 :- Free the memory
    free(Arr);

    return 0;
}