global start
section .text
start:
	; code to display message on console
        mov r9, 48
loop:
        cmp r9, 122
        jg done
	mov rax, 0x2000004	; system call for write
	mov rdi, 1		; stdout
	mov rsi, msg
        mov rcx, r9
        mov byte [rsi], cl
	mov rdx, msg.len
	syscall
        inc r9
        jmp loop
done:
	; code to exit
	mov rax, 0x2000001	; exit
	mov rdi, 0
	syscall

section .data
msg:	db	" ", 10
.len:	equ	$ - msg
