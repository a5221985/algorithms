# make file - this is used for making all the c and/or c++ code

CC=gcc # compiler

queue_using_stack: simple_stack.o # target name
	#$(CC) -o queue_using_stack queue_using_stack.c simple_stack.o
	$(CC) -o queue_using_stack queue_using_stack.c -L/Users/am/Documents/algorithms -lsimple_stack

sorting_stack: simple_stack.o
	$(CC) -o sorting_stack sorting_stack.c simple_stack.o

libsimple_stack.so: simple_stack.o
	$(CC) -shared -o libsimple_stack.so simple_stack.o -lm

simple_stack.o: simple_stack.c simple_stack.h
	$(CC) -o simple_stack.o -c simple_stack.c

clean:
	rm *.o
