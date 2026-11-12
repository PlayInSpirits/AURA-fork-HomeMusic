package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mg1 {
    public int a;

    public mg1(int r1) {
        this.a = r1;
    }

    public final boolean a() {
        if (this.a == Integer.MIN_VALUE) goto L6;
        return true;
    L6:
        return false;
    }

    public final String toString() {
        return super.toString() + "{ location = " + this.a + " }";
    }
}
