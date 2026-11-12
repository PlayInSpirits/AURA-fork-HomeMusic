package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fn4 implements aa4, gx0 {
    public final aa4 a;
    public final int b;
    public final int c;

    public fn4(aa4 r2, int r3, int r4) {
        r2.getClass();
        this.a = r2;
        this.b = r3;
        this.c = r4;
        if (r3 < 0) goto L11;
        if (r4 < 0) goto L9;
        if (r4 < r3) goto L7;
        return;
    L7:
        kf2.e(xa3.e(r4, r3, "endIndex should be not less than startIndex, but was ", " < "));
        throw null;
    L9:
        kf2.e(f34.f(r4, "endIndex should be non-negative, but is "));
        throw null;
    L11:
        kf2.e(f34.f(r3, "startIndex should be non-negative, but is "));
        throw null;
    }

    @Override // defpackage.gx0
    public final aa4 a(int r3) {
        int r0 = this.c;
        int r1 = this.b;
        if (r3 < (r0 - r1)) goto L6;
        return this;
    L6:
        return new fn4(this.a, r1, r3 + r1);
    }

    @Override // defpackage.gx0
    public final aa4 b(int r4) {
        int r0 = this.c;
        int r1 = this.b;
        if (r4 < (r0 - r1)) goto L7;
        return y01.a;
    L7:
        return new fn4(this.a, r1 + r4, r0);
    }

    @Override // defpackage.aa4
    public final Iterator iterator() {
        return new bh1(this);
    }
}
