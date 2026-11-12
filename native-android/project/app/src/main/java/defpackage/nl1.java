package defpackage;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nl1 extends q1 {
    public final transient int t;

    public nl1() {
        super(p60.b(12));
        this.t = 2;
        this.t = 2;
    }

    @Override // defpackage.u1, defpackage.qz2
    public final Collection a() {
        return (Set) super.a();
    }

    @Override // defpackage.q1, defpackage.qz2
    public final Collection get(Object r1) {
        return (Set) super.get(r1);
    }

    @Override // defpackage.q1
    public final Collection i() {
        return r60.a(this.t);
    }

    @Override // defpackage.q1
    public final Collection k(Object r2, Collection r3) {
        return new p1(this, r2, (Set) r3);
    }

    public final Set l(Object r1) {
        return (Set) super.get(r1);
    }
}
