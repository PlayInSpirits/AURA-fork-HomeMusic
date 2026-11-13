package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class fn4 implements aa4, gx0 {
    public final aa4 a;
    public final int b;
    public final int c;

    public fn4(aa4 aa4Var, int i, int i2) {
        aa4Var.getClass();
        this.a = aa4Var;
        this.b = i;
        this.c = i2;
        if (i < 0) {
            kf2.e(f34.f(i, "startIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 < 0) {
            kf2.e(f34.f(i2, "endIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 >= i) {
            return;
        }
        kf2.e(xa3.e(i2, i, "endIndex should be not less than startIndex, but was ", " < "));
        throw null;
    }

    @Override // defpackage.gx0
    public final aa4 a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? this : new fn4(this.a, i3, i + i3);
    }

    @Override // defpackage.gx0
    public final aa4 b(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? y01.a : new fn4(this.a, i3 + i, i2);
    }

    @Override // defpackage.aa4
    public final Iterator iterator() {
        return new bh1(this);
    }
}
