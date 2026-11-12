package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class od3 {
    public final ic a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public od3(ic r1, int r2, int r3, int r4, int r5, float r6, float r7) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
    }

    public final int a(int r2) {
        int r0 = this.c;
        int r1 = this.b;
        return gb.m(r2, r1, r0) - r1;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L5;
        return true;
    L5:
        if ((r4 instanceof od3) == false) goto L27;
        od3 r5 = (od3) r4;
        if (this.a == r5.a) goto L11;
        return false;
    L11:
        if (this.b != r5.b) goto L27;
        if (this.c != r5.c) goto L27;
        if (this.d != r5.d) goto L27;
        if (this.e != r5.e) goto L27;
        if (Float.compare(this.f, r5.f) != 0) goto L27;
        if (Float.compare(this.g, r5.g) != 0) goto L27;
        return true;
    L27:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        int r1 = f34.d(this.b, r0, 31);
        int r2 = f34.d(this.c, r1, 31);
        int r3 = f34.d(this.d, r2, 31);
        int r4 = b11.d(f34.d(this.e, r3, 31), this.f, 31);
        return Float.hashCode(this.g) + r4;
    }

    public final String toString() {
        return "ParagraphInfo(paragraph=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ", startLineIndex=" + this.d + ", endLineIndex=" + this.e + ", top=" + this.f + ", bottom=" + this.g + ")";
    }
}
