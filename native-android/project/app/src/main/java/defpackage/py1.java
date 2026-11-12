package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class py1 implements wd {
    public final yy4 a;
    public final hz3 b;

    public py1(yy4 r1, hz3 r2) {
        this.a = r1;
        this.b = r2;
        if (r1.a == 0) goto L5;
        return;
    L5:
        kf2.n("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    @Override // defpackage.wd
    public final g45 a() {
        yy4 r2 = this.a;
        x7 r1 = new x7(r2.a, r2.b);
        ru r0 = new ru();
        r0.p = r1;
        r0.q = this.b;
        r0.n = ((long) r1.o) * 1000000;
        r0.o = 0;
        return r0;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof py1) == false) goto L10;
        py1 r4 = (py1) r3;
        if (r4.a.equals(this.a) == true) goto L7;
        return false;
    L7:
        if (r4.b != this.b) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        int r2 = (this.b.hashCode() + r0) * 31;
        return Long.hashCode(0) + r2;
    }
}
