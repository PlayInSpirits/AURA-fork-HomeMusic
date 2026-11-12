package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class my3 extends hx1 {
    public static final my3 u;
    public final transient q73 r;
    public final transient int s;
    public transient gx1 t;

    static {
        q73 q73Var = new q73();
        q73Var.d(3);
        u = new my3(q73Var);
    }

    public my3(q73 q73Var) {
        this.r = q73Var;
        long j = 0;
        int i = 0;
        while (true) {
            int i2 = q73Var.c;
            if (i >= i2) {
                this.s = jz4.I(j);
                return;
            } else {
                rr2.q(i, i2);
                j += (long) q73Var.b[i];
                i++;
            }
        }
    }

    @Override // defpackage.rw1
    public final boolean g() {
        throw null;
    }

    @Override // defpackage.hx1
    public final jx1 i() {
        gx1 gx1Var = this.t;
        if (gx1Var != null) {
            return gx1Var;
        }
        gx1 gx1Var2 = new gx1(this, 1);
        this.t = gx1Var2;
        return gx1Var2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.s;
    }
}
