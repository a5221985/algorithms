global start
section .text
start:
	; code to display message on console
	mov rax, 0x2000004	; system call for write
	mov rdi, 1		; stdout
	mov rsi, msg
	mov rdx, msg.len
	syscall

	; code to exit
	mov rax, 0x2000001	; exit
	mov rdi, 0
	syscall

section .data
msg:	db	"Alhamdulillah!", 10
.len:	equ	$ - msg
        

