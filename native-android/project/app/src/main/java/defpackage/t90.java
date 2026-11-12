package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t90 extends aw {
    public final wv C;

    public t90(int r2, wv r3) {
        super(r2);
        this.C = r3;
        if (r3 != wv.n) goto L5;
        nz2.k(kx3.a(aw.class).c(), " instead", "This implementation does not support suspension for senders, use ");
        throw null;
    L5:
        if (r2 < 1) goto L7;
        return;
    L7:
        kf2.e(b11.j(r2, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    @Override // defpackage.aw
    public final boolean D() {
        if (this.C != wv.o) goto L6;
        return true;
    L6:
        return false;
    }

    public final Object S(Object r2, boolean r3) {
        if (this.C != wv.p) goto L12;
        Object r1 = super.d(r2);
        if ((r1 instanceof i10) == true) goto L7;
        return r1;
    L7:
        if ((r1 instanceof h10) == false) goto L10;
        return r1;
    L10:
        return j15.a;
    L12:
        return O(r2);
    }

    @Override // defpackage.aw, defpackage.y94
    public final Object a(vd0 r1, Object r2) {
        if ((S(r2, true) instanceof h10) == true) goto L7;
        return j15.a;
    L7:
        throw u();
    }

    @Override // defpackage.aw, defpackage.y94
    public final Object d(Object r2) {
        return S(r2, false);
    }
}
