package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m05 {
    public final vk0 a;
    public final gb1 b;
    public final int c;
    public final int d;
    public final Object e;

    public m05(vk0 r1, gb1 r2, int r3, int r4, Object r5) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m05) == true) goto L8;
        return false;
    L8:
        m05 r6 = (m05) r5;
        if (h12.c(this.a, r6.a) == true) goto L12;
        return false;
    L12:
        if (h12.c(this.b, r6.b) == true) goto L15;
        return false;
    L15:
        if (this.c == r6.c) goto L17;
    L22:
        return false;
    L17:
        if (this.d != r6.d) goto L22;
        if (h12.c(this.e, r6.e) == true) goto L21;
        return false;
    L21:
        return true;
    }

    public final int hashCode() {
        int r0 = 0;
        vk0 r1 = this.a;
        if (r1 != null) goto L5;
        int r2 = 0;
    L6:
        int r3 = f34.d(this.d, f34.d(this.c, ((r2 * 31) + this.b.n) * 31, 31), 31);
        Object r4 = this.e;
        if (r4 == null) goto L11;
        r0 = r4.hashCode();
    L11:
        return r3 + r0;
    L5:
        r2 = r1.hashCode();
        goto L6
    }

    public final String toString() {
        String r0 = "Invalid";
        int r2 = this.c;
        if (r2 != 0) goto L5;
        String r3 = "Normal";
    L8:
        int r4 = this.d;
        if (r4 != 0) goto L11;
        r0 = "None";
    L19:
        StringBuilder r1 = new StringBuilder("TypefaceRequest(fontFamily=");
        r1.append(this.a);
        r1.append(", fontWeight=");
        r1.append(this.b);
        r1.append(", fontStyle=");
        f34.n(r1, r3, ", fontSynthesis=", r0, ", resourceLoaderCacheKey=");
        r1.append(this.e);
        r1.append(")");
        return r1.toString();
    L11:
        if (r4 != 1) goto L14;
        r0 = "Weight";
        goto L19
    L14:
        if (r4 != 2) goto L17;
        r0 = "Style";
        goto L19
    L17:
        if (r4 != 65535) goto L19;
        r0 = "All";
        goto L19
    L5:
        if (r2 != 1) goto L7;
        r3 = "Italic";
        goto L8
    L7:
        r3 = "Invalid";
        goto L8
    }
}
