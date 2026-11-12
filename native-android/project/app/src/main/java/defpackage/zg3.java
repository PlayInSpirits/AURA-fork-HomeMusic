package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zg3 {
    public final boolean a;
    public final int b;

    public zg3(int r1, boolean r2) {
        this.a = r2;
        this.b = r1;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof zg3) == true) goto L8;
        return false;
    L8:
        zg3 r6 = (zg3) r5;
        boolean r1 = r6.a;
        if (this.a == r1) goto L12;
        return false;
    L12:
        if (this.b != r6.b) goto L14;
        return true;
    L14:
        return false;
    }

    public final int hashCode() {
        int r0 = Boolean.hashCode(this.a) * 31;
        return Integer.hashCode(this.b) + r0;
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + h01.a(this.b) + ")";
    }
}
