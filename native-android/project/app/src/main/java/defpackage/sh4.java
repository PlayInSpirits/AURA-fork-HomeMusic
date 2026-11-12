package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sh4 {
    public final if1 a;
    public Object b;
    public p03 c;
    public int d;
    public final w03 e;
    public final w03 f;
    public final x03 g;
    public final f13 h;
    public final qg1 i;
    public boolean j;
    public int k;
    public final w03 l;
    public final HashMap m;

    public sh4(if1 r2) {
        this.a = r2;
        this.d = -1;
        this.e = te5.i();
        this.f = new w03();
        this.g = new x03();
        this.h = new f13(new dp0[16]);
        this.i = new qg1(1, this);
        this.l = te5.i();
        this.m = new HashMap();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 16781. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final boolean a(java.util.Set r46) {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0008: IGET (r4v0 ?? I:f13) = (r45v0 'this' sh4 A[IMMUTABLE_TYPE, THIS]) A[DECLARE_VAR] (LINE:9) sh4.h f13 in method: sh4.a(java.util.Set):boolean, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:348)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:316)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:279)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.ArgType.getPrimitiveType()" because "type" is null
            	at jadx.core.codegen.ClassGen.useType(ClassGen.java:564)
            	at jadx.core.codegen.InsnGen.useType(InsnGen.java:269)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:166)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:159)
            	at jadx.core.codegen.InsnGen.assignVar(InsnGen.java:152)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:299)
            	... 11 more
            */
        /*
            Method dump skipped, instruction units count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sh4.a(java.util.Set):boolean");
    }

    public final void b(Object r21, int r22, Object r23, p03 r24) {
        if (this.k > 0) goto L42;
        int r4 = r24.c(r21);
        if (r4 >= 0) goto L8;
        r4 = ~r4;
        int r6 = -1;
    L9:
        r24.b[r4] = r21;
        r24.c[r4] = r22;
        if ((r21 instanceof dp0) == false) goto L30;
        if (r6 == r22) goto L30;
        cp0 r2 = ((dp0) r21).h();
        this.m.put(r21, r2.f);
        p03 r3 = r2.e;
        w03 r5 = this.l;
        te5.J(r5, r21);
        Object[] r7 = r3.b;
        long[] r8 = r3.a;
        int r9 = r8.length - 2;
        if (r9 < 0) goto L30;
        int r10 = 0;
    L15:
        long r11 = r8[r10];
        if (((((~r11) << 7) & r11) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L27;
        int r13 = 8 - ((~(r10 - r9)) >>> 31);
        int r15 = 0;
    L18:
        if (r15 >= r13) goto L26;
        if ((r11 & 255) >= 128) goto L25;
        rl4 r12 = (rl4) r7[(r10 << 3) + r15];
        if ((r12 instanceof sl4) == false) goto L24;
        ((sl4) r12).f(2);
    L24:
        te5.b(r5, r12, r21);
    L25:
        r11 = r11 >> 8;
        r15 = r15 + 1;
        goto L18
    L26:
        if (r13 != 8) goto L30;
    L27:
        if (r10 == r9) goto L30;
        r10 = r10 + 1;
    L30:
        if (r6 == (-1)) goto L32;
        return;
    L32:
        if ((r21 instanceof sl4) == false) goto L34;
        ((sl4) r21).f(2);
    L34:
        te5.b(this.e, r21, r23);
        return;
    L8:
        r6 = r24.c[r4];
        goto L9
    }

    public final void c(k52 r34) {
        w03 r1 = this.f;
        long[] r2 = r1.a;
        int r3 = r2.length - 2;
        if (r3 < 0) goto L48;
        int r5 = 0;
    L5:
        long r6 = r2[r5];
        char r10 = 7;
        long r11 = -9187201950435737472L;
        if (((((~r6) << 7) & r6) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L45;
        int r9 = 8;
        int r8 = 8 - ((~(r5 - r3)) >>> 31);
        int r13 = 0;
    L8:
        if (r13 >= r8) goto L42;
        if ((r6 & 255) >= 128) goto L40;
        int r4 = (r5 << 3) + r13;
        char r16 = r10;
        Object r12 = r1.b[r4];
        long r20 = r11;
        p03 r14 = (p03) r1.c[r4];
        Boolean r22 = (Boolean) r34.invoke(r12);
        if (r22.booleanValue() == false) goto L35;
        Object[] r15 = r14.b;
        int[] r17 = r14.c;
        long[] r18 = r14.a;
        int r25 = r9;
        int r19 = r18.length - 2;
        if (r19 < 0) goto L35;
        long[] r26 = r2;
        long r27 = r6;
        int r7 = 0;
    L16:
        long r21 = r18[r7];
        long[] r29 = r18;
        if (((((~r21) << r16) & r21) & r20) == r20) goto L32;
        int r110 = 8 - ((~(r7 - r19)) >>> 31);
        int r111 = 0;
    L19:
        if (r111 >= r110) goto L29;
        if ((r21 & 255) >= 128) goto L27;
        int r30 = (r7 << 3) + r111;
        long r31 = r21;
        Object r23 = r15[r30];
        int r24 = r17[r30];
        w03 r28 = this.e;
        te5.I(r28, r23, r12);
        Object r32 = r12;
        if ((r23 instanceof dp0) == false) goto L28;
        if (r28.c(r23) == true) goto L28;
        te5.J(this.l, r23);
        this.m.remove(r23);
    L28:
        r21 = r31 >> r25;
        r111 = r111 + 1;
        r12 = r32;
        goto L19
    L27:
        r31 = r21;
        r32 = r12;
        goto L28
    L29:
        Object r33 = r12;
        if (r110 != r25) goto L37;
    L33:
        if (r7 == r19) goto L37;
        r7 = r7 + 1;
        r18 = r29;
        r12 = r33;
        r25 = 8;
    L37:
        if (r22.booleanValue() == false) goto L39;
        r1.k(r4);
    L39:
        int r35 = 8;
    L41:
        r13 = r13 + 1;
        r9 = r35;
        r6 = r27 >> r35;
        r10 = r16;
        r11 = r20;
        r2 = r26;
        goto L8
    L32:
        r33 = r12;
    L35:
        r26 = r2;
        r27 = r6;
        goto L37
    L40:
        r26 = r2;
        r27 = r6;
        r16 = r10;
        r20 = r11;
        r35 = r9;
        goto L41
    L42:
        long[] r210 = r2;
        if (r8 != r9) goto L61;
    L46:
        if (r5 == r3) goto L62;
        r5 = r5 + 1;
        r2 = r210;
        goto L5
    L62:
        return;
    L61:
        return;
    L45:
        r210 = r2;
        goto L46
    }
}
