# make file - this is used for making all the c and/or c++ code

CC=gcc # compiler

all: simple_stack.o # target name
	$(CC) -o queue_using_stack queue_using_stack.c simple_stack.o

simple_stack.o: simple_stack.c simple_stack.h
	$(CC) -o simple_stack.o -c simple_stack.c

clean:
	rm $(TARGET)
