package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ki2 implements Comparable {
    public final long n;
    public final long o;
    public final long p;

    public ki2(long r1, long r3, long r5) {
        this.n = r1;
        this.o = r3;
        this.p = r5;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r3) {
        return Long.compare(this.n, ((ki2) r3).n);
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof ki2) == true) goto L8;
        return false;
    L8:
        ki2 r9 = (ki2) r8;
        if (this.n == r9.n) goto L11;
    L15:
        return false;
    L11:
        if (this.o != r9.o) goto L15;
        if (this.p != r9.p) goto L15;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.n), Long.valueOf(this.o), Long.valueOf(this.p)});
    }
}
