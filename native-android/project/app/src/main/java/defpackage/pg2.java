package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pg2 extends bc1 {
    public static final Object h = null;
    public final Object f;
    public final Object g;

    static {
        h = new Object();
    }

    public pg2(cu4 r1, Object r2, Object r3) {
        super(r1);
        this.f = r2;
        this.g = r3;
    }

    @Override // defpackage.bc1, defpackage.cu4
    public final int b(Object r2) {
        if (h != r2) goto L9;
        Object r0 = this.g;
        if (r0 == null) goto L9;
        r2 = r0;
    L9:
        return this.e.b(r2);
    }

    @Override // defpackage.bc1, defpackage.cu4
    public final zt4 f(int r2, zt4 r3, boolean r4) {
        this.e.f(r2, r3, r4);
        if (Objects.equals(r3.b, this.g) == false) goto L6;
        if (r4 == false) goto L6;
        r3.b = h;
    L6:
        return r3;
    }

    @Override // defpackage.bc1, defpackage.cu4
    public final Object l(int r2) {
        Object r3 = this.e.l(r2);
        if (Objects.equals(r3, this.g) == true) goto L5;
        return r3;
    L5:
        return h;
    }

    @Override // defpackage.bc1, defpackage.cu4
    public final bu4 m(int r2, bu4 r3, long r4) {
        this.e.m(r2, r3, r4);
        if (Objects.equals(r3.a, this.f) == false) goto L5;
        r3.a = bu4.p;
    L5:
        return r3;
    }
}
