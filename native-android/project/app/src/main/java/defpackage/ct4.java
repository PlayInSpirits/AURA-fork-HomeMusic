package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ct4 {
    public final long a;

    public /* synthetic */ ct4(long r1) {
        this.a = r1;
    }

    public static final boolean a(long r0, long r2) {
        if (r0 != r2) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof ct4) == false) goto L11;
        long r0 = ((ct4) r3).a;
        if (this.a == r0) goto L9;
        return false;
    L9:
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long r2 = this.a;
        if (a(r2, 0) == false) goto L7;
        return "Unspecified";
    L7:
        if (a(r2, 4294967296L) == false) goto L11;
        return "Sp";
    L11:
        if (a(r2, 8589934592L) == false) goto L14;
        return "Em";
    L14:
        return "Invalid";
    }
}
