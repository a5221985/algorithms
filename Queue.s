	.section	__TEXT,__text,regular,pure_instructions
	.macosx_version_min 10, 13
	.intel_syntax noprefix
	.section	__TEXT,__literal16,16byte_literals
	.p2align	4               ## -- Begin function main
LCPI0_0:
	.space	16
	.section	__TEXT,__text,regular,pure_instructions
	.globl	_main
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
	push	r15
	push	r14
	push	r13
	push	r12
	push	rbx
	push	rax
	.cfi_offset rbx, -56
	.cfi_offset r12, -48
	.cfi_offset r13, -40
	.cfi_offset r14, -32
	.cfi_offset r15, -24
	mov	edi, 16
	call	__Znwm
	mov	r15, rax
	mov	qword ptr [r15 + 8], 0
	mov	qword ptr [r15], 0
	mov	edi, 24
	call	__Znwm
	mov	r12, rax
	xorps	xmm0, xmm0
	movaps	xmmword ptr [r12], xmm0
	mov	qword ptr [r12 + 16], 0
	mov	dword ptr [r12], 1
	mov	qword ptr [r12 + 8], 0
	mov	qword ptr [r15], r12
	mov	qword ptr [r15 + 8], r12
	mov	edi, 24
	call	__Znwm
	mov	rbx, rax
	xorps	xmm0, xmm0
	movaps	xmmword ptr [rbx], xmm0
	mov	qword ptr [rbx + 16], 0
	mov	dword ptr [rbx], 2
	mov	qword ptr [rbx + 8], r12
	mov	qword ptr [r12 + 16], rbx
	mov	qword ptr [r15], rbx
	mov	edi, 24
	call	__Znwm
	mov	r13, rax
	xorps	xmm0, xmm0
	movaps	xmmword ptr [r13], xmm0
	mov	qword ptr [r13 + 16], 0
	mov	dword ptr [r13], 3
	mov	qword ptr [r13 + 8], rbx
	mov	qword ptr [rbx + 16], r13
	mov	qword ptr [r15], r13
	mov	edi, 24
	call	__Znwm
	mov	r14, rax
	xorps	xmm0, xmm0
	movaps	xmmword ptr [r14], xmm0
	mov	qword ptr [r14 + 16], 0
	mov	dword ptr [r14], 4
	mov	qword ptr [r14 + 8], r13
	mov	qword ptr [r13 + 16], r14
	mov	qword ptr [r15], r14
	mov	r13d, dword ptr [r12]
	mov	rdi, r12
	call	__ZdlPv
	mov	r12, qword ptr [r12 + 16]
	mov	qword ptr [r15 + 8], r12
	test	r12, r12
	jne	LBB0_2
## %bb.1:
	mov	qword ptr [r15], 0
	xor	r14d, r14d
LBB0_2:
	mov	rdi, qword ptr [rip + __ZNSt3__14coutE@GOTPCREL]
	mov	esi, r13d
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi
	mov	rbx, rax
	mov	rax, qword ptr [rbx]
	mov	rsi, qword ptr [rax - 24]
	add	rsi, rbx
	lea	r13, [rbp - 48]
	mov	rdi, r13
	call	__ZNKSt3__18ios_base6getlocEv
Ltmp0:
	mov	rsi, qword ptr [rip + __ZNSt3__15ctypeIcE2idE@GOTPCREL]
	mov	rdi, r13
	call	__ZNKSt3__16locale9use_facetERNS0_2idE
Ltmp1:
## %bb.3:
	mov	rcx, qword ptr [rax]
Ltmp2:
	mov	esi, 10
	mov	rdi, rax
	call	qword ptr [rcx + 56]
	mov	r13d, eax
Ltmp3:
## %bb.4:
	lea	rdi, [rbp - 48]
	call	__ZNSt3__16localeD1Ev
	movsx	esi, r13b
	mov	rdi, rbx
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc
	mov	rdi, rbx
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv
	mov	ebx, dword ptr [r12]
	mov	rdi, r12
	call	__ZdlPv
	mov	r12, qword ptr [r12 + 16]
	mov	qword ptr [r15 + 8], r12
	test	r12, r12
	jne	LBB0_6
## %bb.5:
	mov	qword ptr [r15], 0
	xor	r14d, r14d
