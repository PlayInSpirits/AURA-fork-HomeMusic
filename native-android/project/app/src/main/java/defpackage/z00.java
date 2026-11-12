package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z00 implements jg1 {
    public final ne0 n;
    public final int o;
    public final wv p;

    public z00(ne0 r1, int r2, wv r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    @Override // defpackage.p81
    public Object a(q81 r4, vd0 r5) {
        Object r3 = te5.j(new r(r4, this, null, 2), r5);
        if (r3 != xe0.n) goto L6;
        return r3;
    L6:
        return j15.a;
    }

    public abstract Object b(rq3 r1, vd0 r2);

    @Override // defpackage.jg1
    public final p81 c(ne0 r5, int r6, wv r7) {
        ne0 r0 = this.n;
        ne0 r8 = r5.J(r0);
        wv r1 = wv.n;
        wv r2 = this.p;
        int r3 = this.o;
        if (r7 != r1) goto L21;
        if (r3 == (-3)) goto L19;
        if (r6 != (-3)) goto L11;
    L9:
        r6 = r3;
        goto L19
    L11:
        if (r3 == (-2)) goto L19;
        if (r6 == (-2)) goto L9;
        r6 = r6 + r3;
        if (r6 >= 0) goto L19;
        r6 = Integer.MAX_VALUE;
    L19:
        r7 = r2;
    L21:
        if (h12.c(r8, r0) == false) goto L26;
        if (r6 != r3) goto L26;
        if (r7 != r2) goto L26;
        return this;
    L26:
        return d(r8, r6, r7);
    }

    public abstract z00 d(ne0 r1, int r2, wv r3);

    public p81 e() {
        return null;
    }

    public String toString() {
        ArrayList r0 = new ArrayList(4);
        q01 r1 = q01.n;
        ne0 r2 = this.n;
        if (r2 == r1) goto L5;
        r0.add("context=" + r2);
    L5:
        int r3 = this.o;
        if (r3 == (-3)) goto L8;
        r0.add("capacity=" + r3);
    L8:
        wv r4 = wv.n;
        wv r5 = this.p;
        if (r5 == r4) goto L12;
        r0.add("onBufferOverflow=" + r5);
    L12:
        return getClass().getSimpleName() + '[' + q40.B0(r0, ", ", null, null, null, 62) + ']';
    }
}
