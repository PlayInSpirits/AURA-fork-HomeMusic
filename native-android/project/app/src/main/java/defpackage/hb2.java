package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hb2 extends ib2 {
    public final String a;
    public final os4 b;

    public hb2(String r1, os4 r2) {
        this.a = r1;
        this.b = r2;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof hb2) == false) goto L16;
        hb2 r4 = (hb2) r3;
        String r0 = r4.a;
        if (this.a.equals(r0) == true) goto L11;
        return false;
    L11:
        if (h12.c(this.b, r4.b) == true) goto L14;
        return false;
    L14:
        return true;
    L16:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        os4 r1 = this.b;
        if (r1 == null) goto L5;
        int r2 = r1.hashCode();
    L7:
        return (r0 + r2) * 31;
    L5:
        r2 = 0;
        goto L7
    }

    public final String toString() {
        return xa3.h("LinkAnnotation.Url(url=", this.a, ")");
    }
}