LBB0_6:
	mov	rdi, qword ptr [rip + __ZNSt3__14coutE@GOTPCREL]
	mov	esi, ebx
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi
	mov	rbx, rax
	mov	rax, qword ptr [rbx]
	mov	rsi, qword ptr [rax - 24]
	add	rsi, rbx
	lea	r13, [rbp - 48]
	mov	rdi, r13
	call	__ZNKSt3__18ios_base6getlocEv
Ltmp5:
	mov	rsi, qword ptr [rip + __ZNSt3__15ctypeIcE2idE@GOTPCREL]
	mov	rdi, r13
	call	__ZNKSt3__16locale9use_facetERNS0_2idE
Ltmp6:
## %bb.7:
	mov	rcx, qword ptr [rax]
Ltmp7:
	mov	esi, 10
	mov	rdi, rax
	call	qword ptr [rcx + 56]
	mov	r13d, eax
Ltmp8:
## %bb.8:
	lea	rdi, [rbp - 48]
	call	__ZNSt3__16localeD1Ev
	movsx	esi, r13b
	mov	rdi, rbx
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc
	mov	rdi, rbx
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv
	mov	ebx, dword ptr [r12]
	mov	rdi, r12
	call	__ZdlPv
	mov	r12, qword ptr [r12 + 16]
	mov	qword ptr [r15 + 8], r12
	test	r12, r12
	jne	LBB0_10
## %bb.9:
	mov	qword ptr [r15], 0
	xor	r14d, r14d
LBB0_10:
	mov	rdi, qword ptr [rip + __ZNSt3__14coutE@GOTPCREL]
	mov	esi, ebx
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi
	mov	rbx, rax
	mov	rax, qword ptr [rbx]
	mov	rsi, qword ptr [rax - 24]
	add	rsi, rbx
	lea	r13, [rbp - 48]
	mov	rdi, r13
	call	__ZNKSt3__18ios_base6getlocEv
Ltmp10:
	mov	rsi, qword ptr [rip + __ZNSt3__15ctypeIcE2idE@GOTPCREL]
	mov	rdi, r13
	call	__ZNKSt3__16locale9use_facetERNS0_2idE
Ltmp11:
## %bb.11:
	mov	rcx, qword ptr [rax]
Ltmp12:
	mov	esi, 10
	mov	rdi, rax
	call	qword ptr [rcx + 56]
	mov	r13d, eax
Ltmp13:
## %bb.12:
	lea	rdi, [rbp - 48]
	call	__ZNSt3__16localeD1Ev
	movsx	esi, r13b
	mov	rdi, rbx
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc
	mov	rdi, rbx
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv
	mov	ebx, dword ptr [r12]
	mov	rdi, r12
	call	__ZdlPv
	mov	r12, qword ptr [r12 + 16]
	mov	qword ptr [r15 + 8], r12
	test	r12, r12
	jne	LBB0_14
## %bb.13:
	mov	qword ptr [r15], 0
	xor	r14d, r14d
LBB0_14:
	mov	rdi, qword ptr [rip + __ZNSt3__14coutE@GOTPCREL]
	mov	esi, ebx
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi
	mov	rbx, rax
	mov	rax, qword ptr [rbx]
	mov	rsi, qword ptr [rax - 24]
	add	rsi, rbx
	lea	r13, [rbp - 48]
	mov	rdi, r13
	call	__ZNKSt3__18ios_base6getlocEv
Ltmp15:
	mov	rsi, qword ptr [rip + __ZNSt3__15ctypeIcE2idE@GOTPCREL]
	mov	rdi, r13
	call	__ZNKSt3__16locale9use_facetERNS0_2idE
Ltmp16:
## %bb.15:
	mov	rcx, qword ptr [rax]
Ltmp17:
	mov	esi, 10
	mov	rdi, rax
	call	qword ptr [rcx + 56]
	mov	r13d, eax
Ltmp18:
## %bb.16:
	lea	rdi, [rbp - 48]
	call	__ZNSt3__16localeD1Ev
	movsx	esi, r13b
	mov	rdi, rbx
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc
	mov	rdi, rbx
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv
	test	r14, r14
	je	LBB0_18
## %bb.17:
	mov	rdi, r14
	call	__ZdlPv
	mov	r12, qword ptr [r15 + 8]
LBB0_18:
	test	r12, r12
	je	LBB0_20
## %bb.19:
	mov	rdi, r12
	call	__ZdlPv
LBB0_20:
	mov	rdi, r15
	call	__ZdlPv
	xor	eax, eax
	add	rsp, 8
	pop	rbx
	pop	r12
	pop	r13
	pop	r14
	pop	r15
	pop	rbp
	ret
