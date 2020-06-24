	.section	__TEXT,__text,regular,pure_instructions
	.macosx_version_min 10, 13
	.intel_syntax noprefix
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
	sub	rsp, 320
	mov	dword ptr [rbp - 116], 0
	mov	dword ptr [rbp - 120], edi
	mov	qword ptr [rbp - 128], rsi
	mov	rdi, qword ptr [rip + __ZNSt3__14coutE@GOTPCREL]
	lea	rsi, [rip + L_.str]
	call	__ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_PKc
	mov	qword ptr [rbp - 104], rax
	lea	rax, [rip + __ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_]
	mov	qword ptr [rbp - 112], rax
	mov	rdi, qword ptr [rbp - 104]
	mov	rax, qword ptr [rbp - 112]
	call	rax
	mov	ecx, 8
	mov	edi, ecx
	mov	qword ptr [rbp - 160], rax ## 8-byte Spill
	call	__Znwm
	mov	rsi, rax
	mov	rdi, rax
Ltmp0:
	mov	qword ptr [rbp - 168], rdi ## 8-byte Spill
	mov	rdi, rax
	mov	qword ptr [rbp - 176], rsi ## 8-byte Spill
	call	__ZN5StackIiEC1Ev
Ltmp1:
	jmp	LBB0_1
LBB0_1:
	mov	rax, qword ptr [rbp - 168] ## 8-byte Reload
	mov	qword ptr [rbp - 136], rax
	mov	rdi, qword ptr [rbp - 136]
	mov	esi, 1
	call	__ZN5StackIiE4pushEi
	mov	rdi, qword ptr [rbp - 136]
	mov	esi, 2
	mov	byte ptr [rbp - 177], al ## 1-byte Spill
	call	__ZN5StackIiE4pushEi
	mov	rdi, qword ptr [rbp - 136]
	mov	esi, 3
	mov	byte ptr [rbp - 178], al ## 1-byte Spill
	call	__ZN5StackIiE4pushEi
	mov	rdi, qword ptr [rbp - 136]
	mov	esi, 4
	mov	byte ptr [rbp - 179], al ## 1-byte Spill
	call	__ZN5StackIiE4pushEi
	mov	rdi, qword ptr [rbp - 136]
Ltmp3:
	mov	byte ptr [rbp - 180], al ## 1-byte Spill
	call	__ZN5StackIiE3popEv
Ltmp4:
	mov	dword ptr [rbp - 184], eax ## 4-byte Spill
	jmp	LBB0_2
LBB0_2:
Ltmp5:
	mov	rdi, qword ptr [rip + __ZNSt3__14coutE@GOTPCREL]
	mov	esi, dword ptr [rbp - 184] ## 4-byte Reload
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi
Ltmp6:
	mov	qword ptr [rbp - 192], rax ## 8-byte Spill
	jmp	LBB0_3
LBB0_3:
	mov	rax, qword ptr [rbp - 192] ## 8-byte Reload
	mov	qword ptr [rbp - 88], rax
	lea	rcx, [rip + __ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_]
	mov	qword ptr [rbp - 96], rcx
	mov	rdi, qword ptr [rbp - 88]
	mov	rcx, qword ptr [rbp - 96]
Ltmp7:
	call	rcx
Ltmp8:
	mov	qword ptr [rbp - 200], rax ## 8-byte Spill
	jmp	LBB0_4
LBB0_4:
	jmp	LBB0_5
LBB0_5:
	mov	rdi, qword ptr [rbp - 136]
Ltmp9:
	call	__ZN5StackIiE3popEv
Ltmp10:
	mov	dword ptr [rbp - 204], eax ## 4-byte Spill
	jmp	LBB0_6
LBB0_6:
Ltmp11:
	mov	rdi, qword ptr [rip + __ZNSt3__14coutE@GOTPCREL]
	mov	esi, dword ptr [rbp - 204] ## 4-byte Reload
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi
Ltmp12:
	mov	qword ptr [rbp - 216], rax ## 8-byte Spill
	jmp	LBB0_7
LBB0_7:
	mov	rax, qword ptr [rbp - 216] ## 8-byte Reload
	mov	qword ptr [rbp - 72], rax
	lea	rcx, [rip + __ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_]
	mov	qword ptr [rbp - 80], rcx
	mov	rdi, qword ptr [rbp - 72]
	mov	rcx, qword ptr [rbp - 80]
Ltmp13:
	call	rcx
Ltmp14:
	mov	qword ptr [rbp - 224], rax ## 8-byte Spill
	jmp	LBB0_8
LBB0_8:
	jmp	LBB0_9
LBB0_9:
	mov	rdi, qword ptr [rbp - 136]
Ltmp15:
	call	__ZN5StackIiE3popEv
Ltmp16:
	mov	dword ptr [rbp - 228], eax ## 4-byte Spill
	jmp	LBB0_10
LBB0_10:
Ltmp17:
	mov	rdi, qword ptr [rip + __ZNSt3__14coutE@GOTPCREL]
	mov	esi, dword ptr [rbp - 228] ## 4-byte Reload
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi
Ltmp18:
	mov	qword ptr [rbp - 240], rax ## 8-byte Spill
	jmp	LBB0_11
LBB0_11:
	mov	rax, qword ptr [rbp - 240] ## 8-byte Reload
	mov	qword ptr [rbp - 56], rax
	lea	rcx, [rip + __ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_]
	mov	qword ptr [rbp - 64], rcx
	mov	rdi, qword ptr [rbp - 56]
	mov	rcx, qword ptr [rbp - 64]
Ltmp19:
	call	rcx
Ltmp20:
	mov	qword ptr [rbp - 248], rax ## 8-byte Spill
	jmp	LBB0_12
LBB0_12:
	jmp	LBB0_13
LBB0_13:
	mov	rdi, qword ptr [rbp - 136]
Ltmp21:
	call	__ZN5StackIiE3popEv
Ltmp22:
	mov	dword ptr [rbp - 252], eax ## 4-byte Spill
	jmp	LBB0_14
LBB0_14:
Ltmp23:
	mov	rdi, qword ptr [rip + __ZNSt3__14coutE@GOTPCREL]
	mov	esi, dword ptr [rbp - 252] ## 4-byte Reload
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi
Ltmp24:
	mov	qword ptr [rbp - 264], rax ## 8-byte Spill
	jmp	LBB0_15
LBB0_15:
	mov	rax, qword ptr [rbp - 264] ## 8-byte Reload
	mov	qword ptr [rbp - 40], rax
	lea	rcx, [rip + __ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_]
	mov	qword ptr [rbp - 48], rcx
	mov	rdi, qword ptr [rbp - 40]
	mov	rcx, qword ptr [rbp - 48]
Ltmp25:
	call	rcx
Ltmp26:
	mov	qword ptr [rbp - 272], rax ## 8-byte Spill
	jmp	LBB0_16
LBB0_16:
	jmp	LBB0_17
LBB0_17:
	mov	rdi, qword ptr [rbp - 136]
Ltmp27:
	call	__ZN5StackIiE3popEv
Ltmp28:
	mov	dword ptr [rbp - 276], eax ## 4-byte Spill
	jmp	LBB0_18
LBB0_18:
Ltmp29:
	mov	rdi, qword ptr [rip + __ZNSt3__14coutE@GOTPCREL]
	mov	esi, dword ptr [rbp - 276] ## 4-byte Reload
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi
Ltmp30:
	mov	qword ptr [rbp - 288], rax ## 8-byte Spill
	jmp	LBB0_19
LBB0_19:
	mov	rax, qword ptr [rbp - 288] ## 8-byte Reload
	mov	qword ptr [rbp - 24], rax
	lea	rcx, [rip + __ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_]
	mov	qword ptr [rbp - 32], rcx
	mov	rdi, qword ptr [rbp - 24]
	mov	rcx, qword ptr [rbp - 32]
Ltmp31:
	call	rcx
Ltmp32:
	mov	qword ptr [rbp - 296], rax ## 8-byte Spill
	jmp	LBB0_20
LBB0_20:
	jmp	LBB0_21
LBB0_21:
	jmp	LBB0_29
LBB0_22:
Ltmp2:
	mov	ecx, edx
	mov	qword ptr [rbp - 144], rax
	mov	dword ptr [rbp - 148], ecx
	mov	rdi, qword ptr [rbp - 176] ## 8-byte Reload
	call	__ZdlPv
	jmp	LBB0_35
LBB0_23:
Ltmp33:
	mov	ecx, edx
	mov	qword ptr [rbp - 144], rax
	mov	dword ptr [rbp - 148], ecx
## %bb.24:
	mov	eax, dword ptr [rbp - 148]
	mov	ecx, 1
	cmp	eax, ecx
	jne	LBB0_35
## %bb.25:
	mov	rdi, qword ptr [rbp - 144]
	call	___cxa_begin_catch
	mov	ecx, dword ptr [rax]
	mov	dword ptr [rbp - 152], ecx
