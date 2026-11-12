package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lu0 {
    public final float a;

    public lu0(float r1) {
        this.a = r1;
    }

    public final float a(long r1, oo0 r3) {
        return r3.M(this.a);
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L5;
        return true;
    L5:
        if ((r2 instanceof lu0) == true) goto L8;
        return false;
    L8:
        if (ku0.b(this.a, ((lu0) r2).a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
