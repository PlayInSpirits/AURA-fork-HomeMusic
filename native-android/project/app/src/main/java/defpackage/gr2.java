package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gr2 {
    public final yw1 a;
    public final int b;
    public final long c;

    public gr2(List r1, int r2, long r3) {
        this.a = yw1.k(r1);
        this.b = r2;
        this.c = r3;
    }

    public final boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof gr2) == true) goto L8;
        return false;
    L8:
        gr2 r7 = (gr2) r6;
        if (this.a.equals(r7.a) == true) goto L11;
    L15:
        return false;
    L11:
        if (this.b != r7.b) goto L15;
        if (this.c != r7.c) goto L15;
        return true;
    }

    public final int hashCode() {
        int r0 = ((this.a.hashCode() * 31) + this.b) * 31;
        return si0.z(this.c) + r0;
    }
}