Ltmp34:
	mov	rdi, qword ptr [rip + __ZNSt3__14coutE@GOTPCREL]
	lea	rsi, [rip + L_.str.1]
	call	__ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_PKc
Ltmp35:
	mov	qword ptr [rbp - 304], rax ## 8-byte Spill
	jmp	LBB0_26
LBB0_26:
	mov	rax, qword ptr [rbp - 304] ## 8-byte Reload
	mov	qword ptr [rbp - 8], rax
	lea	rcx, [rip + __ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_]
	mov	qword ptr [rbp - 16], rcx
	mov	rdi, qword ptr [rbp - 8]
	mov	rcx, qword ptr [rbp - 16]
Ltmp36:
	call	rcx
Ltmp37:
	mov	qword ptr [rbp - 312], rax ## 8-byte Spill
	jmp	LBB0_27
LBB0_27:
	jmp	LBB0_28
LBB0_28:
	call	___cxa_end_catch
LBB0_29:
	mov	rax, qword ptr [rbp - 136]
	cmp	rax, 0
	mov	qword ptr [rbp - 320], rax ## 8-byte Spill
	je	LBB0_32
## %bb.30:
Ltmp39:
	mov	rdi, qword ptr [rbp - 320] ## 8-byte Reload
	call	__ZN5StackIiED1Ev
Ltmp40:
	jmp	LBB0_31
LBB0_31:
	mov	rax, qword ptr [rbp - 320] ## 8-byte Reload
	mov	rdi, rax
	call	__ZdlPv
LBB0_32:
	xor	eax, eax
	add	rsp, 320
	pop	rbp
	ret
LBB0_33:
Ltmp38:
	mov	ecx, edx
	mov	qword ptr [rbp - 144], rax
	mov	dword ptr [rbp - 148], ecx
	call	___cxa_end_catch
	jmp	LBB0_35
LBB0_34:
Ltmp41:
	mov	ecx, edx
	mov	qword ptr [rbp - 144], rax
	mov	dword ptr [rbp - 148], ecx
	mov	rax, qword ptr [rbp - 320] ## 8-byte Reload
	mov	rdi, rax
	call	__ZdlPv
LBB0_35:
	mov	rdi, qword ptr [rbp - 144]
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
	.byte	125                     ## @TType base offset
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
Lset8 = Ltmp32-Ltmp3                    ##   Call between Ltmp3 and Ltmp32
	.long	Lset8
Lset9 = Ltmp33-Lfunc_begin0             ##     jumps to Ltmp33
	.long	Lset9
	.byte	1                       ##   On action: 1
Lset10 = Ltmp32-Lfunc_begin0            ## >> Call Site 5 <<
	.long	Lset10
Lset11 = Ltmp34-Ltmp32                  ##   Call between Ltmp32 and Ltmp34
	.long	Lset11
	.long	0                       ##     has no landing pad
	.byte	0                       ##   On action: cleanup
Lset12 = Ltmp34-Lfunc_begin0            ## >> Call Site 6 <<
	.long	Lset12
Lset13 = Ltmp37-Ltmp34                  ##   Call between Ltmp34 and Ltmp37
	.long	Lset13
Lset14 = Ltmp38-Lfunc_begin0            ##     jumps to Ltmp38
	.long	Lset14
	.byte	0                       ##   On action: cleanup
Lset15 = Ltmp37-Lfunc_begin0            ## >> Call Site 7 <<
	.long	Lset15
Lset16 = Ltmp39-Ltmp37                  ##   Call between Ltmp37 and Ltmp39
	.long	Lset16
	.long	0                       ##     has no landing pad
	.byte	0                       ##   On action: cleanup
Lset17 = Ltmp39-Lfunc_begin0            ## >> Call Site 8 <<
	.long	Lset17
Lset18 = Ltmp40-Ltmp39                  ##   Call between Ltmp39 and Ltmp40
	.long	Lset18
Lset19 = Ltmp41-Lfunc_begin0            ##     jumps to Ltmp41
	.long	Lset19
	.byte	0                       ##   On action: cleanup
Lset20 = Ltmp40-Lfunc_begin0            ## >> Call Site 9 <<
	.long	Lset20
Lset21 = Lfunc_end0-Ltmp40              ##   Call between Ltmp40 and Lfunc_end0
	.long	Lset21
	.long	0                       ##     has no landing pad
	.byte	0                       ##   On action: cleanup
	.byte	1                       ## >> Action Record 1 <<
                                        ##   Catch TypeInfo 1
	.byte	0                       ##   No further actions
                                        ## >> Catch TypeInfos <<
	.long	__ZTIi@GOTPCREL+4       ## TypeInfo 1
	.p2align	2
                                        ## -- End function
	.section	__TEXT,__text,regular,pure_instructions
	.globl	__ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_PKc ## -- Begin function _ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_PKc
	.weak_definition	__ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_PKc
	.p2align	4, 0x90
__ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_PKc: ## @_ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_PKc
	.cfi_startproc
## %bb.0:
	push	rbp
	.cfi_def_cfa_offset 16
	.cfi_offset rbp, -16
	mov	rbp, rsp
	.cfi_def_cfa_register rbp
	sub	rsp, 32
	mov	qword ptr [rbp - 8], rdi
	mov	qword ptr [rbp - 16], rsi
	mov	rdi, qword ptr [rbp - 8]
	mov	rsi, qword ptr [rbp - 16]
	mov	rax, qword ptr [rbp - 16]
	mov	qword ptr [rbp - 24], rdi ## 8-byte Spill
	mov	rdi, rax
	mov	qword ptr [rbp - 32], rsi ## 8-byte Spill
	call	__ZNSt3__111char_traitsIcE6lengthEPKc
	mov	rdi, qword ptr [rbp - 24] ## 8-byte Reload
	mov	rsi, qword ptr [rbp - 32] ## 8-byte Reload
	mov	rdx, rax
	call	__ZNSt3__124__put_character_sequenceIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_PKS4_m
	add	rsp, 32
	pop	rbp
	ret
	.cfi_endproc
                                        ## -- End function
	.private_extern	__ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_ ## -- Begin function _ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_
	.globl	__ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_
	.weak_definition	__ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_
	.p2align	4, 0x90
__ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_: ## @_ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_
Lfunc_begin1:
	.cfi_startproc
	.cfi_personality 155, ___gxx_personality_v0
	.cfi_lsda 16, Lexception1
## %bb.0:
	push	rbp
	.cfi_def_cfa_offset 16
	.cfi_offset rbp, -16
	mov	rbp, rsp
	.cfi_def_cfa_register rbp
	sub	rsp, 144
	mov	qword ptr [rbp - 72], rdi
	mov	rdi, qword ptr [rbp - 72]
	mov	rax, qword ptr [rdi]
	mov	rax, qword ptr [rax - 24]
	mov	rcx, rdi
	add	rcx, rax
	mov	qword ptr [rbp - 32], rcx
	mov	byte ptr [rbp - 33], 10
	mov	rsi, qword ptr [rbp - 32]
	lea	rax, [rbp - 48]
	mov	qword ptr [rbp - 80], rdi ## 8-byte Spill
	mov	rdi, rax
	mov	qword ptr [rbp - 88], rax ## 8-byte Spill
	call	__ZNKSt3__18ios_base6getlocEv
	mov	rax, qword ptr [rbp - 88] ## 8-byte Reload
	mov	qword ptr [rbp - 24], rax
	mov	rdi, qword ptr [rbp - 24]
Ltmp42:
	mov	rsi, qword ptr [rip + __ZNSt3__15ctypeIcE2idE@GOTPCREL]
	call	__ZNKSt3__16locale9use_facetERNS0_2idE
Ltmp43:
	mov	qword ptr [rbp - 96], rax ## 8-byte Spill
	jmp	LBB2_1
LBB2_1:
	mov	al, byte ptr [rbp - 33]
	mov	rcx, qword ptr [rbp - 96] ## 8-byte Reload
	mov	qword ptr [rbp - 8], rcx
	mov	byte ptr [rbp - 9], al
	mov	rdx, qword ptr [rbp - 8]
	mov	rsi, qword ptr [rdx]
	mov	rsi, qword ptr [rsi + 56]
	movsx	edi, byte ptr [rbp - 9]
Ltmp44:
	mov	dword ptr [rbp - 100], edi ## 4-byte Spill
	mov	rdi, rdx
	mov	r8d, dword ptr [rbp - 100] ## 4-byte Reload
	mov	qword ptr [rbp - 112], rsi ## 8-byte Spill
	mov	esi, r8d
	mov	rdx, qword ptr [rbp - 112] ## 8-byte Reload
	call	rdx
Ltmp45:
	mov	byte ptr [rbp - 113], al ## 1-byte Spill
	jmp	LBB2_5
LBB2_2:
Ltmp46:
	mov	ecx, edx
	mov	qword ptr [rbp - 56], rax
	mov	dword ptr [rbp - 60], ecx
