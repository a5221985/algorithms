#include <iostream>

using namespace std;

template<typename T>
class Stack
{
public:
    Stack();
    ~Stack();
    bool push(T item);
    T pop();

private:

    class Element
    {
    private:
	T item;
	Element *next;
    public:
	T getItem()
	{
            return item;
	}

	void setItem(T item)
	{
            this->item = item;
	}

	Element* getNext()
	{
            return next;
	}

	void setNext(Element *next)
	{
            this->next = next;
	}
    };

    Element *stack;
};

template<typename T>
Stack<T>::Stack()
{
    this->stack = new Element();
}

template<typename T>
Stack<T>::~Stack()
{
    delete(this->stack);
}

template<typename T>
bool Stack<T>::push(T item)
{
    Element *newElement = new Element();
    newElement->setItem(item);
    newElement->setNext(this->stack);
    this->stack = newElement;
    return true;
}

template<typename T>
T Stack<T>::pop()
{
    if (this->stack == NULL)
        throw NULL;

    T item = this->stack->getItem();
    Element *current = this->stack;
    this->stack = this->stack->getNext();
    delete(current);
    return item;
}

int main(int argc, char** argv)
{
    cout << "Hello World" << endl;
    Stack<int> *st = new Stack<int>();

    st->push(1);
    st->push(2);
    st->push(3);
    st->push(4);

    try {
        cout << st->pop() << endl;
        cout << st->pop() << endl;
        cout << st->pop() << endl;
        cout << st->pop() << endl;
        cout << st->pop() << endl;
    }
    catch (int x)
    {
        cout << "Stack is empty" << endl;
    }

    delete(st);
    return 0;
}
