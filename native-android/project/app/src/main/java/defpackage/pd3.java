package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pd3 {
    public final mc a;
    public final int b;
    public final int c;

    public pd3(mc r1, int r2, int r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L5;
        return true;
    L5:
        if ((r4 instanceof pd3) == false) goto L15;
        pd3 r5 = (pd3) r4;
        if (this.a == r5.a) goto L11;
        return false;
    L11:
        if (this.b != r5.b) goto L15;
        if (this.c != r5.c) goto L15;
        return true;
    L15:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        int r1 = f34.d(this.b, r0, 31);
        return Integer.hashCode(this.c) + r1;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        r0.append(this.a);
        r0.append(", startIndex=");
        r0.append(this.b);
        r0.append(", endIndex=");
        return f34.i(r0, this.c, ")");
    }
}
