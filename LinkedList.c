#include "stdio.h"
#include "stdlib.h"
#include "stdbool.h"

typedef struct Node
{
	void *data;
	struct Node *next;
} Node;

typedef struct LinkedList
{
	Node *head;
} LinkedList;

LinkedList *initialize();
bool insert(LinkedList **list, void *data);
//bool delete(LinkedList **list, void *data);
//bool insertAfter(LinkedList **list, Node *node, void *data);
bool readFirst(LinkedList **list, void **data);
bool print(LinkedList *list);
bool destroy(LinkedList *list);

LinkedList* initialize()
{
	LinkedList *list = malloc(sizeof(LinkedList));
	list->head = NULL;
	return list;
}

bool insert(LinkedList **list, void *data)
{
	if (list == NULL || (*list) == NULL)
		return false;

	Node *newNode = malloc(sizeof(Node));
	newNode->data = data;

	newNode->next = (*list)->head;
	(*list)->head = newNode;

	return true;
}

bool readFirst(LinkedList **list, void **data)
{
	if (list == NULL || (*list) == NULL || (*list)->head == NULL)
		return false;

	(*data) = (*list)->head->data;

	return true;
}

bool destroy(LinkedList *list)
{
	if (list != NULL)
	{
		if (list->head != NULL)
			free(list->head);

		free(list);
	}

	return true;
}

bool print(LinkedList *list)
{
	if (list == NULL || list->head == NULL)
		return false;

	Node *current = list->head;


	while (current != NULL)
	{
		int *data = current->data;
		printf("%d\n", (*data));
		current = current->next;
	}

	return true;
}

int main()
{
	int data = 0;
	int *out = NULL;
	LinkedList *list = initialize();

	int *a = calloc(10, sizeof(int));
	for (int i = 0; i < 10; i++)
		a[i] = i + 1;

	if (list != NULL)
	{
		for (int i = 0; i < 10; i++)
		{
			insert(&list, (void*) &a[i]);
		}

		if (readFirst(&list, (void**) &out))
			printf("FIRST: %d\n\n", (int) (*out));

		print(list);

		destroy(list);
	}


	free(a);

	return 0;
}
