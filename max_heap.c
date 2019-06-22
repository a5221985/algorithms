#include "stdio.h"
#include "max_heap.h"

Heap* initialize()
{
	Heap *heap = malloc(sizeof(Heap));

	if (heap != NULL)
	{
		heap->size = 0;
		heap->array = calloc(INITIAL_SIZE, sizeof(int));
	}

	return heap;
}

bool destroy(Heap **heap)
{
	if (heap != NULL && *heap != NULL)
	{
		if ((*heap)->array != NULL)
			free((*heap)->array);

		free(*heap);
	}
}

bool insert(Heap **heap, int *data)
{
	if (heap == NULL || *heap == NULL)
		return false;

	expand_if_necessary(heap);

	(*heap)->array[(*heap)->size] = *data;

	propagate(heap, (*heap)->size);
	
	(*heap)->size++;

	return true;
}

bool delete(Heap **heap)
{
	if (heap == NULL || (*heap) == NULL)
		return false;

	fill_hole(heap);

	return true;
}

bool propagate(Heap **heap, int index)
{
	while (index > 0)
	{
		int parent = (index - 1) / 2;
		if ((*heap)->array[index] > (*heap)->array[parent])
			swap(&(*heap)->array, parent, index);

		index = parent;
	}

}

bool expand_if_necessary(Heap **heap)
{
	if (heap == NULL || *heap == NULL)
		return false;

	int fill = (*heap)->size % INITIAL_SIZE;
	if (fill >= INCREMENT_FACTOR * INITIAL_SIZE)
	{
		(*heap)->array = realloc((*heap)->array, sizeof(int) * ((*heap)->size + INITIAL_SIZE));
		
		if ((*heap)->array == NULL)
			return false;

		(*heap)->size += INITIAL_SIZE;
	}

	return true;
}

bool swap(int **array, int i, int j)
{
	int t = (*array)[i];
	(*array)[i] = (*array)[j];
	(*array)[j] = t;

	return true;
}

bool swap_vals(int **array, int index, int *val)
{
	int t = (*array)[index];
	(*array)[index] = *val;
	(*val) = t;

	return true;
}

bool fill_hole(Heap **heap)
{
	if (heap == NULL || (*heap) == NULL || (*heap)->array == NULL)
		return false;

	if ((*heap)->size > 0)
	{
		int leaf = (*heap)->array[(*heap)->size - 1];

		(*heap)->array[0] = leaf;
		(*heap)->size--;

		propagate_leaf(heap, leaf);
	}

	return true;
}

bool propagate_leaf(Heap **heap, int leaf)
{
	int parent = 0;
	int left = -1;
	int right = -1;

	while (parent < (*heap)->size && left < (*heap)->size && right < (*heap)->size)
	{
		left = 2 * parent + 1;
		right = left + 1;

		if (left != -1 && leaf < (*heap)->array[left] && ((*heap)->array[left] >= (*heap)->array[right]))
		{
			swap(&(*heap)->array, left, parent);
			parent = left;
		}
		else if (right != -1 && right < (*heap)->array[right] && ((*heap)->array[left] <= (*heap)->array[right]))
		{
			swap(&(*heap)->array, right, parent);
			parent = right;
		}
	}

	return true;
}

void print(Heap **heap)
{
	for (int i = 0; i < (*heap)->size; i++)
	{
		printf("%d ", (*heap)->array[i]);
	}

	printf("\n");
}

bool get_max(Heap **heap, int *data)
{
	if (heap == NULL || (*heap) == NULL)
		return false;

	(*data) = (*heap)->array[0];

	return true;
}
