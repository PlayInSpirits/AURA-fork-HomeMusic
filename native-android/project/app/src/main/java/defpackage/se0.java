package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class se0 extends d0 {
    public static final i80 p = null;
    public final String o;

    static {
        p = new i80(18);
    }

    public se0() {
        super(p);
        this.o = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof se0) == true) goto L9;
        return false;
    L9:
        if (h12.c(this.o, ((se0) r4).o) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final String toString() {
        return "CoroutineName(" + this.o + ')';
    }
}