Ltmp47:
	lea	rdi, [rbp - 48]
	call	__ZNSt3__16localeD1Ev
Ltmp48:
	jmp	LBB2_3
LBB2_3:
	mov	rdi, qword ptr [rbp - 56]
	call	__Unwind_Resume
	ud2
LBB2_4:
Ltmp49:
	mov	rdi, rax
	mov	qword ptr [rbp - 128], rdx ## 8-byte Spill
	call	___clang_call_terminate
LBB2_5:
	lea	rdi, [rbp - 48]
	call	__ZNSt3__16localeD1Ev
	mov	rdi, qword ptr [rbp - 80] ## 8-byte Reload
	mov	al, byte ptr [rbp - 113] ## 1-byte Reload
	movsx	esi, al
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc
	mov	rdi, qword ptr [rbp - 72]
	mov	qword ptr [rbp - 136], rax ## 8-byte Spill
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv
	mov	rdi, qword ptr [rbp - 72]
	mov	qword ptr [rbp - 144], rax ## 8-byte Spill
	mov	rax, rdi
	add	rsp, 144
	pop	rbp
	ret
Lfunc_end1:
	.cfi_endproc
	.section	__TEXT,__gcc_except_tab
	.p2align	2
GCC_except_table2:
Lexception1:
	.byte	255                     ## @LPStart Encoding = omit
	.byte	155                     ## @TType Encoding = indirect pcrel sdata4
	.asciz	"\274"                  ## @TType base offset
	.byte	3                       ## Call site Encoding = udata4
	.byte	52                      ## Call site table length
Lset22 = Lfunc_begin1-Lfunc_begin1      ## >> Call Site 1 <<
	.long	Lset22
Lset23 = Ltmp42-Lfunc_begin1            ##   Call between Lfunc_begin1 and Ltmp42
	.long	Lset23
	.long	0                       ##     has no landing pad
	.byte	0                       ##   On action: cleanup
Lset24 = Ltmp42-Lfunc_begin1            ## >> Call Site 2 <<
	.long	Lset24
Lset25 = Ltmp45-Ltmp42                  ##   Call between Ltmp42 and Ltmp45
	.long	Lset25
Lset26 = Ltmp46-Lfunc_begin1            ##     jumps to Ltmp46
	.long	Lset26
	.byte	0                       ##   On action: cleanup
Lset27 = Ltmp47-Lfunc_begin1            ## >> Call Site 3 <<
	.long	Lset27
Lset28 = Ltmp48-Ltmp47                  ##   Call between Ltmp47 and Ltmp48
	.long	Lset28
Lset29 = Ltmp49-Lfunc_begin1            ##     jumps to Ltmp49
	.long	Lset29
	.byte	1                       ##   On action: 1
Lset30 = Ltmp48-Lfunc_begin1            ## >> Call Site 4 <<
	.long	Lset30
Lset31 = Lfunc_end1-Ltmp48              ##   Call between Ltmp48 and Lfunc_end1
	.long	Lset31
	.long	0                       ##     has no landing pad
	.byte	0                       ##   On action: cleanup
	.byte	1                       ## >> Action Record 1 <<
                                        ##   Catch TypeInfo 1
	.byte	0                       ##   No further actions
                                        ## >> Catch TypeInfos <<
	.long	0                       ## TypeInfo 1
	.p2align	2
                                        ## -- End function
	.section	__TEXT,__text,regular,pure_instructions
	.globl	__ZN5StackIiEC1Ev       ## -- Begin function _ZN5StackIiEC1Ev
	.weak_def_can_be_hidden	__ZN5StackIiEC1Ev
	.p2align	4, 0x90
__ZN5StackIiEC1Ev:                      ## @_ZN5StackIiEC1Ev
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
	call	__ZN5StackIiEC2Ev
	add	rsp, 16
	pop	rbp
	ret
	.cfi_endproc
                                        ## -- End function
	.globl	__ZN5StackIiE4pushEi    ## -- Begin function _ZN5StackIiE4pushEi
	.weak_definition	__ZN5StackIiE4pushEi
	.p2align	4, 0x90
__ZN5StackIiE4pushEi:                   ## @_ZN5StackIiE4pushEi
	.cfi_startproc
## %bb.0:
	push	rbp
	.cfi_def_cfa_offset 16
	.cfi_offset rbp, -16
	mov	rbp, rsp
	.cfi_def_cfa_register rbp
	sub	rsp, 48
	mov	eax, 16
	mov	ecx, eax
	mov	qword ptr [rbp - 8], rdi
	mov	dword ptr [rbp - 12], esi
	mov	rdi, qword ptr [rbp - 8]
	mov	qword ptr [rbp - 32], rdi ## 8-byte Spill
	mov	rdi, rcx
	call	__Znwm
	xor	esi, esi
	mov	edx, 16
                                        ## kill: def %rdx killed %edx
	mov	rcx, rax
	mov	rdi, rcx
	mov	qword ptr [rbp - 40], rax ## 8-byte Spill
	call	_memset
	mov	rax, qword ptr [rbp - 40] ## 8-byte Reload
	mov	qword ptr [rbp - 24], rax
	mov	rdi, qword ptr [rbp - 24]
	mov	esi, dword ptr [rbp - 12]
	call	__ZN5StackIiE7Element7setItemEi
	mov	rdi, qword ptr [rbp - 24]
	mov	rax, qword ptr [rbp - 32] ## 8-byte Reload
	mov	rsi, qword ptr [rax]
	call	__ZN5StackIiE7Element7setNextEPS1_
	mov	r8b, 1
	mov	rax, qword ptr [rbp - 24]
	mov	rcx, qword ptr [rbp - 32] ## 8-byte Reload
	mov	qword ptr [rcx], rax
	and	r8b, 1
	movzx	eax, r8b
	add	rsp, 48
	pop	rbp
	ret
	.cfi_endproc
                                        ## -- End function
	.globl	__ZN5StackIiE3popEv     ## -- Begin function _ZN5StackIiE3popEv
	.weak_definition	__ZN5StackIiE3popEv
	.p2align	4, 0x90
__ZN5StackIiE3popEv:                    ## @_ZN5StackIiE3popEv
	.cfi_startproc
## %bb.0:
	push	rbp
	.cfi_def_cfa_offset 16
	.cfi_offset rbp, -16
	mov	rbp, rsp
	.cfi_def_cfa_register rbp
	sub	rsp, 48
	mov	qword ptr [rbp - 8], rdi
	mov	rdi, qword ptr [rbp - 8]
	cmp	qword ptr [rdi], 0
	mov	qword ptr [rbp - 32], rdi ## 8-byte Spill
	jne	LBB5_2
## %bb.1:
	mov	eax, 8
	mov	edi, eax
	call	___cxa_allocate_exception
	mov	qword ptr [rax], 0
	mov	rsi, qword ptr [rip + __ZTIl@GOTPCREL]
	xor	ecx, ecx
	mov	edx, ecx
	mov	rdi, rax
	call	___cxa_throw
LBB5_2:
	mov	rax, qword ptr [rbp - 32] ## 8-byte Reload
	mov	rdi, qword ptr [rax]
	call	__ZN5StackIiE7Element7getItemEv
	mov	dword ptr [rbp - 12], eax
	mov	rdi, qword ptr [rbp - 32] ## 8-byte Reload
	mov	rcx, qword ptr [rdi]
	mov	qword ptr [rbp - 24], rcx
	mov	rdi, qword ptr [rdi]
	call	__ZN5StackIiE7Element7getNextEv
	mov	rcx, qword ptr [rbp - 32] ## 8-byte Reload
	mov	qword ptr [rcx], rax
	mov	rax, qword ptr [rbp - 24]
	cmp	rax, 0
	mov	qword ptr [rbp - 40], rax ## 8-byte Spill
	je	LBB5_4
## %bb.3:
	mov	rax, qword ptr [rbp - 40] ## 8-byte Reload
	mov	rdi, rax
	call	__ZdlPv
LBB5_4:
	mov	eax, dword ptr [rbp - 12]
	add	rsp, 48
	pop	rbp
	ret
	.cfi_endproc
                                        ## -- End function
	.globl	__ZN5StackIiED1Ev       ## -- Begin function _ZN5StackIiED1Ev
	.weak_def_can_be_hidden	__ZN5StackIiED1Ev
	.p2align	4, 0x90
__ZN5StackIiED1Ev:                      ## @_ZN5StackIiED1Ev
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
	call	__ZN5StackIiED2Ev
	add	rsp, 16
	pop	rbp
	ret
	.cfi_endproc
                                        ## -- End function
	.globl	__ZNSt3__124__put_character_sequenceIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_PKS4_m ## -- Begin function _ZNSt3__124__put_character_sequenceIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_PKS4_m
	.weak_definition	__ZNSt3__124__put_character_sequenceIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_PKS4_m
	.p2align	4, 0x90
