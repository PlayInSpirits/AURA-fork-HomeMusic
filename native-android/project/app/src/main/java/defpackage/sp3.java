package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sp3 {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final long i;

    public sp3(String r1, long r2, String r4, String r5, String r6, String r7, String r8, String r9, long r10) {
        r1.getClass();
        this.a = r1;
        this.b = r2;
        this.c = r4;
        this.d = r5;
        this.e = r6;
        this.f = r7;
        this.g = r8;
        this.h = r9;
        this.i = r10;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof sp3) == true) goto L8;
        return false;
    L8:
        sp3 r9 = (sp3) r8;
        if (h12.c(this.a, r9.a) == true) goto L12;
        return false;
    L12:
        if (this.b == r9.b) goto L15;
        return false;
    L15:
        if (h12.c(this.c, r9.c) == true) goto L18;
        return false;
    L18:
        if (h12.c(this.d, r9.d) == true) goto L21;
        return false;
    L21:
        if (h12.c(this.e, r9.e) == true) goto L24;
        return false;
    L24:
        if (h12.c(this.f, r9.f) == true) goto L27;
        return false;
    L27:
        if (h12.c(this.g, r9.g) == true) goto L30;
        return false;
    L30:
        if (h12.c(this.h, r9.h) == true) goto L33;
        return false;
    L33:
        if (this.i == r9.i) goto L35;
        return false;
    L35:
        return true;
    }

    public final int hashCode() {
        int r0 = xa3.b(this.a.hashCode() * 31, 31, this.b);
        int r2 = 0;
        String r3 = this.c;
        if (r3 != null) goto L5;
        int r4 = 0;
    L6:
        int r1 = (r0 + r4) * 31;
        String r5 = this.d;
        if (r5 != null) goto L9;
        int r6 = 0;
    L10:
        int r7 = (r1 + r6) * 31;
        String r8 = this.e;
        if (r8 != null) goto L13;
        int r9 = 0;
    L14:
        int r10 = (r7 + r9) * 31;
        String r11 = this.f;
        if (r11 != null) goto L17;
        int r12 = 0;
    L18:
        int r13 = (r10 + r12) * 31;
        String r14 = this.g;
        if (r14 != null) goto L21;
        int r15 = 0;
    L22:
        int r16 = (r13 + r15) * 31;
        String r17 = this.h;
        if (r17 == null) goto L27;
        r2 = r17.hashCode();
    L27:
        return Long.hashCode(this.i) + ((r16 + r2) * 31);
    L21:
        r15 = r14.hashCode();
        goto L22
    L17:
        r12 = r11.hashCode();
        goto L18
    L13:
        r9 = r8.hashCode();
        goto L14
    L9:
        r6 = r5.hashCode();
        goto L10
    L5:
        r4 = r3.hashCode();
        goto L6
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("ResumePoint(id=");
        r0.append(this.a);
        r0.append(", position=");
        r0.append(this.b);
        f34.n(r0, ", title=", this.c, ", album=", this.d);
        f34.n(r0, ", artist=", this.e, ", albumId=", this.f);
        f34.n(r0, ", coverArtId=", this.g, ", type=", this.h);
        r0.append(", timestamp=");
        r0.append(this.i);
        r0.append(")");
        return r0.toString();
    }
}
