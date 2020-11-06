#!/bin/bash

nasm -f macho64 main.asm && ld -macosx_version_min 10.7.0 -lSystem -o main main.o && ./main
nasm -f macho64 sequence.asm && ld -macosx_version_min 10.7.0 -lSystem -o sequence sequence.o && ./sequence
