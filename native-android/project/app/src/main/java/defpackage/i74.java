package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i74 {
    public static final i74 b = null;
    public final jx1 a;

    static {
        si1 r0 = new si1(22, false);
        r0.o = jx1.j(2, new Object[]{1, 5});
        b = new i74(r0);
    }

    public i74(si1 r1) {
        this.a = (jx1) r1.o;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof i74) == true) goto L6;
        return false;
    L6:
        if (this.a.equals(((i74) r2).a) == false) goto L9;
        return true;
    L9:
        return false;
    }

    public final int hashCode() {
        Boolean r3 = Boolean.TRUE;
        return Objects.hash(new Object[]{this.a, null, null, r3, r3, r3, r3, r3});
    }
}
