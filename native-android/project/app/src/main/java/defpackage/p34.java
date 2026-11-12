package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p34 {
    public final q34 a;
    public final q34 b;
    public final Throwable c;

    public p34(q34 r1, x90 r2, Throwable r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof p34) == true) goto L8;
        return false;
    L8:
        p34 r6 = (p34) r5;
        if (h12.c(this.a, r6.a) == true) goto L12;
        return false;
    L12:
        if (h12.c(this.b, r6.b) == true) goto L15;
        return false;
    L15:
        if (h12.c(this.c, r6.c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        int r1 = 0;
        q34 r2 = this.b;
        if (r2 != null) goto L5;
        int r3 = 0;
    L6:
        int r4 = (r0 + r3) * 31;
        Throwable r5 = this.c;
        if (r5 == null) goto L11;
        r1 = r5.hashCode();
    L11:
        return r4 + r1;
    L5:
        r3 = r2.hashCode();
        goto L6
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.a + ", nextPlan=" + this.b + ", throwable=" + this.c + ')';
    }

    public /* synthetic */ p34(q34 r2, Throwable r3, int r4) {
        if ((r4 & 4) == 0) goto L5;
        r3 = null;
    L5:
        this(r2, null, r3);
    }
}
