package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class js2 implements er2 {
    public final ms2 n;

    public js2(ms2 ms2Var) {
        this.n = ms2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != js2.class) {
            return false;
        }
        return Objects.equals(this.n, ((js2) obj).n);
    }

    public final int hashCode() {
        return Objects.hash(this.n);
    }
}