LBB0_25:
Ltmp19:
	jmp	LBB0_22
LBB0_24:
Ltmp14:
	jmp	LBB0_22
LBB0_23:
Ltmp9:
	jmp	LBB0_22
LBB0_21:
Ltmp4:
LBB0_22:
	mov	rbx, rax
	lea	rdi, [rbp - 48]
	call	__ZNSt3__16localeD1Ev
	mov	rdi, rbx
	call	__Unwind_Resume
	ud2
Lfunc_end0:
	.cfi_endproc
	.section	__TEXT,__gcc_except_tab
	.p2align	2
GCC_except_table0:
Lexception0:
	.byte	255                     ## @LPStart Encoding = omit
	.byte	155                     ## @TType Encoding = indirect pcrel sdata4
	.asciz	"\367\200"              ## @TType base offset
	.byte	3                       ## Call site Encoding = udata4
	.byte	117                     ## Call site table length
Lset0 = Lfunc_begin0-Lfunc_begin0       ## >> Call Site 1 <<
	.long	Lset0
Lset1 = Ltmp0-Lfunc_begin0              ##   Call between Lfunc_begin0 and Ltmp0
	.long	Lset1
	.long	0                       ##     has no landing pad
	.byte	0                       ##   On action: cleanup
Lset2 = Ltmp0-Lfunc_begin0              ## >> Call Site 2 <<
	.long	Lset2
Lset3 = Ltmp3-Ltmp0                     ##   Call between Ltmp0 and Ltmp3
	.long	Lset3
Lset4 = Ltmp4-Lfunc_begin0              ##     jumps to Ltmp4
	.long	Lset4
	.byte	0                       ##   On action: cleanup
Lset5 = Ltmp3-Lfunc_begin0              ## >> Call Site 3 <<
	.long	Lset5
Lset6 = Ltmp5-Ltmp3                     ##   Call between Ltmp3 and Ltmp5
	.long	Lset6
	.long	0                       ##     has no landing pad
	.byte	0                       ##   On action: cleanup
Lset7 = Ltmp5-Lfunc_begin0              ## >> Call Site 4 <<
	.long	Lset7
Lset8 = Ltmp8-Ltmp5                     ##   Call between Ltmp5 and Ltmp8
	.long	Lset8
Lset9 = Ltmp9-Lfunc_begin0              ##     jumps to Ltmp9
	.long	Lset9
	.byte	0                       ##   On action: cleanup
Lset10 = Ltmp8-Lfunc_begin0             ## >> Call Site 5 <<
	.long	Lset10
Lset11 = Ltmp10-Ltmp8                   ##   Call between Ltmp8 and Ltmp10
	.long	Lset11
	.long	0                       ##     has no landing pad
	.byte	0                       ##   On action: cleanup
Lset12 = Ltmp10-Lfunc_begin0            ## >> Call Site 6 <<
	.long	Lset12
Lset13 = Ltmp13-Ltmp10                  ##   Call between Ltmp10 and Ltmp13
	.long	Lset13
Lset14 = Ltmp14-Lfunc_begin0            ##     jumps to Ltmp14
	.long	Lset14
	.byte	0                       ##   On action: cleanup
Lset15 = Ltmp13-Lfunc_begin0            ## >> Call Site 7 <<
	.long	Lset15
Lset16 = Ltmp15-Ltmp13                  ##   Call between Ltmp13 and Ltmp15
	.long	Lset16
	.long	0                       ##     has no landing pad
	.byte	0                       ##   On action: cleanup
Lset17 = Ltmp15-Lfunc_begin0            ## >> Call Site 8 <<
	.long	Lset17
Lset18 = Ltmp18-Ltmp15                  ##   Call between Ltmp15 and Ltmp18
	.long	Lset18
Lset19 = Ltmp19-Lfunc_begin0            ##     jumps to Ltmp19
	.long	Lset19
	.byte	0                       ##   On action: cleanup
Lset20 = Ltmp18-Lfunc_begin0            ## >> Call Site 9 <<
	.long	Lset20
Lset21 = Lfunc_end0-Ltmp18              ##   Call between Ltmp18 and Lfunc_end0
	.long	Lset21
	.long	0                       ##     has no landing pad
	.byte	0                       ##   On action: cleanup
	.p2align	2
                                        ## -- End function

.subsections_via_symbols
