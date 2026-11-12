package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hu2 {
    public final String a;
    public final String b;
    public final String c;
    public final String[] d;

    public hu2(String r1, String r2, String r3, String[] r4) {
        r1.getClass();
        r4.getClass();
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
    }

    public static Charset a(hu2 r6) {
        String[] r7 = r6.d;
        int r2 = 0;
        int r0 = q05.n(0, r7.length - 1, 2);
        if (r0 >= 0) goto L5;
    L9:
        String r8 = null;
    L10:
        if (r8 != null) goto L15;
        return null;
    L15:
        return Charset.forName(r8);
    L14:
        return null;
    L5:
        if (xm4.f0(r7[r2], "charset", true) == true) goto L6;
        if (r2 == r0) goto L9;
        r2 = r2 + 2;
        goto L5
    L6:
        r8 = r7[r2 + 1];
        goto L10
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof hu2) == true) goto L5;
        return false;
    L5:
        if (h12.c(((hu2) r2).a, this.a) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
