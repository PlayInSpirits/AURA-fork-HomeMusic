package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ck4 implements wd {
    public final float a;
    public final Object b;

    public ck4(float r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.wd
    public final g45 a() {
        Object r1 = this.b;
        if (r1 != null) goto L5;
        ce r2 = null;
    L6:
        int r3 = i45.a;
        float r4 = this.a;
        if (r2 == null) goto L9;
    L11:
        if (r2 == null) goto L13;
        Object r5 = new rm2(r2, r4);
    L14:
        c05 r0 = new c05();
        r0.n = new ss0(r5);
        return r0;
    L13:
        r5 = new h45(r4);
        goto L14
    L9:
        if (r4 != 1500.0f) goto L11;
        r5 = ym0.n;
        goto L14
    L5:
        r2 = (ce) ((if1) p35.a.o).invoke(r1);
        goto L6
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof ck4) == false) goto L10;
        ck4 r4 = (ck4) r3;
        if (r4.a == this.a) goto L7;
        return false;
    L7:
        if (h12.c(r4.b, this.b) == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    public final int hashCode() {
        Object r0 = this.b;
        if (r0 == null) goto L5;
        int r1 = r0.hashCode();
    L6:
        int r2 = b11.d(r1 * 31, 1.0f, 31);
        return Float.hashCode(this.a) + r2;
    L5:
        r1 = 0;
        goto L6
    }
}
