package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ow2 {
    public final long a;
    public final Set b;
    public final Set c;

    public ow2(long r1, Set r3, Set r4) {
        r4.getClass();
        this.a = r1;
        this.b = r3;
        this.c = r4;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof ow2) == true) goto L8;
        return false;
    L8:
        ow2 r9 = (ow2) r8;
        if (this.a == r9.a) goto L12;
        return false;
    L12:
        if (h12.c(this.b, r9.b) == true) goto L15;
        return false;
    L15:
        if (h12.c(this.c, r9.c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r0 = Long.hashCode(this.a) * 31;
        int r1 = (this.b.hashCode() + r0) * 31;
        return this.c.hashCode() + r1;
    }

    public final String toString() {
        return "State(mixId=" + this.a + ", owned=" + this.b + ", tried=" + this.c + ")";
    }

    public /* synthetic */ ow2() {
        z01 r0 = z01.n;
        this(0, r0, r0);
    }
}
