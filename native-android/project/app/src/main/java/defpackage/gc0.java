package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gc0 implements p81 {
    public final /* synthetic */ int n;
    public final Object o;

    public /* synthetic */ gc0(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.p81
    public final Object a(q81 r13, vd0 r14) {
        int r0 = this.n;
        xe0 r2 = xe0.n;
        Object r3 = this.o;
        j15 r4 = j15.a;
        switch(r0) {
            case 0: goto L41;
            case 1: goto L12;
            default: goto L4;
        };
    L4:
        p81[] r6 = (p81[]) r3;
        c60 r5 = new c60(r6, new zf0(8, r6), new kc5(3, null), r13, null);
        s81 r12 = new s81(r14, r14.getContext());
        Object r15 = h12.O(r12, r12, r5);
        if (r15 == r2) goto L8;
        r15 = r4;
    L8:
        if (r15 == r2) goto L10;
        return r4;
    L10:
        return r15;
    L41:
        Object r16 = ((x81) r3).a(new fc0(0, r13), r14);
        if (r16 == r2) goto L44;
        return r4;
    L44:
        return r16;
    L12:
        if ((r14 instanceof e0) == false) goto L16;
        e0 r17 = (e0) r14;
        int r1 = r17.q;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L16;
        r17.q = r1 - Integer.MIN_VALUE;
    L17:
        Object r18 = r17.o;
        int r19 = r17.q;
        if (r19 == 0) goto L26;
        if (r19 != 1) goto L25;
        a44 r110 = r17.n;
        kb4.X(r18);     // Catch: Throwable -> L23
    L34:
        r110.releaseIntercepted();
        return r4;
    L23:
        th = move-exception;
        Throwable r111 = th;
    L39:
        r110.releaseIntercepted();
        throw r111;
    L25:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L26:
        kb4.X(r18);
        a44 r112 = new a44(r13, r17.getContext());
        r17.n = r112;     // Catch: Throwable -> L37
        r17.q = 1;     // Catch: Throwable -> L37
        Object r113 = ((wf1) r3).invoke(r112, r17);     // Catch: Throwable -> L37
        if (r113 == r2) goto L31;
        r113 = r4;
    L31:
        if (r113 == r2) goto L51;
        r110 = r112;
        goto L34
    L51:
        return r2;
    L37:
        th = move-exception;
        r110 = r112;
        r111 = th;
    L16:
        r17 = new e0(this, r14);
        goto L17
    }
}
