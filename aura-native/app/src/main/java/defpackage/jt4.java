package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class jt4 implements me0 {
    public final ThreadLocal n;

    public jt4(ThreadLocal threadLocal) {
        this.n = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jt4) && h12.c(this.n, ((jt4) obj).n);
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.n + ')';
    }
}
