#!/bin/bash

g++ -S -mllvm -x86-asm-syntax=intel Int.cpp
g++ -S -mllvm -x86-asm-syntax=intel Stack.cpp
g++ -S -mllvm -x86-asm-syntax=intel -std=c++17 -O3 Queue.cpp
