package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a44 extends wd0 implements q81 {
    public final q81 n;
    public final ne0 o;
    public final int p;
    public ne0 q;
    public vd0 r;

    public a44(q81 r4, ne0 r5) {
        super(z60.p, q01.n);
        this.n = r4;
        this.o = r5;
        int r2 = 16;
        this.p = ((Number) r5.s(new d60(r2, 0), 0)).intValue();
    }

    @Override // defpackage.q81
    public final Object b(Object r2, vd0 r3) {
        Object r1 = e(r3, r2);     // Catch: Throwable -> L8
        if (r1 != xe0.n) goto L7;
        return r1;
    L7:
        return j15.a;
    L8:
        th = move-exception;
        this.q = new ju0(r3.getContext(), th);
        throw th;
    }

    public final Object e(vd0 r5, Object r6) {
        ne0 r0 = r5.getContext();
        gb.u(r0);
        ne0 r1 = this.q;
        if (r1 != r0) goto L5;
    L13:
        this.r = r5;
        xf1 r7 = c44.a;
        q81 r2 = this.n;
        r2.getClass();
        Object r8 = r7.a(r2, r6, this);
        if (h12.c(r8, xe0.n) == true) goto L16;
        this.r = null;
    L16:
        return r8;
    L5:
        if ((r1 instanceof ju0) == true) goto L12;
        if (((Number) r0.s(new z(11, this), 0)).intValue() != this.p) goto L10;
        this.q = r0;
        goto L13
    L10:
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.o + ",\n\t\tbut emission happened in " + r0 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    L12:
        throw new IllegalStateException(rm4.c0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((ju0) r1).o + ", but then emission attempt of value '" + r6 + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // defpackage.jp, defpackage.ye0
    public final ye0 getCallerFrame() {
        vd0 r1 = this.r;
        if ((r1 instanceof ye0) == true) goto L5;
        return null;
    L5:
        return (ye0) r1;
    }

    @Override // defpackage.wd0, defpackage.vd0
    public final ne0 getContext() {
        ne0 r0 = this.q;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return q01.n;
    }

    @Override // defpackage.jp
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r4) {
        Throwable r0 = bb3.a(r4);
        if (r0 == null) goto L5;
        this.q = new ju0(getContext(), r0);
    L5:
        vd0 r3 = this.r;
        if (r3 == null) goto L9;
        r3.resumeWith(r4);
    L9:
        return xe0.n;
    }
}
