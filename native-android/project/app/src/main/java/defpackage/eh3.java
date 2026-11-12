package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eh3 {
    public final zg3 a;

    public eh3(zg3 r1) {
        this.a = r1;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof eh3) == true) goto L8;
        return false;
    L8:
        zg3 r5 = ((eh3) r4).a;
        if (h12.c(this.a, r5) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        zg3 r0 = this.a;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.hashCode();
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.a + ")";
    }
}
