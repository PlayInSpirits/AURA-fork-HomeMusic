package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xq3 {
    public static final xq3 b = null;
    public final g40 a;

    static {
        b = new xq3(new g40());
    }

    public xq3(g40 r1) {
        this.a = r1;
        if (Float.isNaN(0.0f) == true) goto L5;
        return;
    L5:
        kf2.n("current must not be NaN");
        throw null;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L6;
        return true;
    L6:
        if ((r3 instanceof xq3) == true) goto L9;
        return false;
    L9:
        if (this.a.equals(((xq3) r3).a) == true) goto L12;
        return false;
    L12:
        return true;
    }

    public final int hashCode() {
        int r0 = Float.hashCode(0.0f) * 31;
        return (this.a.hashCode() + r0) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=0.0, range=" + this.a + ", steps=0)";
    }
}
