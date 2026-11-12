package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class zw1 extends qp implements vb2, Serializable {
    public final transient ly3 r;
    public final transient int s;

    public zw1(ly3 r1, int r2) {
        this.r = r1;
        this.s = r2;
    }

    @Override // defpackage.u1, defpackage.qz2
    public final Collection a() {
        return (rw1) super.a();
    }

    @Override // defpackage.u1, defpackage.qz2
    public /* bridge */ /* synthetic */ Map b() {
        return i();
    }

    @Override // defpackage.qz2
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.u1
    public final boolean d(Object r1) {
        if (r1 != null) goto L4;
        return false;
    L4:
        if (super.d(r1) == false) goto L9;
        return true;
    L9:
        return false;
    }

    @Override // defpackage.u1
    public final Map e() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.u1
    public final Collection f() {
        return new dx1(this);
    }

    @Override // defpackage.u1
    public final Set g() {
        throw new AssertionError("unreachable");
    }

    @Override // defpackage.qz2
    public final Collection get(Object r1) {
        yw1 r0 = (yw1) this.r.get(r1);
        if (r0 != null) goto L6;
        vw1 r2 = yw1.o;
        return gy3.r;
    L6:
        return r0;
    }

    @Override // defpackage.u1
    public final Iterator h() {
        return new cx1(this);
    }

    public bx1 i() {
        return this.r;
    }

    @Override // defpackage.u1, defpackage.qz2
    public final Set keySet() {
        ly3 r1 = this.r;
        jx1 r0 = r1.o;
        if (r0 != null) goto L6;
        jy3 r2 = r1.d();
        r1.o = r2;
        return r2;
    L6:
        return r0;
    }

    @Override // defpackage.u1, defpackage.qz2
    public final boolean remove(Object r1, Object r2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.qz2
    public final int size() {
        return this.s;
    }
}
