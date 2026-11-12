package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xs4 {
    public final String a;
    public String b;
    public boolean c;
    public rd3 d;

    public xs4(String r1, String r2) {
        this.a = r1;
        this.b = r2;
        this.c = false;
        this.d = null;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof xs4) == true) goto L8;
        return false;
    L8:
        xs4 r6 = (xs4) r5;
        if (h12.c(this.a, r6.a) == true) goto L12;
        return false;
    L12:
        if (h12.c(this.b, r6.b) == true) goto L15;
        return false;
    L15:
        if (this.c == r6.c) goto L18;
        return false;
    L18:
        if (h12.c(this.d, r6.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        int r1 = xa3.c(f34.e(this.b, r0, 31), 31, this.c);
        rd3 r3 = this.d;
        if (r3 != null) goto L5;
        int r4 = 0;
    L7:
        return r1 + r4;
    L5:
        r4 = r3.hashCode();
        goto L7
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.d + ", isShowingSubstitution=" + this.c + ")";
    }
}
