package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o00 {
    public static final o00 c = null;
    public final Set a;
    public final rr2 b;

    static {
        c = new o00(q40.T0(new ArrayList()), null);
    }

    public o00(Set r1, rr2 r2) {
        this.a = r1;
        this.b = r2;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof o00) == false) goto L10;
        o00 r4 = (o00) r3;
        if (r4.a.equals(this.a) == true) goto L7;
        return false;
    L7:
        if (h12.c(r4.b, this.b) == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    public final int hashCode() {
        int r0 = (this.a.hashCode() + 1517) * 41;
        rr2 r1 = this.b;
        if (r1 == null) goto L5;
        int r2 = r1.hashCode();
    L7:
        return r0 + r2;
    L5:
        r2 = 0;
        goto L7
    }
}
