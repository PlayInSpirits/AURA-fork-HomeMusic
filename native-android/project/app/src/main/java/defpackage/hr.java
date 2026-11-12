package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hr {
    public final float a;

    public /* synthetic */ hr(float r1) {
        this.a = r1;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof hr) == false) goto L11;
        float r3 = ((hr) r2).a;
        if (Float.compare(this.a, r3) == 0) goto L9;
        return false;
    L9:
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.a + ")";
    }
}
