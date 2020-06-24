	.section	__TEXT,__text,regular,pure_instructions
	.macosx_version_min 10, 13
	.intel_syntax noprefix
	.globl	__ZN3IntC2Ei            ## -- Begin function _ZN3IntC2Ei
	.p2align	4, 0x90
__ZN3IntC2Ei:                           ## @_ZN3IntC2Ei
	.cfi_startproc
## %bb.0:
	push	rbp
	.cfi_def_cfa_offset 16
	.cfi_offset rbp, -16
	mov	rbp, rsp
	.cfi_def_cfa_register rbp
	mov	qword ptr [rbp - 8], rdi
	mov	dword ptr [rbp - 12], esi
	mov	rdi, qword ptr [rbp - 8]
	mov	esi, dword ptr [rbp - 12]
	mov	dword ptr [rdi], esi
	pop	rbp
	ret
	.cfi_endproc
                                        ## -- End function
	.globl	__ZN3IntC1Ei            ## -- Begin function _ZN3IntC1Ei
	.p2align	4, 0x90
__ZN3IntC1Ei:                           ## @_ZN3IntC1Ei
	.cfi_startproc
## %bb.0:
	push	rbp
	.cfi_def_cfa_offset 16
	.cfi_offset rbp, -16
	mov	rbp, rsp
	.cfi_def_cfa_register rbp
	sub	rsp, 16
	mov	qword ptr [rbp - 8], rdi
	mov	dword ptr [rbp - 12], esi
	mov	rdi, qword ptr [rbp - 8]
	mov	esi, dword ptr [rbp - 12]
	call	__ZN3IntC2Ei
	add	rsp, 16
	pop	rbp
	ret
	.cfi_endproc
                                        ## -- End function
	.globl	__ZN3IntD2Ev            ## -- Begin function _ZN3IntD2Ev
	.p2align	4, 0x90
__ZN3IntD2Ev:                           ## @_ZN3IntD2Ev
	.cfi_startproc
## %bb.0:
	push	rbp
	.cfi_def_cfa_offset 16
	.cfi_offset rbp, -16
	mov	rbp, rsp
	.cfi_def_cfa_register rbp
	mov	qword ptr [rbp - 8], rdi
	pop	rbp
	ret
	.cfi_endproc
                                        ## -- End function
	.globl	__ZN3IntD1Ev            ## -- Begin function _ZN3IntD1Ev
	.p2align	4, 0x90
__ZN3IntD1Ev:                           ## @_ZN3IntD1Ev
	.cfi_startproc
## %bb.0:
	push	rbp
	.cfi_def_cfa_offset 16
	.cfi_offset rbp, -16
	mov	rbp, rsp
	.cfi_def_cfa_register rbp
	sub	rsp, 16
	mov	qword ptr [rbp - 8], rdi
	mov	rdi, qword ptr [rbp - 8]
	call	__ZN3IntD2Ev
	add	rsp, 16
	pop	rbp
	ret
	.cfi_endproc
                                        ## -- End function
	.globl	__ZN3Int8getValueEv     ## -- Begin function _ZN3Int8getValueEv
	.p2align	4, 0x90
__ZN3Int8getValueEv:                    ## @_ZN3Int8getValueEv
	.cfi_startproc
## %bb.0:
	push	rbp
	.cfi_def_cfa_offset 16
	.cfi_offset rbp, -16
	mov	rbp, rsp
	.cfi_def_cfa_register rbp
	mov	qword ptr [rbp - 8], rdi
	mov	rdi, qword ptr [rbp - 8]
	mov	eax, dword ptr [rdi]
	pop	rbp
	ret
	.cfi_endproc
                                        ## -- End function
	.globl	__ZN3Int8setValueEi     ## -- Begin function _ZN3Int8setValueEi
	.p2align	4, 0x90
__ZN3Int8setValueEi:                    ## @_ZN3Int8setValueEi
	.cfi_startproc
## %bb.0:
	push	rbp
	.cfi_def_cfa_offset 16
	.cfi_offset rbp, -16
	mov	rbp, rsp
	.cfi_def_cfa_register rbp
	mov	qword ptr [rbp - 8], rdi
	mov	dword ptr [rbp - 12], esi
	mov	rdi, qword ptr [rbp - 8]
	cmp	dword ptr [rbp - 12], 0
	mov	qword ptr [rbp - 24], rdi ## 8-byte Spill
	jge	LBB5_2
## %bb.1:
	jmp	LBB5_3
LBB5_2:
	mov	eax, dword ptr [rbp - 12]
	mov	rcx, qword ptr [rbp - 24] ## 8-byte Reload
	mov	dword ptr [rcx], eax
LBB5_3:
	pop	rbp
	ret
	.cfi_endproc
                                        ## -- End function
	.globl	_main                   ## -- Begin function main
	.p2align	4, 0x90
_main:                                  ## @main
Lfunc_begin0:
	.cfi_startproc
	.cfi_personality 155, ___gxx_personality_v0
	.cfi_lsda 16, Lexception0
