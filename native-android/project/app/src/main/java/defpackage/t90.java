package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t90 extends aw {
    public final wv C;

    public t90(int i, wv wvVar) {
        super(i);
        this.C = wvVar;
        if (wvVar == wv.n) {
            nz2.k(kx3.a(aw.class).c(), " instead", "This implementation does not support suspension for senders, use ");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        kf2.e(b11.j(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    @Override // defpackage.aw
    public final boolean D() {
        return this.C == wv.o;
    }

    public final Object S(Object obj, boolean z) {
        if (this.C != wv.p) {
            return O(obj);
        }
        Object objD = super.d(obj);
        return (!(objD instanceof i10) || (objD instanceof h10)) ? objD : j15.a;
    }

    @Override // defpackage.aw, defpackage.y94
    public final Object a(vd0 vd0Var, Object obj) throws Throwable {
        if (S(obj, true) instanceof h10) {
            throw u();
        }
        return j15.a;
    }

    @Override // defpackage.aw, defpackage.y94
    public final Object d(Object obj) {
        return S(obj, false);
    }
}