__ZNSt3__124__put_character_sequenceIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_PKS4_m: ## @_ZNSt3__124__put_character_sequenceIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_PKS4_m
Lfunc_begin2:
	.cfi_startproc
	.cfi_personality 155, ___gxx_personality_v0
	.cfi_lsda 16, Lexception2
## %bb.0:
	push	rbp
	.cfi_def_cfa_offset 16
	.cfi_offset rbp, -16
	mov	rbp, rsp
	.cfi_def_cfa_register rbp
	sub	rsp, 416
	mov	qword ptr [rbp - 200], rdi
	mov	qword ptr [rbp - 208], rsi
	mov	qword ptr [rbp - 216], rdx
	mov	rsi, qword ptr [rbp - 200]
Ltmp50:
	lea	rdi, [rbp - 232]
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE6sentryC1ERS3_
Ltmp51:
	jmp	LBB7_1
LBB7_1:
	lea	rax, [rbp - 232]
	mov	qword ptr [rbp - 192], rax
	mov	rax, qword ptr [rbp - 192]
	mov	cl, byte ptr [rax]
	mov	byte ptr [rbp - 265], cl ## 1-byte Spill
## %bb.2:
	mov	al, byte ptr [rbp - 265] ## 1-byte Reload
	test	al, 1
	jne	LBB7_3
	jmp	LBB7_26
LBB7_3:
	lea	rax, [rbp - 256]
	mov	rcx, qword ptr [rbp - 200]
	mov	qword ptr [rbp - 176], rax
	mov	qword ptr [rbp - 184], rcx
	mov	rax, qword ptr [rbp - 176]
	mov	rcx, qword ptr [rbp - 184]
	mov	qword ptr [rbp - 144], rax
	mov	qword ptr [rbp - 152], rcx
	mov	rax, qword ptr [rbp - 144]
	mov	rcx, qword ptr [rbp - 152]
	mov	rdx, qword ptr [rcx]
	mov	rdx, qword ptr [rdx - 24]
	add	rcx, rdx
	mov	qword ptr [rbp - 136], rcx
	mov	rcx, qword ptr [rbp - 136]
	mov	qword ptr [rbp - 128], rcx
	mov	rcx, qword ptr [rbp - 128]
	mov	rcx, qword ptr [rcx + 40]
	mov	qword ptr [rax], rcx
	mov	rsi, qword ptr [rbp - 208]
	mov	rax, qword ptr [rbp - 200]
	mov	rcx, qword ptr [rax]
	mov	rcx, qword ptr [rcx - 24]
	add	rax, rcx
	mov	qword ptr [rbp - 88], rax
	mov	rax, qword ptr [rbp - 88]
	mov	edi, dword ptr [rax + 8]
	mov	qword ptr [rbp - 280], rsi ## 8-byte Spill
	mov	dword ptr [rbp - 284], edi ## 4-byte Spill
## %bb.4:
	mov	eax, dword ptr [rbp - 284] ## 4-byte Reload
	and	eax, 176
	cmp	eax, 32
	jne	LBB7_6
## %bb.5:
	mov	rax, qword ptr [rbp - 208]
	add	rax, qword ptr [rbp - 216]
	mov	qword ptr [rbp - 296], rax ## 8-byte Spill
	jmp	LBB7_7
LBB7_6:
	mov	rax, qword ptr [rbp - 208]
	mov	qword ptr [rbp - 296], rax ## 8-byte Spill
LBB7_7:
	mov	rax, qword ptr [rbp - 296] ## 8-byte Reload
	mov	rcx, qword ptr [rbp - 208]
	add	rcx, qword ptr [rbp - 216]
	mov	rdx, qword ptr [rbp - 200]
	mov	rsi, qword ptr [rdx]
	mov	rsi, qword ptr [rsi - 24]
	add	rdx, rsi
	mov	rsi, qword ptr [rbp - 200]
	mov	rdi, qword ptr [rsi]
	mov	rdi, qword ptr [rdi - 24]
	add	rsi, rdi
	mov	qword ptr [rbp - 72], rsi
	mov	rsi, qword ptr [rbp - 72]
	mov	qword ptr [rbp - 304], rax ## 8-byte Spill
	mov	qword ptr [rbp - 312], rcx ## 8-byte Spill
	mov	qword ptr [rbp - 320], rdx ## 8-byte Spill
	mov	qword ptr [rbp - 328], rsi ## 8-byte Spill
	call	__ZNSt3__111char_traitsIcE3eofEv
	mov	rcx, qword ptr [rbp - 328] ## 8-byte Reload
	mov	esi, dword ptr [rcx + 144]
	mov	edi, eax
	call	__ZNSt3__111char_traitsIcE11eq_int_typeEii
	test	al, 1
	jne	LBB7_8
	jmp	LBB7_16
LBB7_8:
	mov	rax, qword ptr [rbp - 328] ## 8-byte Reload
	mov	qword ptr [rbp - 32], rax
	mov	byte ptr [rbp - 33], 32
	mov	rsi, qword ptr [rbp - 32]
Ltmp52:
	lea	rdi, [rbp - 48]
	call	__ZNKSt3__18ios_base6getlocEv
Ltmp53:
	jmp	LBB7_9
LBB7_9:
	lea	rax, [rbp - 48]
	mov	qword ptr [rbp - 24], rax
	mov	rdi, qword ptr [rbp - 24]
Ltmp54:
	mov	rsi, qword ptr [rip + __ZNSt3__15ctypeIcE2idE@GOTPCREL]
	call	__ZNKSt3__16locale9use_facetERNS0_2idE
Ltmp55:
	mov	qword ptr [rbp - 336], rax ## 8-byte Spill
	jmp	LBB7_10
LBB7_10:
	mov	al, byte ptr [rbp - 33]
	mov	rcx, qword ptr [rbp - 336] ## 8-byte Reload
	mov	qword ptr [rbp - 8], rcx
	mov	byte ptr [rbp - 9], al
	mov	rdx, qword ptr [rbp - 8]
	mov	rsi, qword ptr [rdx]
	mov	rsi, qword ptr [rsi + 56]
	movsx	edi, byte ptr [rbp - 9]
Ltmp56:
	mov	dword ptr [rbp - 340], edi ## 4-byte Spill
	mov	rdi, rdx
	mov	r8d, dword ptr [rbp - 340] ## 4-byte Reload
	mov	qword ptr [rbp - 352], rsi ## 8-byte Spill
	mov	esi, r8d
	mov	rdx, qword ptr [rbp - 352] ## 8-byte Reload
	call	rdx
Ltmp57:
	mov	byte ptr [rbp - 353], al ## 1-byte Spill
	jmp	LBB7_14
LBB7_11:
Ltmp58:
	mov	ecx, edx
	mov	qword ptr [rbp - 56], rax
	mov	dword ptr [rbp - 60], ecx
Ltmp59:
	lea	rdi, [rbp - 48]
	call	__ZNSt3__16localeD1Ev
Ltmp60:
	jmp	LBB7_12
LBB7_12:
	mov	rax, qword ptr [rbp - 56]
	mov	ecx, dword ptr [rbp - 60]
	mov	qword ptr [rbp - 368], rax ## 8-byte Spill
	mov	dword ptr [rbp - 372], ecx ## 4-byte Spill
	jmp	LBB7_24
LBB7_13:
Ltmp61:
	mov	rdi, rax
	mov	qword ptr [rbp - 384], rdx ## 8-byte Spill
	call	___clang_call_terminate
LBB7_14:
Ltmp62:
	lea	rdi, [rbp - 48]
	call	__ZNSt3__16localeD1Ev
Ltmp63:
	jmp	LBB7_15
LBB7_15:
	mov	al, byte ptr [rbp - 353] ## 1-byte Reload
	movsx	ecx, al
	mov	rdx, qword ptr [rbp - 328] ## 8-byte Reload
	mov	dword ptr [rdx + 144], ecx
LBB7_16:
	mov	rax, qword ptr [rbp - 328] ## 8-byte Reload
	mov	ecx, dword ptr [rax + 144]
	mov	dl, cl
	mov	byte ptr [rbp - 385], dl ## 1-byte Spill
## %bb.17:
	mov	rdi, qword ptr [rbp - 256]
Ltmp64:
	mov	al, byte ptr [rbp - 385] ## 1-byte Reload
	movsx	r9d, al
	mov	rsi, qword ptr [rbp - 280] ## 8-byte Reload
	mov	rdx, qword ptr [rbp - 304] ## 8-byte Reload
	mov	rcx, qword ptr [rbp - 312] ## 8-byte Reload
	mov	r8, qword ptr [rbp - 320] ## 8-byte Reload
	call	__ZNSt3__116__pad_and_outputIcNS_11char_traitsIcEEEENS_19ostreambuf_iteratorIT_T0_EES6_PKS4_S8_S8_RNS_8ios_baseES4_
