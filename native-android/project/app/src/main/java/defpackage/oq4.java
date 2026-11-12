package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oq4 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public oq4(int r1, int r2, String r3, String r4, String r5, boolean r6) {
        r3.getClass();
        r4.getClass();
        this.a = r3;
        this.b = r4;
        this.c = r6;
        this.d = r1;
        this.e = r5;
        this.f = r2;
        String r7 = r4.toUpperCase(Locale.ROOT);
        r7.getClass();
        if (qm4.o0(r7, "INT") == false) goto L6;
        int r8 = 3;
    L25:
        this.g = r8;
        return;
    L6:
        if (qm4.o0(r7, "CHAR") == false) goto L8;
    L24:
        r8 = 2;
        goto L25
    L8:
        if (qm4.o0(r7, "CLOB") == true) goto L24;
        if (qm4.o0(r7, "TEXT") == true) goto L24;
        if (qm4.o0(r7, "BLOB") == false) goto L16;
        r8 = 5;
        goto L25
    L16:
        if (qm4.o0(r7, "REAL") == false) goto L18;
    L23:
        r8 = 4;
        goto L25
    L18:
        if (qm4.o0(r7, "FLOA") == true) goto L23;
        if (qm4.o0(r7, "DOUB") == true) goto L23;
        r8 = 1;
        goto L25
    }

    public final boolean equals(Object r9) {
        if (this != r9) goto L6;
    L47:
        return true;
    L6:
        if ((r9 instanceof oq4) == true) goto L9;
    L48:
        return false;
    L9:
        if (this.d <= 0) goto L11;
        boolean r1 = true;
    L12:
        oq4 r10 = (oq4) r9;
        int r3 = r10.f;
        if (r10.d <= 0) goto L15;
        boolean r4 = true;
    L16:
        if (r1 != r4) goto L48;
        if (h12.c(this.a, r10.a) == false) goto L48;
        if (this.c != r10.c) goto L48;
        String r2 = r10.e;
        int r5 = this.f;
        String r6 = this.e;
        if (r5 != 1) goto L31;
        if (r3 != 2) goto L31;
        if (r6 == null) goto L31;
        if (vr1.j(r6, r2) == false) goto L48;
    L31:
        if (r5 != 2) goto L37;
        if (r3 != 1) goto L37;
        if (r2 == null) goto L37;
        if (vr1.j(r2, r6) == false) goto L48;
    L37:
        if (r5 == 0) goto L46;
        if (r5 != r3) goto L46;
        if (r6 != null) goto L41;
        if (r2 == null) goto L46;
    L41:
        if (vr1.j(r6, r2) == false) goto L48;
    L46:
        if (this.g != r10.g) goto L48;
    L15:
        r4 = false;
        goto L16
    L11:
        r1 = false;
        goto L12
    }

    public final int hashCode() {
        int r0 = ((this.a.hashCode() * 31) + this.g) * 31;
        if (this.c == false) goto L5;
        int r1 = 1231;
    L7:
        return ((r0 + r1) * 31) + this.d;
    L5:
        r1 = 1237;
        goto L7
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("\n            |Column {\n            |   name = '");
        r0.append(this.a);
        r0.append("',\n            |   type = '");
        r0.append(this.b);
        r0.append("',\n            |   affinity = '");
        r0.append(this.g);
        r0.append("',\n            |   notNull = '");
        r0.append(this.c);
        r0.append("',\n            |   primaryKeyPosition = '");
        r0.append(this.d);
        r0.append("',\n            |   defaultValue = '");
        String r2 = this.e;
        if (r2 != null) goto L5;
        r2 = "undefined";
    L5:
        r0.append(r2);
        r0.append("'\n            |}\n        ");
        return rm4.b0(rm4.d0(r0.toString()));
    }
}
