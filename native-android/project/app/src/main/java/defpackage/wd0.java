package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wd0 extends jp {
    private final ne0 _context;
    private transient vd0<Object> intercepted;

    public wd0(vd0 r2) {
        if (r2 == null) goto L4;
        ne0 r0 = r2.getContext();
    L5:
        this(r2, r0);
        return;
    L4:
        r0 = null;
        goto L5
    }

    @Override // defpackage.vd0
    public ne0 getContext() {
        ne0 r0 = this._context;
        r0.getClass();
        return r0;
    }

    public final vd0<Object> intercepted() {
        vd0<Object> r0 = this.intercepted;
        if (r0 != null) goto L10;
        pe0 r1 = (pe0) getContext().K(fz0.R);
        if (r1 == null) goto L7;
        vd0<Object> r2 = new mr0(r1, this);
    L8:
        this.intercepted = r2;
        return r2;
    L7:
        r2 = this;
        goto L8
    L10:
        return r0;
    }

    @Override // defpackage.jp
    public void releaseIntercepted() {
        vd0<Object> r0 = this.intercepted;
        if (r0 == null) goto L8;
        if (r0 == this) goto L8;
        le0 r1 = getContext().K(fz0.R);
        r1.getClass();
        pe0 r2 = (pe0) r1;
        mr0 r3 = (mr0) r0;
        r3.i();
        cz r4 = r3.l();
        if (r4 == null) goto L8;
        r4.m();
    L8:
        this.intercepted = z60.o;
    }

    public wd0(vd0 r1, ne0 r2) {
        super(r1);
        this._context = r2;
    }
}
