package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w83 {
    public final v83 a;
    public final ba2 b;

    public w83(ba2 r1, v83 r2) {
        r2.getClass();
        this.a = r2;
        this.b = r1;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof w83) == true) goto L8;
        return false;
    L8:
        w83 r6 = (w83) r5;
        if (h12.c(this.a, r6.a) == true) goto L12;
        return false;
    L12:
        if (h12.c(this.b, r6.b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        ba2 r1 = this.b;
        if (r1 != null) goto L5;
        int r2 = 0;
    L7:
        return r0 + r2;
    L5:
        r2 = r1.hashCode();
        goto L7
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.a + ", owner=" + this.b + ')';
    }
}