Ltmp65:
	mov	qword ptr [rbp - 400], rax ## 8-byte Spill
	jmp	LBB7_18
LBB7_18:
	lea	rax, [rbp - 264]
	mov	rcx, qword ptr [rbp - 400] ## 8-byte Reload
	mov	qword ptr [rbp - 264], rcx
	mov	qword ptr [rbp - 80], rax
	mov	rax, qword ptr [rbp - 80]
	cmp	qword ptr [rax], 0
	jne	LBB7_25
## %bb.19:
	mov	rax, qword ptr [rbp - 200]
	mov	rcx, qword ptr [rax]
	mov	rcx, qword ptr [rcx - 24]
	add	rax, rcx
	mov	qword ptr [rbp - 112], rax
	mov	dword ptr [rbp - 116], 5
	mov	rax, qword ptr [rbp - 112]
	mov	edx, dword ptr [rbp - 116]
	mov	qword ptr [rbp - 96], rax
	mov	dword ptr [rbp - 100], edx
	mov	rax, qword ptr [rbp - 96]
	mov	edx, dword ptr [rax + 32]
	mov	esi, dword ptr [rbp - 100]
	or	edx, esi
Ltmp66:
	mov	rdi, rax
	mov	esi, edx
	call	__ZNSt3__18ios_base5clearEj
Ltmp67:
	jmp	LBB7_20
LBB7_20:
	jmp	LBB7_21
LBB7_21:
	jmp	LBB7_25
LBB7_22:
Ltmp73:
	mov	ecx, edx
	mov	qword ptr [rbp - 240], rax
	mov	dword ptr [rbp - 244], ecx
	jmp	LBB7_29
LBB7_23:
Ltmp68:
	mov	ecx, edx
	mov	qword ptr [rbp - 368], rax ## 8-byte Spill
	mov	dword ptr [rbp - 372], ecx ## 4-byte Spill
	jmp	LBB7_24
LBB7_24:
	mov	eax, dword ptr [rbp - 372] ## 4-byte Reload
	mov	rcx, qword ptr [rbp - 368] ## 8-byte Reload
	mov	qword ptr [rbp - 240], rcx
	mov	dword ptr [rbp - 244], eax
Ltmp69:
	lea	rdi, [rbp - 232]
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE6sentryD1Ev
Ltmp70:
	jmp	LBB7_28
LBB7_25:
	jmp	LBB7_26
LBB7_26:
Ltmp71:
	lea	rdi, [rbp - 232]
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE6sentryD1Ev
Ltmp72:
	jmp	LBB7_27
LBB7_27:
	jmp	LBB7_31
LBB7_28:
	jmp	LBB7_29
LBB7_29:
	mov	rdi, qword ptr [rbp - 240]
	call	___cxa_begin_catch
	mov	rdi, qword ptr [rbp - 200]
	mov	rcx, qword ptr [rdi]
	mov	rcx, qword ptr [rcx - 24]
	add	rdi, rcx
Ltmp74:
	mov	qword ptr [rbp - 408], rax ## 8-byte Spill
	call	__ZNSt3__18ios_base33__set_badbit_and_consider_rethrowEv
Ltmp75:
	jmp	LBB7_30
LBB7_30:
	call	___cxa_end_catch
LBB7_31:
	mov	rax, qword ptr [rbp - 200]
	add	rsp, 416
	pop	rbp
	ret
LBB7_32:
Ltmp76:
	mov	ecx, edx
	mov	qword ptr [rbp - 240], rax
	mov	dword ptr [rbp - 244], ecx
Ltmp77:
	call	___cxa_end_catch
Ltmp78:
	jmp	LBB7_33
LBB7_33:
	jmp	LBB7_34
LBB7_34:
	mov	rdi, qword ptr [rbp - 240]
	call	__Unwind_Resume
	ud2
LBB7_35:
Ltmp79:
	mov	rdi, rax
	mov	qword ptr [rbp - 416], rdx ## 8-byte Spill
	call	___clang_call_terminate
Lfunc_end2:
	.cfi_endproc
	.section	__TEXT,__gcc_except_tab
	.p2align	2
GCC_except_table7:
Lexception2:
	.byte	255                     ## @LPStart Encoding = omit
	.byte	155                     ## @TType Encoding = indirect pcrel sdata4
	.asciz	"\253\201"              ## @TType base offset
	.byte	3                       ## Call site Encoding = udata4
	.ascii	"\234\001"              ## Call site table length
Lset32 = Ltmp50-Lfunc_begin2            ## >> Call Site 1 <<
	.long	Lset32
Lset33 = Ltmp51-Ltmp50                  ##   Call between Ltmp50 and Ltmp51
	.long	Lset33
Lset34 = Ltmp73-Lfunc_begin2            ##     jumps to Ltmp73
	.long	Lset34
	.byte	5                       ##   On action: 3
Lset35 = Ltmp52-Lfunc_begin2            ## >> Call Site 2 <<
	.long	Lset35
Lset36 = Ltmp53-Ltmp52                  ##   Call between Ltmp52 and Ltmp53
	.long	Lset36
Lset37 = Ltmp68-Lfunc_begin2            ##     jumps to Ltmp68
	.long	Lset37
	.byte	5                       ##   On action: 3
Lset38 = Ltmp54-Lfunc_begin2            ## >> Call Site 3 <<
	.long	Lset38
Lset39 = Ltmp57-Ltmp54                  ##   Call between Ltmp54 and Ltmp57
	.long	Lset39
Lset40 = Ltmp58-Lfunc_begin2            ##     jumps to Ltmp58
	.long	Lset40
	.byte	3                       ##   On action: 2
Lset41 = Ltmp59-Lfunc_begin2            ## >> Call Site 4 <<
	.long	Lset41
Lset42 = Ltmp60-Ltmp59                  ##   Call between Ltmp59 and Ltmp60
	.long	Lset42
Lset43 = Ltmp61-Lfunc_begin2            ##     jumps to Ltmp61
	.long	Lset43
	.byte	7                       ##   On action: 4
Lset44 = Ltmp62-Lfunc_begin2            ## >> Call Site 5 <<
	.long	Lset44
Lset45 = Ltmp67-Ltmp62                  ##   Call between Ltmp62 and Ltmp67
	.long	Lset45
Lset46 = Ltmp68-Lfunc_begin2            ##     jumps to Ltmp68
	.long	Lset46
	.byte	5                       ##   On action: 3
Lset47 = Ltmp69-Lfunc_begin2            ## >> Call Site 6 <<
	.long	Lset47
Lset48 = Ltmp70-Ltmp69                  ##   Call between Ltmp69 and Ltmp70
	.long	Lset48
Lset49 = Ltmp79-Lfunc_begin2            ##     jumps to Ltmp79
	.long	Lset49
	.byte	5                       ##   On action: 3
Lset50 = Ltmp71-Lfunc_begin2            ## >> Call Site 7 <<
	.long	Lset50
Lset51 = Ltmp72-Ltmp71                  ##   Call between Ltmp71 and Ltmp72
	.long	Lset51
Lset52 = Ltmp73-Lfunc_begin2            ##     jumps to Ltmp73
	.long	Lset52
	.byte	5                       ##   On action: 3
Lset53 = Ltmp72-Lfunc_begin2            ## >> Call Site 8 <<
	.long	Lset53
Lset54 = Ltmp74-Ltmp72                  ##   Call between Ltmp72 and Ltmp74
	.long	Lset54
	.long	0                       ##     has no landing pad
	.byte	0                       ##   On action: cleanup
Lset55 = Ltmp74-Lfunc_begin2            ## >> Call Site 9 <<
	.long	Lset55
Lset56 = Ltmp75-Ltmp74                  ##   Call between Ltmp74 and Ltmp75
	.long	Lset56
Lset57 = Ltmp76-Lfunc_begin2            ##     jumps to Ltmp76
	.long	Lset57
	.byte	0                       ##   On action: cleanup
Lset58 = Ltmp75-Lfunc_begin2            ## >> Call Site 10 <<
	.long	Lset58
Lset59 = Ltmp77-Ltmp75                  ##   Call between Ltmp75 and Ltmp77
	.long	Lset59
	.long	0                       ##     has no landing pad
	.byte	0                       ##   On action: cleanup
Lset60 = Ltmp77-Lfunc_begin2            ## >> Call Site 11 <<
	.long	Lset60
Lset61 = Ltmp78-Ltmp77                  ##   Call between Ltmp77 and Ltmp78
	.long	Lset61
Lset62 = Ltmp79-Lfunc_begin2            ##     jumps to Ltmp79
	.long	Lset62
	.byte	5                       ##   On action: 3
Lset63 = Ltmp78-Lfunc_begin2            ## >> Call Site 12 <<
	.long	Lset63
