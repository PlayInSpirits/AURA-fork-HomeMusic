package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tz2 extends u1 implements vb2 {
    public final vb2 r;
    public final hg3 s;

    public tz2(vb2 r1, hg3 r2) {
        r1.getClass();
        this.r = r1;
        this.s = r2;
    }

    @Override // defpackage.qz2
    public final void clear() {
        this.r.clear();
    }

    @Override // defpackage.u1
    public final Map e() {
        return new kg2(this.r.b(), new ss2(5, this));
    }

    @Override // defpackage.u1
    public final Collection f() {
        return new s1(0, this);
    }

    @Override // defpackage.u1
    public final Set g() {
        return this.r.keySet();
    }

    @Override // defpackage.qz2
    public final Collection get(Object r4) {
        List r0 = (List) this.r.get(r4);
        return hw.P(new rm3(this.s, r4, false), r0);
    }

    @Override // defpackage.u1
    public final Iterator h() {
        return new i22(this.r.a().iterator(), new pz1(3, this.s));
    }

    @Override // defpackage.u1, defpackage.qz2
    public final boolean remove(Object r1, Object r2) {
        return get(r1).remove(r2);
    }

    @Override // defpackage.qz2
    public final int size() {
        return this.r.size();
    }
}
