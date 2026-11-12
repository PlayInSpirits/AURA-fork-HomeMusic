package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jw4 {
    public static final jw4 b = null;
    public static final String c = null;
    public final yw1 a;

    static {
        vw1 r1 = yw1.o;
        b = new jw4(gy3.r);
        String r0 = f35.a;
        c = Integer.toString(0, 36);
    }

    public jw4(List r1) {
        this.a = yw1.k(r1);
    }

    public final boolean a(int r9) {
        int r1 = 0;
    L3:
        yw1 r2 = this.a;
        if (r1 >= r2.size()) goto L14;
        iw4 r3 = (iw4) r2.get(r1);
        boolean[] r4 = r3.e;
        int r5 = r4.length;
        int r6 = 0;
    L6:
        if (r6 >= r5) goto L13;
        if (r4[r6] == true) goto L10;
        r6 = r6 + 1;
        goto L6
    L10:
        if (r3.b.c != r9) goto L13;
        return true;
    L13:
        r1 = r1 + 1;
        goto L3
    L14:
        return false;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (jw4.class == r3.getClass()) goto L10;
        return false;
    L10:
        return this.a.equals(((jw4) r3).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
