package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pe0 extends d0 implements le0 {
    public static final oe0 o = null;

    static {
        o = new oe0(fz0.R, new k2(11, 0));
    }

    public pe0() {
        super(fz0.R);
    }

    @Override // defpackage.d0, defpackage.ne0
    public final le0 K(me0 r4) {
        r4.getClass();
        if ((r4 instanceof oe0) == false) goto L14;
        oe0 r5 = (oe0) r4;
        me0 r0 = this.n;
        if (r0 != r5) goto L7;
    L10:
        le0 r3 = (le0) r5.n.invoke(this);
        if (r3 == null) goto L16;
        return r3;
    L16:
        return null;
    L7:
        if (r5.o == r0) goto L10;
        return null;
    L14:
        if (fz0.R != r4) goto L16;
        return this;
    }

    public abstract void W(ne0 r1, Runnable r2);

    public void X(ne0 r1, Runnable r2) {
        W(r1, r2);
    }

    public boolean Y(ne0 r1) {
        return !(this instanceof e15);
    }

    public pe0 Z(int r2) {
        e35.o(r2);
        return new la2(this, r2);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + si0.x(this);
    }

    @Override // defpackage.d0, defpackage.ne0
    public final ne0 u(me0 r3) {
        r3.getClass();
        if ((r3 instanceof oe0) == false) goto L14;
        oe0 r4 = (oe0) r3;
        me0 r0 = this.n;
        if (r0 == r4) goto L11;
        if (r4.o == r0) goto L11;
        return this;
    L11:
        if (((le0) r4.n.invoke(this)) != null) goto L16;
        return this;
    L16:
        return q01.n;
    L14:
        if (fz0.R == r3) goto L16;
        return this;
    }
}