Lset64 = Lfunc_end2-Ltmp78              ##   Call between Ltmp78 and Lfunc_end2
	.long	Lset64
	.long	0                       ##     has no landing pad
	.byte	0                       ##   On action: cleanup
	.byte	0                       ## >> Action Record 1 <<
                                        ##   Cleanup
	.byte	0                       ##   No further actions
	.byte	1                       ## >> Action Record 2 <<
                                        ##   Catch TypeInfo 1
	.byte	125                     ##   Continue to action 1
	.byte	1                       ## >> Action Record 3 <<
                                        ##   Catch TypeInfo 1
	.byte	0                       ##   No further actions
	.byte	1                       ## >> Action Record 4 <<
                                        ##   Catch TypeInfo 1
	.byte	125                     ##   Continue to action 3
                                        ## >> Catch TypeInfos <<
	.long	0                       ## TypeInfo 1
	.p2align	2
                                        ## -- End function
	.section	__TEXT,__text,regular,pure_instructions
	.globl	__ZNSt3__111char_traitsIcE6lengthEPKc ## -- Begin function _ZNSt3__111char_traitsIcE6lengthEPKc
	.weak_definition	__ZNSt3__111char_traitsIcE6lengthEPKc
	.p2align	4, 0x90
__ZNSt3__111char_traitsIcE6lengthEPKc:  ## @_ZNSt3__111char_traitsIcE6lengthEPKc
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
	call	_strlen
	add	rsp, 16
	pop	rbp
	ret
	.cfi_endproc
                                        ## -- End function
	.private_extern	__ZNSt3__116__pad_and_outputIcNS_11char_traitsIcEEEENS_19ostreambuf_iteratorIT_T0_EES6_PKS4_S8_S8_RNS_8ios_baseES4_ ## -- Begin function _ZNSt3__116__pad_and_outputIcNS_11char_traitsIcEEEENS_19ostreambuf_iteratorIT_T0_EES6_PKS4_S8_S8_RNS_8ios_baseES4_
	.globl	__ZNSt3__116__pad_and_outputIcNS_11char_traitsIcEEEENS_19ostreambuf_iteratorIT_T0_EES6_PKS4_S8_S8_RNS_8ios_baseES4_
	.weak_definition	__ZNSt3__116__pad_and_outputIcNS_11char_traitsIcEEEENS_19ostreambuf_iteratorIT_T0_EES6_PKS4_S8_S8_RNS_8ios_baseES4_
	.p2align	4, 0x90
__ZNSt3__116__pad_and_outputIcNS_11char_traitsIcEEEENS_19ostreambuf_iteratorIT_T0_EES6_PKS4_S8_S8_RNS_8ios_baseES4_: ## @_ZNSt3__116__pad_and_outputIcNS_11char_traitsIcEEEENS_19ostreambuf_iteratorIT_T0_EES6_PKS4_S8_S8_RNS_8ios_baseES4_
Lfunc_begin3:
	.cfi_startproc
	.cfi_personality 155, ___gxx_personality_v0
	.cfi_lsda 16, Lexception3
## %bb.0:
	push	rbp
	.cfi_def_cfa_offset 16
	.cfi_offset rbp, -16
	mov	rbp, rsp
	.cfi_def_cfa_register rbp
	sub	rsp, 736
	mov	al, r9b
	lea	r10, [rbp - 560]
	lea	r11, [rbp - 496]
	mov	qword ptr [rbp - 512], rdi
	mov	qword ptr [rbp - 520], rsi
	mov	qword ptr [rbp - 528], rdx
	mov	qword ptr [rbp - 536], rcx
	mov	qword ptr [rbp - 544], r8
	mov	byte ptr [rbp - 545], al
	mov	rcx, qword ptr [rbp - 512]
	mov	qword ptr [rbp - 480], r11
	mov	qword ptr [rbp - 488], -1
	mov	rdx, qword ptr [rbp - 480]
	mov	rsi, qword ptr [rbp - 488]
	mov	qword ptr [rbp - 464], rdx
	mov	qword ptr [rbp - 472], rsi
	mov	rdx, qword ptr [rbp - 464]
	mov	qword ptr [rdx], 0
	mov	rdx, qword ptr [rbp - 496]
	mov	qword ptr [rbp - 560], rdx
	mov	qword ptr [rbp - 456], r10
	cmp	rcx, 0
	jne	LBB9_2
## %bb.1:
	mov	rax, qword ptr [rbp - 512]
	mov	qword ptr [rbp - 504], rax
	jmp	LBB9_29
LBB9_2:
	mov	rax, qword ptr [rbp - 536]
	mov	rcx, qword ptr [rbp - 520]
	sub	rax, rcx
	mov	qword ptr [rbp - 568], rax
	mov	rax, qword ptr [rbp - 544]
	mov	qword ptr [rbp - 352], rax
	mov	rax, qword ptr [rbp - 352]
	mov	rax, qword ptr [rax + 24]
	mov	qword ptr [rbp - 576], rax
	mov	rax, qword ptr [rbp - 576]
	cmp	rax, qword ptr [rbp - 568]
	jle	LBB9_4
## %bb.3:
	mov	rax, qword ptr [rbp - 568]
	mov	rcx, qword ptr [rbp - 576]
	sub	rcx, rax
	mov	qword ptr [rbp - 576], rcx
	jmp	LBB9_5
LBB9_4:
	mov	qword ptr [rbp - 576], 0
LBB9_5:
	mov	rax, qword ptr [rbp - 528]
	mov	rcx, qword ptr [rbp - 520]
	sub	rax, rcx
	mov	qword ptr [rbp - 584], rax
	cmp	qword ptr [rbp - 584], 0
	jle	LBB9_9
## %bb.6:
	mov	rax, qword ptr [rbp - 512]
	mov	rcx, qword ptr [rbp - 520]
	mov	rdx, qword ptr [rbp - 584]
	mov	qword ptr [rbp - 256], rax
	mov	qword ptr [rbp - 264], rcx
	mov	qword ptr [rbp - 272], rdx
	mov	rax, qword ptr [rbp - 256]
	mov	rcx, qword ptr [rax]
	mov	rcx, qword ptr [rcx + 96]
	mov	rsi, qword ptr [rbp - 264]
	mov	rdx, qword ptr [rbp - 272]
	mov	rdi, rax
	call	rcx
	cmp	rax, qword ptr [rbp - 584]
	je	LBB9_8
## %bb.7:
	lea	rax, [rbp - 592]
	lea	rcx, [rbp - 248]
	mov	qword ptr [rbp - 232], rcx
	mov	qword ptr [rbp - 240], -1
	mov	rcx, qword ptr [rbp - 232]
	mov	rdx, qword ptr [rbp - 240]
	mov	qword ptr [rbp - 216], rcx
	mov	qword ptr [rbp - 224], rdx
	mov	rcx, qword ptr [rbp - 216]
	mov	qword ptr [rcx], 0
	mov	rcx, qword ptr [rbp - 248]
	mov	qword ptr [rbp - 592], rcx
	mov	qword ptr [rbp - 8], rax
	mov	qword ptr [rbp - 512], 0
	mov	rax, qword ptr [rbp - 512]
	mov	qword ptr [rbp - 504], rax
	jmp	LBB9_29
LBB9_8:
	jmp	LBB9_9
LBB9_9:
	cmp	qword ptr [rbp - 576], 0
	jle	LBB9_24
## %bb.10:
	xor	esi, esi
	mov	eax, 24
	mov	edx, eax
	lea	rcx, [rbp - 616]
	mov	rdi, qword ptr [rbp - 576]
	mov	r8b, byte ptr [rbp - 545]
	mov	qword ptr [rbp - 80], rcx
	mov	qword ptr [rbp - 88], rdi
	mov	byte ptr [rbp - 89], r8b
	mov	rcx, qword ptr [rbp - 80]
	mov	rdi, qword ptr [rbp - 88]
	mov	r8b, byte ptr [rbp - 89]
	mov	qword ptr [rbp - 56], rcx
	mov	qword ptr [rbp - 64], rdi
	mov	byte ptr [rbp - 65], r8b
	mov	rcx, qword ptr [rbp - 56]
	mov	qword ptr [rbp - 48], rcx
	mov	rdi, qword ptr [rbp - 48]
	mov	qword ptr [rbp - 40], rdi
	mov	rdi, qword ptr [rbp - 40]
	mov	r9, rdi
	mov	qword ptr [rbp - 32], r9
	mov	r9, qword ptr [rbp - 32]
	mov	qword ptr [rbp - 664], rdi ## 8-byte Spill
	mov	rdi, r9
	mov	qword ptr [rbp - 672], rcx ## 8-byte Spill
	call	_memset
	mov	rcx, qword ptr [rbp - 664] ## 8-byte Reload
	mov	qword ptr [rbp - 24], rcx
	mov	rcx, qword ptr [rbp - 24]
	mov	qword ptr [rbp - 16], rcx
	mov	rsi, qword ptr [rbp - 64]
	mov	rdi, qword ptr [rbp - 672] ## 8-byte Reload
	movsx	edx, byte ptr [rbp - 65]
	call	__ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEmc
	lea	rcx, [rbp - 616]
	mov	rsi, qword ptr [rbp - 512]
	mov	qword ptr [rbp - 208], rcx
	mov	rcx, qword ptr [rbp - 208]
	mov	qword ptr [rbp - 200], rcx
	mov	rcx, qword ptr [rbp - 200]
	mov	qword ptr [rbp - 192], rcx
	mov	rdi, qword ptr [rbp - 192]
	mov	qword ptr [rbp - 184], rdi
	mov	rdi, qword ptr [rbp - 184]
	mov	qword ptr [rbp - 176], rdi
	mov	rdi, qword ptr [rbp - 176]
	movzx	eax, byte ptr [rdi]
	mov	edi, eax
	and	rdi, 1
	cmp	rdi, 0
	mov	qword ptr [rbp - 680], rsi ## 8-byte Spill
	mov	qword ptr [rbp - 688], rcx ## 8-byte Spill
	je	LBB9_12
