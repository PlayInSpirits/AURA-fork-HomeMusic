package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class s14 implements Serializable {
    public final Throwable n;

    public s14(Throwable th) {
        th.getClass();
        this.n = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s14) {
            return h12.c(this.n, ((s14) obj).n);
        }
        return false;
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.n + ')';
    }
}
