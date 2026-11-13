package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class se0 extends d0 {
    public static final i80 p = new i80(18);
    public final String o;

    public se0() {
        super(p);
        this.o = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof se0) && h12.c(this.o, ((se0) obj).o);
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final String toString() {
        return "CoroutineName(" + this.o + ')';
    }
}
