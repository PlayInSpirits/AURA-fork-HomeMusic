package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a10 extends z00 {
    public final p81 q;

    public a10(p81 r1, ne0 r2, int r3, wv r4) {
        super(r2, r3, r4);
        this.q = r1;
    }

    @Override // defpackage.z00, defpackage.p81
    public final Object a(q81 r7, vd0 r8) {
        int r0 = this.o;
        xe0 r2 = xe0.n;
        if (r0 != (-3)) goto L24;
        ne0 r1 = r8.getContext();
        Boolean r3 = Boolean.FALSE;
        d60 r4 = new d60(10, 0);
        ne0 r5 = this.n;
        if (((Boolean) r5.s(r4, r3)).booleanValue() == true) goto L7;
        ne0 r6 = r1.J(r5);
    L9:
        if (h12.c(r6, r1) == false) goto L13;
        Object r9 = f(r7, r8);
        if (r9 != r2) goto L28;
        return r9;
    L28:
        return j15.a;
    L13:
        fz0 r10 = fz0.R;
        if (h12.c(r6.K(r10), r1.K(r10)) == false) goto L24;
        ne0 r11 = r8.getContext();
        if ((r7 instanceof z94) == false) goto L18;
    L21:
        p r12 = new p(this, null, 5);
        Object r13 = ud3.J0(r6, r7, te5.O(r6), r12, r8);
        if (r13 != r2) goto L28;
        return r13;
    L18:
        if ((r7 instanceof n63) == true) goto L21;
        r7 = new z81(r7, r11);
        goto L21
    L7:
        r6 = jz4.t(r1, r5, false);
    L24:
        Object r14 = super.a(r7, r8);
        if (r14 != r2) goto L28;
        return r14;
    }

    @Override // defpackage.z00
    public final Object b(rq3 r2, vd0 r3) {
        Object r1 = f(new z94(r2), r3);
        if (r1 != xe0.n) goto L6;
        return r1;
    L6:
        return j15.a;
    }

    public abstract Object f(q81 r1, vd0 r2);

    @Override // defpackage.z00
    public final String toString() {
        return this.q + " -> " + super.toString();
    }
}
