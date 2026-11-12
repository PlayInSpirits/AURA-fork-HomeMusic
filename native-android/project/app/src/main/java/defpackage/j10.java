package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j10 {
    public static final i10 b = null;
    public final Object a;

    static {
        b = new i10();
    }

    public /* synthetic */ j10(Object r1) {
        this.a = r1;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof j10) == false) goto L11;
        Object r3 = ((j10) r2).a;
        if (h12.c(this.a, r3) == true) goto L9;
        return false;
    L9:
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        Object r0 = this.a;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return r0.hashCode();
    }

    public final String toString() {
        Object r2 = this.a;
        if ((r2 instanceof h10) == false) goto L7;
        return ((h10) r2).toString();
    L7:
        return "Value(" + r2 + ')';
    }
}
