package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u50 implements as4 {
    public final long n;

    public u50(long r3) {
        this.n = r3;
        if (r3 == 16) goto L5;
        return;
    L5:
        dz1.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.as4
    public final float b() {
        return x40.d(this.n);
    }

    @Override // defpackage.as4
    public final long c() {
        return this.n;
    }

    public final boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof u50) == true) goto L9;
        return false;
    L9:
        if (x40.c(this.n, ((u50) r6).n) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // defpackage.as4
    public final uo f() {
        return null;
    }

    public final int hashCode() {
        int r0 = x40.h;
        return Long.hashCode(this.n);
    }

    public final String toString() {
        return xa3.h("ColorStyle(value=", x40.h(this.n), ")");
    }
}
