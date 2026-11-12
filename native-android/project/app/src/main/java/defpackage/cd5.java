package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cd5 {
    public String a;
    public int b;

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof cd5) == false) goto L16;
        cd5 r4 = (cd5) r3;
        if (h12.c(this.a, r4.a) == true) goto L11;
        return false;
    L11:
        if (this.b == r4.b) goto L14;
        return false;
    L14:
        return true;
    L16:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        return xa3.w(this.b) + r0;
    }

    public final String toString() {
        return "IdAndState(id=" + this.a + ", state=" + f34.q(this.b) + ')';
    }
}
