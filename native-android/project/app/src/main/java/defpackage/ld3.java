package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ld3 {
    public final Object a;
    public final Object b;

    public ld3(Object r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof ld3) == true) goto L5;
        return false;
    L5:
        ld3 r5 = (ld3) r4;
        if (Objects.equals(r5.a, this.a) == true) goto L8;
    L11:
        return false;
    L8:
        if (Objects.equals(r5.b, this.b) == false) goto L11;
        return true;
    }

    public final int hashCode() {
        int r0 = 0;
        Object r1 = this.a;
        if (r1 != null) goto L5;
        int r2 = 0;
    L6:
        Object r3 = this.b;
        if (r3 == null) goto L11;
        r0 = r3.hashCode();
    L11:
        return r2 ^ r0;
    L5:
        r2 = r1.hashCode();
        goto L6
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