## %bb.0:
	push	rbp
	.cfi_def_cfa_offset 16
	.cfi_offset rbp, -16
	mov	rbp, rsp
	.cfi_def_cfa_register rbp
	sub	rsp, 80
	mov	dword ptr [rbp - 4], 0
	mov	dword ptr [rbp - 8], edi
	mov	qword ptr [rbp - 16], rsi
	mov	edi, 4
                                        ## kill: def %rdi killed %edi
	call	__Znwm
	mov	rsi, rax
	mov	rdi, rax
Ltmp0:
	mov	ecx, 20
	mov	qword ptr [rbp - 48], rdi ## 8-byte Spill
	mov	rdi, rax
	mov	qword ptr [rbp - 56], rsi ## 8-byte Spill
	mov	esi, ecx
	call	__ZN3IntC1Ei
Ltmp1:
	jmp	LBB6_1
LBB6_1:
	mov	rax, qword ptr [rbp - 48] ## 8-byte Reload
	mov	qword ptr [rbp - 24], rax
	mov	rdi, qword ptr [rbp - 24]
	call	__ZN3Int8getValueEv
	lea	rdi, [rip + L_.str]
	mov	esi, eax
	mov	al, 0
	call	_printf
	mov	rdi, qword ptr [rbp - 24]
	cmp	rdi, 0
	mov	dword ptr [rbp - 60], eax ## 4-byte Spill
	mov	qword ptr [rbp - 72], rdi ## 8-byte Spill
	je	LBB6_4
## %bb.2:
Ltmp3:
	mov	rdi, qword ptr [rbp - 72] ## 8-byte Reload
	call	__ZN3IntD1Ev
Ltmp4:
	jmp	LBB6_3
LBB6_3:
	mov	rax, qword ptr [rbp - 72] ## 8-byte Reload
	mov	rdi, rax
	call	__ZdlPv
LBB6_4:
	mov	eax, dword ptr [rbp - 4]
	add	rsp, 80
	pop	rbp
	ret
LBB6_5:
Ltmp2:
	mov	ecx, edx
	mov	qword ptr [rbp - 32], rax
	mov	dword ptr [rbp - 36], ecx
	mov	rdi, qword ptr [rbp - 56] ## 8-byte Reload
	call	__ZdlPv
	jmp	LBB6_7
LBB6_6:
Ltmp5:
	mov	ecx, edx
	mov	qword ptr [rbp - 32], rax
	mov	dword ptr [rbp - 36], ecx
	mov	rax, qword ptr [rbp - 72] ## 8-byte Reload
	mov	rdi, rax
	call	__ZdlPv
LBB6_7:
	mov	rdi, qword ptr [rbp - 32]
	call	__Unwind_Resume
	ud2
Lfunc_end0:
	.cfi_endproc
	.section	__TEXT,__gcc_except_tab
	.p2align	2
GCC_except_table6:
Lexception0:
	.byte	255                     ## @LPStart Encoding = omit
	.byte	155                     ## @TType Encoding = indirect pcrel sdata4
	.asciz	"\303\200"              ## @TType base offset
	.byte	3                       ## Call site Encoding = udata4
	.byte	65                      ## Call site table length
Lset0 = Lfunc_begin0-Lfunc_begin0       ## >> Call Site 1 <<
	.long	Lset0
Lset1 = Ltmp0-Lfunc_begin0              ##   Call between Lfunc_begin0 and Ltmp0
	.long	Lset1
	.long	0                       ##     has no landing pad
	.byte	0                       ##   On action: cleanup
Lset2 = Ltmp0-Lfunc_begin0              ## >> Call Site 2 <<
	.long	Lset2
Lset3 = Ltmp1-Ltmp0                     ##   Call between Ltmp0 and Ltmp1
	.long	Lset3
Lset4 = Ltmp2-Lfunc_begin0              ##     jumps to Ltmp2
	.long	Lset4
	.byte	0                       ##   On action: cleanup
Lset5 = Ltmp1-Lfunc_begin0              ## >> Call Site 3 <<
	.long	Lset5
Lset6 = Ltmp3-Ltmp1                     ##   Call between Ltmp1 and Ltmp3
	.long	Lset6
	.long	0                       ##     has no landing pad
	.byte	0                       ##   On action: cleanup
Lset7 = Ltmp3-Lfunc_begin0              ## >> Call Site 4 <<
	.long	Lset7
Lset8 = Ltmp4-Ltmp3                     ##   Call between Ltmp3 and Ltmp4
	.long	Lset8
Lset9 = Ltmp5-Lfunc_begin0              ##     jumps to Ltmp5
	.long	Lset9
	.byte	0                       ##   On action: cleanup
Lset10 = Ltmp4-Lfunc_begin0             ## >> Call Site 5 <<
	.long	Lset10
Lset11 = Lfunc_end0-Ltmp4               ##   Call between Ltmp4 and Lfunc_end0
	.long	Lset11
	.long	0                       ##     has no landing pad
	.byte	0                       ##   On action: cleanup
	.p2align	2
                                        ## -- End function
	.section	__TEXT,__cstring,cstring_literals
L_.str:                                 ## @.str
	.asciz	"%d\n"


.subsections_via_symbols
