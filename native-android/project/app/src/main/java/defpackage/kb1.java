package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kb1 extends r14 implements wf1 {
    public final /* synthetic */ int o = 1;
    public Object p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ sf1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb1(ne0 ne0Var, wf1 wf1Var, vd0 vd0Var) {
        super(vd0Var);
        this.r = ne0Var;
        this.s = wf1Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        int i = this.o;
        sf1 sf1Var = this.s;
        switch (i) {
            case 0:
                kb1 kb1Var = new kb1((ne0) this.r, (wf1) sf1Var, vd0Var);
                kb1Var.p = obj;
                return kb1Var;
            default:
                kb1 kb1Var2 = new kb1((gf1) sf1Var, vd0Var);
                kb1Var2.r = obj;
                return kb1Var2;
        }
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.o;
        j15 j15Var = j15.a;
        switch (i) {
            case 0:
                return ((kb1) create((hp4) obj, (vd0) obj2)).invokeSuspend(j15Var);
            default:
                return ((kb1) create((ba4) obj, (vd0) obj2)).invokeSuspend(j15Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:13:0x0040  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2, types: [hp4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v3, types: [hp4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [wf1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0040 -> B:14:0x0041). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x009a -> B:25:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00af -> B:25:0x006a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.jp
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.o
            j15 r1 = defpackage.j15.a
            sf1 r2 = r12.s
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            xe0 r4 = defpackage.xe0.n
            r5 = 1
            r6 = 0
            switch(r0) {
                case 0: goto L44;
                default: goto Lf;
            }
        Lf:
            int r0 = r12.q
            if (r0 == 0) goto L24
            if (r0 != r5) goto L1f
            java.lang.Object r0 = r12.p
            java.lang.Object r3 = r12.r
            ba4 r3 = (defpackage.ba4) r3
            defpackage.kb4.X(r13)
            goto L41
        L1f:
            defpackage.kf2.o(r3)
            r1 = r6
            goto L43
        L24:
            defpackage.kb4.X(r13)
            java.lang.Object r13 = r12.r
            ba4 r13 = (defpackage.ba4) r13
            r3 = r13
        L2c:
            r13 = r2
            gf1 r13 = (defpackage.gf1) r13
            java.lang.Object r13 = r13.invoke()
            if (r13 == 0) goto L40
            r12.r = r3
            r12.p = r13
            r12.q = r5
            r3.b(r12, r13)
            r1 = r4
            goto L43
        L40:
            r0 = r6
        L41:
            if (r0 != 0) goto L2c
        L43:
            return r1
        L44:
            java.lang.Object r0 = r12.r
            ne0 r0 = (defpackage.ne0) r0
            int r7 = r12.q
            ln3 r8 = defpackage.ln3.p
            r9 = 3
            r10 = 2
            if (r7 == 0) goto L76
            if (r7 == r5) goto L6e
            if (r7 == r10) goto L63
            if (r7 != r9) goto L5e
            java.lang.Object r3 = r12.p
            hp4 r3 = (defpackage.hp4) r3
            defpackage.kb4.X(r13)
            goto L6a
        L5e:
            defpackage.kf2.o(r3)
            r1 = r6
            goto Lb4
        L63:
            java.lang.Object r3 = r12.p
            hp4 r3 = (defpackage.hp4) r3
            defpackage.kb4.X(r13)     // Catch: java.util.concurrent.CancellationException -> L6c
        L6a:
            r13 = r3
            goto L7d
        L6c:
            r13 = move-exception
            goto La1
        L6e:
            java.lang.Object r3 = r12.p
            hp4 r3 = (defpackage.hp4) r3
            defpackage.kb4.X(r13)     // Catch: java.util.concurrent.CancellationException -> L6c
            goto L92
        L76:
            defpackage.kb4.X(r13)
            java.lang.Object r13 = r12.p
            hp4 r13 = (defpackage.hp4) r13
        L7d:
            boolean r3 = defpackage.gb.L(r0)
            if (r3 == 0) goto Lb4
            r3 = r2
            wf1 r3 = (defpackage.wf1) r3     // Catch: java.util.concurrent.CancellationException -> L9d
            r12.p = r13     // Catch: java.util.concurrent.CancellationException -> L9d
            r12.q = r5     // Catch: java.util.concurrent.CancellationException -> L9d
            java.lang.Object r3 = r3.invoke(r13, r12)     // Catch: java.util.concurrent.CancellationException -> L9d
            if (r3 != r4) goto L91
            goto Lb1
        L91:
            r3 = r13
        L92:
            r12.p = r3     // Catch: java.util.concurrent.CancellationException -> L6c
            r12.q = r10     // Catch: java.util.concurrent.CancellationException -> L6c
            java.lang.Object r13 = defpackage.xl.f(r3, r8, r12)     // Catch: java.util.concurrent.CancellationException -> L6c
            if (r13 != r4) goto L6a
            goto Lb1
        L9d:
            r3 = move-exception
            r11 = r3
            r3 = r13
            r13 = r11
        La1:
            boolean r6 = defpackage.gb.L(r0)
            if (r6 == 0) goto Lb3
            r12.p = r3
            r12.q = r9
            java.lang.Object r13 = defpackage.xl.f(r3, r8, r12)
            if (r13 != r4) goto L6a
        Lb1:
            r1 = r4
            goto Lb4
        Lb3:
            throw r13
        Lb4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb1(gf1 gf1Var, vd0 vd0Var) {
        super(vd0Var);
        this.s = gf1Var;
    }
}
