#include "stdio.h"
#include "max_heap.h"

int main()
{
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Heap *heap = initialize();

        for (int i = 0; i < 9; i++)
                insert(&heap, &a[i]);

        print(&heap);

        int max = 0;
        get_max(&heap, &max);
        printf("MAX: %d\n", max);

        delete(&heap);

        print(&heap);
        get_max(&heap, &max);
        printf("MAX: %d\n", max);

        delete(&heap);

        print(&heap);
        get_max(&heap, &max);
        printf("MAX: %d\n", max);

        delete(&heap);

        print(&heap);
        get_max(&heap, &max);
        printf("MAX: %d\n", max);

        delete(&heap);

        print(&heap);
        get_max(&heap, &max);
        printf("MAX: %d\n", max);

        delete(&heap);

        print(&heap);
        get_max(&heap, &max);
        printf("MAX: %d\n", max);

        delete(&heap);

        print(&heap);
        get_max(&heap, &max);
        printf("MAX: %d\n", max);

        delete(&heap);

        print(&heap);
        get_max(&heap, &max);
        printf("MAX: %d\n", max);

        delete(&heap);

        print(&heap);
        get_max(&heap, &max);
        printf("MAX: %d\n", max);

        destroy(&heap);

        return 0;
}

