# include <iostream>
using namespace std;

int main()
{
    int iLength = 0;
    int *Arr = NULL;

    cout << "Enter the number of elements : \n";
    cin >> iLength;

    // Step 1 :- Allocate the memory
    Arr = new int[iLength];

    if(Arr == NULL)
    {
        cout << "Unable to allocate the memory \n";
    }
    else
    {
        cout << "Memory gets successfully allocated \n";
    }

    // Step 2 :- Use the memory

    // Step 3 :- Deallocate the memory
    delete [] Arr;

    return 0;
}