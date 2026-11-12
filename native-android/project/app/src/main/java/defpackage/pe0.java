package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pe0 extends d0 implements le0 {
    public static final oe0 o = new oe0(fz0.R, new k2(11, 0));

    public pe0() {
        super(fz0.R);
    }

    @Override // defpackage.d0, defpackage.ne0
    public final le0 K(me0 me0Var) {
        le0 le0Var;
        me0Var.getClass();
        if (me0Var instanceof oe0) {
            oe0 oe0Var = (oe0) me0Var;
            me0 me0Var2 = this.n;
            if ((me0Var2 == oe0Var || oe0Var.o == me0Var2) && (le0Var = (le0) oe0Var.n.invoke(this)) != null) {
                return le0Var;
            }
        } else if (fz0.R == me0Var) {
            return this;
        }
        return null;
    }

    public abstract void W(ne0 ne0Var, Runnable runnable);

    public void X(ne0 ne0Var, Runnable runnable) {
        W(ne0Var, runnable);
    }

    public boolean Y(ne0 ne0Var) {
        return !(this instanceof e15);
    }

    public pe0 Z(int i) {
        e35.o(i);
        return new la2(this, i);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + si0.x(this);
    }

    @Override // defpackage.d0, defpackage.ne0
    public final ne0 u(me0 me0Var) {
        me0Var.getClass();
        if (me0Var instanceof oe0) {
            oe0 oe0Var = (oe0) me0Var;
            me0 me0Var2 = this.n;
            if ((me0Var2 != oe0Var && oe0Var.o != me0Var2) || ((le0) oe0Var.n.invoke(this)) == null) {
                return this;
            }
        } else if (fz0.R != me0Var) {
            return this;
        }
        return q01.n;
    }
}
