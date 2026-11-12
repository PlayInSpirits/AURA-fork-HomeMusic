package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ly4 implements Serializable {
    public final String n;
    public final Object o;
    public final Serializable p;

    public ly4(String r1, Object r2, Serializable r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof ly4) == false) goto L19;
        ly4 r4 = (ly4) r3;
        if (this.n.equals(r4.n) == true) goto L11;
        return false;
    L11:
        if (this.o.equals(r4.o) == true) goto L14;
        return false;
    L14:
        if (this.p.equals(r4.p) == true) goto L17;
        return false;
    L17:
        return true;
    L19:
        return false;
    }

    public final int hashCode() {
        int r0 = this.n.hashCode() * 31;
        int r1 = (this.o.hashCode() + r0) * 31;
        return this.p.hashCode() + r1;
    }

    public final String toString() {
        return "(" + this.n + ", " + this.o + ", " + this.p + ')';
    }
}
