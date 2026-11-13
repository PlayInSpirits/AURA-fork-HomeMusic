package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ki2 implements Comparable {
    public final long n;
    public final long o;
    public final long p;

    public ki2(long j, long j2, long j3) {
        this.n = j;
        this.o = j2;
        this.p = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.n, ((ki2) obj).n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki2)) {
            return false;
        }
        ki2 ki2Var = (ki2) obj;
        return this.n == ki2Var.n && this.o == ki2Var.o && this.p == ki2Var.p;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.n), Long.valueOf(this.o), Long.valueOf(this.p));
    }
}
