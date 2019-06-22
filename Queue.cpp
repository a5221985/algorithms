#include <iostream>

using namespace std;

template<typename T>
class Queue
{
    private:
	    class Element
	    {
		    private:
			    T item;
			    Element *next;
			    Element *previous;
		    public:
			    T getItem();
			    void setItem(T item);
			    Element* getNext();
			    void setNext(Element *next);
			    Element* getPrevious();
			    void setPrevious(Element *previous);
	    };

	    Element *head;
	    Element *tail;
    public:
	    Queue();
	    ~Queue();
	    bool enqueue(T item);
	    T dequeue();
	    bool isQueueFull();
	    bool isQueueEmpty();
};

template<typename T>
Queue<T>::Queue()
{
	this->head = NULL;
	this->tail = NULL;
}

template<typename T>
Queue<T>::~Queue()
{
	if (this->head != NULL)
		delete(this->head);
	if (this->tail != NULL)
		delete(this->tail);
}

template<typename T>
bool Queue<T>::enqueue(T item)
{
	Element *newElement = new Element();
	newElement->setItem(item);
	newElement->setNext(this->head);

	if (this->head != NULL)
		this->head->setPrevious(newElement);
	this->head = newElement;

	if (this->tail == NULL)
		this->tail = this->head;

	return true;
}

template<typename T>
T Queue<T>::dequeue()
{
	Element *currentElement = this->tail;
	T item = currentElement->getItem();
	delete(currentElement);

	this->tail = this->tail->getPrevious();
	if (this->tail == NULL)
		this->head = NULL;

	return item;
}

template<typename T>
bool Queue<T>::isQueueFull()
{
	return true;
}

template<typename T>
bool Queue<T>::isQueueEmpty()
{
	return true;
}

template<typename T>
T Queue<T>::Element::getItem()
{
	return this->item;
}

template<typename T>
void Queue<T>::Element::setItem(T item)
{
	this->item = item;
}

template<typename T> 
typename Queue<T>::Element* Queue<T>::Element::getNext()
{
	return this->next;
}

template<typename T> 
void Queue<T>::Element::setNext(Element *next)
{
	this->next = next;
}

template<typename T>
typename Queue<T>::Element* Queue<T>::Element::getPrevious()
{
	return this->previous;
}

template<typename T>
void Queue<T>::Element::setPrevious(Element *previous)
{
	this->previous = previous;
}

int main(int argc, char** argv)
{
	Queue<int> *q = new Queue<int>();

	q->enqueue(1);
	q->enqueue(2);
	q->enqueue(3);
	q->enqueue(4);

	int item = 0;

	item = q->dequeue();
	cout << item << endl;

	item = q->dequeue();
	cout << item << endl;

	item = q->dequeue();
	cout << item << endl;
	
	item = q->dequeue();
	cout << item << endl;
	
	delete(q);
	return 0;
}
