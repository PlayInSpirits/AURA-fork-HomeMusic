package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pf4 {
    public static final pf4 c = new pf4(-1, -1);
    public final int a;
    public final int b;

    static {
        new pf4(0, 0);
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public pf4(int i, int i2) {
        rr2.l((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof pf4) {
            pf4 pf4Var = (pf4) obj;
            if (this.a == pf4Var.a && this.b == pf4Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i << 16;
        return this.b ^ ((i >>> 16) | i2);
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