## %bb.11:
	mov	rax, qword ptr [rbp - 688] ## 8-byte Reload
	mov	qword ptr [rbp - 128], rax
	mov	rcx, qword ptr [rbp - 128]
	mov	qword ptr [rbp - 120], rcx
	mov	rcx, qword ptr [rbp - 120]
	mov	qword ptr [rbp - 112], rcx
	mov	rcx, qword ptr [rbp - 112]
	mov	rcx, qword ptr [rcx + 16]
	mov	qword ptr [rbp - 696], rcx ## 8-byte Spill
	jmp	LBB9_13
LBB9_12:
	mov	rax, qword ptr [rbp - 688] ## 8-byte Reload
	mov	qword ptr [rbp - 168], rax
	mov	rcx, qword ptr [rbp - 168]
	mov	qword ptr [rbp - 160], rcx
	mov	rcx, qword ptr [rbp - 160]
	mov	qword ptr [rbp - 152], rcx
	mov	rcx, qword ptr [rbp - 152]
	add	rcx, 1
	mov	qword ptr [rbp - 144], rcx
	mov	rcx, qword ptr [rbp - 144]
	mov	qword ptr [rbp - 136], rcx
	mov	rcx, qword ptr [rbp - 136]
	mov	qword ptr [rbp - 696], rcx ## 8-byte Spill
LBB9_13:
	mov	rax, qword ptr [rbp - 696] ## 8-byte Reload
	mov	qword ptr [rbp - 104], rax
	mov	rax, qword ptr [rbp - 104]
	mov	rcx, qword ptr [rbp - 576]
	mov	rdx, qword ptr [rbp - 680] ## 8-byte Reload
	mov	qword ptr [rbp - 280], rdx
	mov	qword ptr [rbp - 288], rax
	mov	qword ptr [rbp - 296], rcx
	mov	rax, qword ptr [rbp - 280]
	mov	rcx, qword ptr [rax]
	mov	rcx, qword ptr [rcx + 96]
	mov	rsi, qword ptr [rbp - 288]
	mov	rdx, qword ptr [rbp - 296]
Ltmp80:
	mov	rdi, rax
	call	rcx
Ltmp81:
	mov	qword ptr [rbp - 704], rax ## 8-byte Spill
	jmp	LBB9_14
LBB9_14:
	jmp	LBB9_15
LBB9_15:
	mov	rax, qword ptr [rbp - 704] ## 8-byte Reload
	cmp	rax, qword ptr [rbp - 576]
	je	LBB9_20
## %bb.16:
	lea	rax, [rbp - 336]
	mov	qword ptr [rbp - 320], rax
	mov	qword ptr [rbp - 328], -1
	mov	rax, qword ptr [rbp - 320]
	mov	rcx, qword ptr [rbp - 328]
	mov	qword ptr [rbp - 304], rax
	mov	qword ptr [rbp - 312], rcx
	mov	rax, qword ptr [rbp - 304]
	mov	qword ptr [rax], 0
	mov	rax, qword ptr [rbp - 336]
	mov	qword ptr [rbp - 712], rax ## 8-byte Spill
## %bb.17:
	lea	rax, [rbp - 640]
	mov	rcx, qword ptr [rbp - 712] ## 8-byte Reload
	mov	qword ptr [rbp - 640], rcx
	mov	qword ptr [rbp - 344], rax
## %bb.18:
	mov	qword ptr [rbp - 512], 0
	mov	rax, qword ptr [rbp - 512]
	mov	qword ptr [rbp - 504], rax
	mov	dword ptr [rbp - 644], 1
	jmp	LBB9_21
LBB9_19:
Ltmp82:
	mov	ecx, edx
	mov	qword ptr [rbp - 624], rax
	mov	dword ptr [rbp - 628], ecx
Ltmp83:
	lea	rdi, [rbp - 616]
	call	__ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED1Ev
Ltmp84:
	jmp	LBB9_23
LBB9_20:
	mov	dword ptr [rbp - 644], 0
LBB9_21:
	lea	rdi, [rbp - 616]
	call	__ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED1Ev
	mov	eax, dword ptr [rbp - 644]
	test	eax, eax
	mov	dword ptr [rbp - 716], eax ## 4-byte Spill
	je	LBB9_22
	jmp	LBB9_33
LBB9_33:
	mov	eax, dword ptr [rbp - 716] ## 4-byte Reload
	sub	eax, 1
	mov	dword ptr [rbp - 720], eax ## 4-byte Spill
	je	LBB9_29
	jmp	LBB9_32
LBB9_22:
	jmp	LBB9_24
LBB9_23:
	jmp	LBB9_30
LBB9_24:
	mov	rax, qword ptr [rbp - 536]
	mov	rcx, qword ptr [rbp - 528]
	sub	rax, rcx
	mov	qword ptr [rbp - 584], rax
	cmp	qword ptr [rbp - 584], 0
	jle	LBB9_28
## %bb.25:
	mov	rax, qword ptr [rbp - 512]
	mov	rcx, qword ptr [rbp - 528]
	mov	rdx, qword ptr [rbp - 584]
	mov	qword ptr [rbp - 360], rax
	mov	qword ptr [rbp - 368], rcx
	mov	qword ptr [rbp - 376], rdx
	mov	rax, qword ptr [rbp - 360]
	mov	rcx, qword ptr [rax]
	mov	rcx, qword ptr [rcx + 96]
	mov	rsi, qword ptr [rbp - 368]
	mov	rdx, qword ptr [rbp - 376]
	mov	rdi, rax
	call	rcx
	cmp	rax, qword ptr [rbp - 584]
	je	LBB9_27
## %bb.26:
	lea	rax, [rbp - 656]
	lea	rcx, [rbp - 416]
	mov	qword ptr [rbp - 400], rcx
	mov	qword ptr [rbp - 408], -1
	mov	rcx, qword ptr [rbp - 400]
	mov	rdx, qword ptr [rbp - 408]
	mov	qword ptr [rbp - 384], rcx
	mov	qword ptr [rbp - 392], rdx
	mov	rcx, qword ptr [rbp - 384]
	mov	qword ptr [rcx], 0
	mov	rcx, qword ptr [rbp - 416]
	mov	qword ptr [rbp - 656], rcx
	mov	qword ptr [rbp - 424], rax
	mov	qword ptr [rbp - 512], 0
	mov	rax, qword ptr [rbp - 512]
	mov	qword ptr [rbp - 504], rax
	jmp	LBB9_29
LBB9_27:
	jmp	LBB9_28
LBB9_28:
	mov	rax, qword ptr [rbp - 544]
	mov	qword ptr [rbp - 432], rax
	mov	qword ptr [rbp - 440], 0
	mov	rax, qword ptr [rbp - 432]
	mov	rcx, qword ptr [rax + 24]
	mov	qword ptr [rbp - 448], rcx
	mov	rcx, qword ptr [rbp - 440]
	mov	qword ptr [rax + 24], rcx
	mov	rax, qword ptr [rbp - 512]
	mov	qword ptr [rbp - 504], rax
LBB9_29:
	mov	rax, qword ptr [rbp - 504]
	add	rsp, 736
	pop	rbp
	ret
LBB9_30:
	mov	rdi, qword ptr [rbp - 624]
	call	__Unwind_Resume
	ud2
LBB9_31:
Ltmp85:
	mov	rdi, rax
	mov	qword ptr [rbp - 728], rdx ## 8-byte Spill
	call	___clang_call_terminate
LBB9_32:
	ud2
Lfunc_end3:
	.cfi_endproc
	.section	__TEXT,__gcc_except_tab
	.p2align	2
GCC_except_table9:
Lexception3:
	.byte	255                     ## @LPStart Encoding = omit
	.byte	155                     ## @TType Encoding = indirect pcrel sdata4
	.asciz	"\274"                  ## @TType base offset
	.byte	3                       ## Call site Encoding = udata4
	.byte	52                      ## Call site table length
