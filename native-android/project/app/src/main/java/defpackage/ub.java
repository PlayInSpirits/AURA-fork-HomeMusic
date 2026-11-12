package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ub {
    public final Context a;
    public final oo0 b;
    public final long c;
    public final ac3 d;

    public ub(Context r1, oo0 r2, long r3, ac3 r5) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r5;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L5;
        return true;
    L5:
        if (r8 == null) goto L7;
        Class<?> r1 = r8.getClass();
    L9:
        if (ub.class.equals(r1) == true) goto L11;
        return false;
    L11:
        r8.getClass();
        ub r9 = (ub) r8;
        if (h12.c(this.a, r9.a) == true) goto L15;
        return false;
    L15:
        if (h12.c(this.b, r9.b) == true) goto L18;
        return false;
    L18:
        if (x40.c(this.c, r9.c) == true) goto L21;
        return false;
    L21:
        if (h12.c(this.d, r9.d) == true) goto L23;
        return false;
    L23:
        return true;
    L7:
        r1 = null;
        goto L9
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        int r2 = (this.b.hashCode() + r0) * 31;
        int r1 = x40.h;
        int r3 = xa3.b(r2, 31, this.c);
        return this.d.hashCode() + r3;
    }
}
