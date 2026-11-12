package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m10 extends nv1 {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final nv1[] f;

    public m10(String r2, boolean r3, boolean r4, String[] r5, nv1[] r6) {
        super("CTOC");
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L22;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (m10.class != r3.getClass()) goto L28;
        m10 r4 = (m10) r3;
        if (this.c == r4.c) goto L11;
        return false;
    L11:
        if (this.d == r4.d) goto L13;
        return false;
    L13:
        if (this.b.equals(r4.b) == true) goto L15;
        return false;
    L15:
        if (Arrays.equals(this.e, r4.e) == true) goto L17;
        return false;
    L17:
        if (Arrays.equals(this.f, r4.f) == false) goto L27;
        return true;
    L27:
        return false;
    L28:
        return false;
    L22:
        return true;
    }

    public final int hashCode() {
        int r0 = (((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        return this.b.hashCode() + r0;
    }
}