Lset65 = Lfunc_begin3-Lfunc_begin3      ## >> Call Site 1 <<
	.long	Lset65
Lset66 = Ltmp80-Lfunc_begin3            ##   Call between Lfunc_begin3 and Ltmp80
	.long	Lset66
	.long	0                       ##     has no landing pad
	.byte	0                       ##   On action: cleanup
Lset67 = Ltmp80-Lfunc_begin3            ## >> Call Site 2 <<
	.long	Lset67
Lset68 = Ltmp81-Ltmp80                  ##   Call between Ltmp80 and Ltmp81
	.long	Lset68
Lset69 = Ltmp82-Lfunc_begin3            ##     jumps to Ltmp82
	.long	Lset69
	.byte	0                       ##   On action: cleanup
Lset70 = Ltmp83-Lfunc_begin3            ## >> Call Site 3 <<
	.long	Lset70
Lset71 = Ltmp84-Ltmp83                  ##   Call between Ltmp83 and Ltmp84
	.long	Lset71
Lset72 = Ltmp85-Lfunc_begin3            ##     jumps to Ltmp85
	.long	Lset72
	.byte	1                       ##   On action: 1
Lset73 = Ltmp84-Lfunc_begin3            ## >> Call Site 4 <<
	.long	Lset73
Lset74 = Lfunc_end3-Ltmp84              ##   Call between Ltmp84 and Lfunc_end3
	.long	Lset74
	.long	0                       ##     has no landing pad
	.byte	0                       ##   On action: cleanup
	.byte	1                       ## >> Action Record 1 <<
                                        ##   Catch TypeInfo 1
	.byte	0                       ##   No further actions
                                        ## >> Catch TypeInfos <<
	.long	0                       ## TypeInfo 1
	.p2align	2
                                        ## -- End function
	.section	__TEXT,__text,regular,pure_instructions
	.private_extern	___clang_call_terminate ## -- Begin function __clang_call_terminate
	.globl	___clang_call_terminate
	.weak_definition	___clang_call_terminate
	.p2align	4, 0x90
___clang_call_terminate:                ## @__clang_call_terminate
## %bb.0:
	push	rax
	call	___cxa_begin_catch
	mov	qword ptr [rsp], rax    ## 8-byte Spill
	call	__ZSt9terminatev
                                        ## -- End function
	.globl	__ZNSt3__111char_traitsIcE11eq_int_typeEii ## -- Begin function _ZNSt3__111char_traitsIcE11eq_int_typeEii
	.weak_definition	__ZNSt3__111char_traitsIcE11eq_int_typeEii
	.p2align	4, 0x90
__ZNSt3__111char_traitsIcE11eq_int_typeEii: ## @_ZNSt3__111char_traitsIcE11eq_int_typeEii
	.cfi_startproc
## %bb.0:
	push	rbp
	.cfi_def_cfa_offset 16
	.cfi_offset rbp, -16
	mov	rbp, rsp
	.cfi_def_cfa_register rbp
	mov	dword ptr [rbp - 4], edi
	mov	dword ptr [rbp - 8], esi
	mov	esi, dword ptr [rbp - 4]
	cmp	esi, dword ptr [rbp - 8]
	sete	al
	and	al, 1
	movzx	eax, al
	pop	rbp
	ret
	.cfi_endproc
                                        ## -- End function
	.globl	__ZNSt3__111char_traitsIcE3eofEv ## -- Begin function _ZNSt3__111char_traitsIcE3eofEv
	.weak_definition	__ZNSt3__111char_traitsIcE3eofEv
	.p2align	4, 0x90
__ZNSt3__111char_traitsIcE3eofEv:       ## @_ZNSt3__111char_traitsIcE3eofEv
	.cfi_startproc
## %bb.0:
	push	rbp
	.cfi_def_cfa_offset 16
	.cfi_offset rbp, -16
	mov	rbp, rsp
	.cfi_def_cfa_register rbp
	mov	eax, 4294967295
	pop	rbp
	ret
	.cfi_endproc
                                        ## -- End function
	.globl	__ZN5StackIiEC2Ev       ## -- Begin function _ZN5StackIiEC2Ev
	.weak_def_can_be_hidden	__ZN5StackIiEC2Ev
	.p2align	4, 0x90
__ZN5StackIiEC2Ev:                      ## @_ZN5StackIiEC2Ev
	.cfi_startproc
## %bb.0:
	push	rbp
	.cfi_def_cfa_offset 16
	.cfi_offset rbp, -16
	mov	rbp, rsp
	.cfi_def_cfa_register rbp
	sub	rsp, 32
	mov	eax, 16
	mov	ecx, eax
	mov	qword ptr [rbp - 8], rdi
	mov	rdi, qword ptr [rbp - 8]
	mov	qword ptr [rbp - 16], rdi ## 8-byte Spill
	mov	rdi, rcx
	call	__Znwm
	xor	esi, esi
	mov	edx, 16
                                        ## kill: def %rdx killed %edx
	mov	rcx, rax
	mov	rdi, rcx
	mov	qword ptr [rbp - 24], rax ## 8-byte Spill
	call	_memset
	mov	rax, qword ptr [rbp - 16] ## 8-byte Reload
	mov	rcx, qword ptr [rbp - 24] ## 8-byte Reload
	mov	qword ptr [rax], rcx
	add	rsp, 32
	pop	rbp
	ret
	.cfi_endproc
                                        ## -- End function
	.globl	__ZN5StackIiE7Element7setItemEi ## -- Begin function _ZN5StackIiE7Element7setItemEi
	.weak_definition	__ZN5StackIiE7Element7setItemEi
	.p2align	4, 0x90
__ZN5StackIiE7Element7setItemEi:        ## @_ZN5StackIiE7Element7setItemEi
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
	.globl	__ZN5StackIiE7Element7setNextEPS1_ ## -- Begin function _ZN5StackIiE7Element7setNextEPS1_
	.weak_definition	__ZN5StackIiE7Element7setNextEPS1_
	.p2align	4, 0x90
__ZN5StackIiE7Element7setNextEPS1_:     ## @_ZN5StackIiE7Element7setNextEPS1_
	.cfi_startproc
## %bb.0:
	push	rbp
	.cfi_def_cfa_offset 16
	.cfi_offset rbp, -16
	mov	rbp, rsp
	.cfi_def_cfa_register rbp
	mov	qword ptr [rbp - 8], rdi
	mov	qword ptr [rbp - 16], rsi
	mov	rsi, qword ptr [rbp - 8]
	mov	rdi, qword ptr [rbp - 16]
	mov	qword ptr [rsi + 8], rdi
	pop	rbp
	ret
	.cfi_endproc
                                        ## -- End function
	.globl	__ZN5StackIiE7Element7getItemEv ## -- Begin function _ZN5StackIiE7Element7getItemEv
	.weak_definition	__ZN5StackIiE7Element7getItemEv
	.p2align	4, 0x90
__ZN5StackIiE7Element7getItemEv:        ## @_ZN5StackIiE7Element7getItemEv
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
	.globl	__ZN5StackIiE7Element7getNextEv ## -- Begin function _ZN5StackIiE7Element7getNextEv
	.weak_definition	__ZN5StackIiE7Element7getNextEv
	.p2align	4, 0x90
__ZN5StackIiE7Element7getNextEv:        ## @_ZN5StackIiE7Element7getNextEv
	.cfi_startproc
## %bb.0:
	push	rbp
	.cfi_def_cfa_offset 16
	.cfi_offset rbp, -16
	mov	rbp, rsp
	.cfi_def_cfa_register rbp
	mov	qword ptr [rbp - 8], rdi
	mov	rdi, qword ptr [rbp - 8]
	mov	rax, qword ptr [rdi + 8]
	pop	rbp
	ret
	.cfi_endproc
                                        ## -- End function
	.globl	__ZN5StackIiED2Ev       ## -- Begin function _ZN5StackIiED2Ev
	.weak_def_can_be_hidden	__ZN5StackIiED2Ev
	.p2align	4, 0x90
__ZN5StackIiED2Ev:                      ## @_ZN5StackIiED2Ev
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
	mov	rdi, qword ptr [rdi]
	cmp	rdi, 0
	mov	qword ptr [rbp - 16], rdi ## 8-byte Spill
	je	LBB18_2
## %bb.1:
	mov	rax, qword ptr [rbp - 16] ## 8-byte Reload
	mov	rdi, rax
	call	__ZdlPv
LBB18_2:
	add	rsp, 16
	pop	rbp
	ret
	.cfi_endproc
                                        ## -- End function
	.section	__TEXT,__cstring,cstring_literals
L_.str:                                 ## @.str
	.asciz	"Hello World"

L_.str.1:                               ## @.str.1
	.asciz	"Stack is empty"


.subsections_via_symbols
