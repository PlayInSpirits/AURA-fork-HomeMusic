package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rc5 {
    public final String a;
    public final int b;

    public rc5(int r1, String r2) {
        r2.getClass();
        this.a = r2;
        this.b = r1;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof rc5) == true) goto L8;
        return false;
    L8:
        rc5 r6 = (rc5) r5;
        if (h12.c(this.a, r6.a) == true) goto L12;
        return false;
    L12:
        if (this.b == r6.b) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        return Integer.hashCode(this.b) + r0;
    }

    public final String toString() {
        return "WorkGenerationalId(workSpecId=" + this.a + ", generation=" + this.b + ')';
    }
}
