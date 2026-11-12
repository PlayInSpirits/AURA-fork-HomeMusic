package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ve {
    public final int a;
    public final rf2 b;
    public final le c;
    public final String d;

    public ve(rf2 r1, le r2, String r3) {
        this.b = r1;
        this.c = r2;
        this.d = r3;
        this.a = Arrays.hashCode(new Object[]{r1, r2, r3});
    }

    public final boolean equals(Object r5) {
        if (r5 != null) goto L6;
        return false;
    L6:
        if (r5 != this) goto L9;
        return true;
    L9:
        if ((r5 instanceof ve) == true) goto L11;
        return false;
    L11:
        ve r6 = (ve) r5;
        if (au0.n(this.b, r6.b) == true) goto L14;
    L18:
        return false;
    L14:
        if (au0.n(this.c, r6.c) == false) goto L18;
        if (au0.n(this.d, r6.d) == false) goto L18;
        return true;
    }

    public final int hashCode() {
        return this.a;
    }
}
