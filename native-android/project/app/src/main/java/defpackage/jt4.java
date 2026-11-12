package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jt4 implements me0 {
    public final ThreadLocal n;

    public jt4(ThreadLocal r1) {
        this.n = r1;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof jt4) == true) goto L9;
        return false;
    L9:
        if (h12.c(this.n, ((jt4) r4).n) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.n + ')';
    }
}
