package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fh4 extends r14 implements wf1 {
    public long[] o;
    public int p;
    public int q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ gh4 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh4(gh4 gh4Var, vd0 vd0Var) {
        super(vd0Var);
        this.t = gh4Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        fh4 fh4Var = new fh4(this.t, vd0Var);
        fh4Var.s = obj;
        return fh4Var;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        return ((fh4) create((ba4) obj, (vd0) obj2)).invokeSuspend(j15.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    /* JADX WARN: Code duplicated, block: B:24:0x0080  */
    /* JADX WARN: Code duplicated, block: B:27:0x0095  */
    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x009e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007e -> B:26:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bc -> B:37:0x00be). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:27:0x0095
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.jp
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            gh4 r1 = r0.t
            long r2 = r1.n
            long r4 = r1.p
            long r6 = r1.o
            int r8 = r0.r
            r9 = 0
            r12 = 64
            r13 = 3
            r14 = 2
            r16 = 0
            r18 = 1
            r10 = 1
            xe0 r11 = defpackage.xe0.n
            if (r8 == 0) goto L4b
            if (r8 == r10) goto L3c
            if (r8 == r14) goto L32
            if (r8 != r13) goto L2c
            int r1 = r0.p
            java.lang.Object r6 = r0.s
            ba4 r6 = (defpackage.ba4) r6
            defpackage.kb4.X(r23)
            r7 = r13
            goto Lbe
        L2c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.kf2.o(r0)
            return r9
        L32:
            int r1 = r0.p
            java.lang.Object r8 = r0.s
            ba4 r8 = (defpackage.ba4) r8
            defpackage.kb4.X(r23)
            goto L93
        L3c:
            int r1 = r0.q
            int r8 = r0.p
            long[] r15 = r0.o
            java.lang.Object r13 = r0.s
            ba4 r13 = (defpackage.ba4) r13
            defpackage.kb4.X(r23)
            int r8 = r8 + r10
            goto L59
        L4b:
            defpackage.kb4.X(r23)
            java.lang.Object r8 = r0.s
            r13 = r8
            ba4 r13 = (defpackage.ba4) r13
            long[] r15 = r1.q
            if (r15 == 0) goto L70
            int r1 = r15.length
            r8 = 0
        L59:
            if (r8 >= r1) goto L70
            r2 = r15[r8]
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            r0.s = r13
            r0.o = r15
            r0.p = r8
            r0.q = r1
            r0.r = r10
            r13.b(r0, r4)
            return r11
        L70:
            int r1 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r1 == 0) goto L96
            r8 = r13
            r1 = 0
        L76:
            if (r1 >= r12) goto L95
            long r20 = r18 << r1
            long r20 = r6 & r20
            int r13 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r13 == 0) goto L93
            long r2 = (long) r1
            long r4 = r4 + r2
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            r0.s = r8
            r0.o = r9
            r0.p = r1
            r0.r = r14
            r8.b(r0, r2)
            return r11
        L93:
            int r1 = r1 + r10
            goto L76
        L95:
            r13 = r8
        L96:
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r1 == 0) goto Lc1
            r6 = r13
            r15 = 0
        L9c:
            if (r15 >= r12) goto Lc1
            long r7 = r18 << r15
            long r7 = r7 & r2
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 == 0) goto Lbc
            long r1 = (long) r15
            long r4 = r4 + r1
            r1 = 64
            long r4 = r4 + r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r0.s = r6
            r0.o = r9
            r0.p = r15
            r7 = 3
            r0.r = r7
            r6.b(r0, r1)
            return r11
        Lbc:
            r7 = 3
            r1 = r15
        Lbe:
            int r15 = r1 + 1
            goto L9c
        Lc1:
            j15 r0 = defpackage.j15.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fh4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
