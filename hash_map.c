#include "stdio.h"
#include "stdlib.h"
#include "stdbool.h"

typedef struct Node
{
	char *key;
	int size;
	int value;
	struct Node *next;
} Node;

typedef struct HashMap
{
	Node *head;
	Node *tail;
} HashMap;

HashMap* initialize(int size);
bool put(HashMap **map, char *key, int size, int value);
bool get(HashMap **map, char *key, int size, int *value);
bool find_value(HashMap **map, char *key, int size, int index, int *value);
bool compare(char *map_key, int map_value_size, char *key, int size);
bool get_index(char *s, int size, int *index);
bool get_hash_code(char *s, int size, int *code);
bool destroy(HashMap **map, int size);

int main()
{
	int size = 10;
	HashMap *map = initialize(size);

	put(&map, "one", 3, 1);
	put(&map, "two", 3, 2);
	put(&map, "three", 4, 3);
	put(&map, "four", 4, 4);
	put(&map, "five", 4, 5);
	put(&map, "six", 3, 6);
	put(&map, "seven", 5, 7);
	put(&map, "eight", 5, 8);
	put(&map, "nine", 4, 9);
	put(&map, "ten", 3, 10);

	int value = 0;
	
	get(&map, "one", 3, &value);
	printf("KEY: one, VALUE: %d\n", value);

	get(&map, "two", 3, &value);
	printf("KEY: two, VALUE: %d\n", value);
	
	get(&map, "three", 4, &value);
	printf("KEY: three, VALUE: %d\n", value);

	get(&map, "four", 4, &value);
	printf("KEY: four, VALUE: %d\n", value);
	
	get(&map, "five", 4, &value);
	printf("KEY: five, VALUE: %d\n", value);
	
	get(&map, "six", 3, &value);
	printf("KEY: six, VALUE: %d\n", value);
	
	get(&map, "seven", 5, &value);
	printf("KEY: seven, VALUE: %d\n", value);
	
	get(&map, "eight", 5, &value);
	printf("KEY: eight, VALUE: %d\n", value);
	
	get(&map, "nine", 4, &value);
	printf("KEY: nine, VALUE: %d\n", value);
	
	get(&map, "ten", 3, &value);
	printf("KEY: ten, VALUE: %d\n", value);

	destroy(&map, size);

	return 0;
}

HashMap* initialize(int size)
{
	HashMap *map = calloc(size, sizeof(HashMap));

	for (int i = 0; i < size; i++)
	{
		map[i].head = NULL;
		map[i].tail = NULL;
	}

	return map;
}

bool put(HashMap **map, char *key, int size, int value)
{
	if (map == NULL || key == NULL || size <= 0)
		return false;

	int i = 0;
	get_index(key, size, &i);

	Node *newNode = malloc(sizeof(Node));

	if (newNode == NULL)
		return false;

	newNode->key = key;
	newNode->size = size;
	newNode->value = value;
	newNode->next = NULL;

	if ((*map)[i].tail != NULL)
		(*map)[i].tail->next = newNode;

	(*map)[i].tail = newNode;

	if ((*map)[i].head == NULL)
		(*map)[i].head = newNode;

	return true;
}

bool get(HashMap **map, char *key, int size, int *value)
{
	if (key == NULL || size <= 0)
		return false;

	int index = 0;
	get_index(key, size, &index);

	if (index < 0 || index >= size)
		return false;

	find_value(map, key, size, index, value);

	if (value == NULL)
		return false;

	return true;
}

bool find_value(HashMap **map, char *key, int size, int index, int *value)
{
	if (map == NULL || value == NULL)
		return false;

	Node *current = (*map)[index].head;

	while (current != NULL)
	{
		bool equal = compare(current->key, current->size, key, size);
		if (equal)
		{
			(*value) = current->value;
			return true;
		}
		current = current->next;
	}

	return false;
}

bool compare(char *map_key, int map_value_size, char *key, int size)
{
	if (map_value_size != size)
		return false;

	for (int i = 0; i < size; i++)
		if (map_key[i] != key[i])
			return false;

	return true;
}

bool get_index(char *s, int size, int *index)
{
	if (s == NULL || size <= 0)
		return false;

	int code = 0;
	get_hash_code(s, size, &code);

	(*index) = code % size;

	return true;
}

bool get_hash_code(char *s, int size, int *code)
{
	if (s == NULL || code == NULL)
		return false;

	int h = 17;

	for (int i = 0; i < size; i++)
		h = 31 * h + s[i];

	(*code) = h;

	return true;
}

bool destroy(HashMap **map, int size)
{
	if (map == NULL || (*map) == NULL)
		return false;

	for (int i = 0; i < size; i++)
	{
		while ((*map)[i].head != NULL)
		{
			Node *current = (*map)[i].head;
			(*map)[i].head = (*map)[i].head->next;
			free(current);
		}

		(*map)[i].tail = NULL;
	}


	free(*map);

	return true;
}
