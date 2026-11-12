package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uh5 implements Serializable {
    public final Object n;

    public uh5(Object r1) {
        this.n = r1;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof uh5) == true) goto L5;
        return false;
    L5:
        return bu.H(this.n, ((uh5) r2).n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n});
    }

    public final String toString() {
        return xa3.h("Suppliers.ofInstance(", this.n.toString(), ")");
    }
}
