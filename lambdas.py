#!/usr/local/bin/python3

functions = []
for i in range(10):
    functions.append(lambda : i)

for f in functions:
    print(f())
