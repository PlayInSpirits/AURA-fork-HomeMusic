package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ip implements jb0 {
    public final xb0 a;

    public ip(xb0 r1) {
        r1.getClass();
        this.a = r1;
    }

    @Override // defpackage.jb0
    public final boolean a(dd5 r1) {
        if (c(r1) == true) goto L5;
        return false;
    L5:
        if (e(this.a.a()) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.jb0
    public final ny b(mc0 r4) {
        r4.getClass();
        p r5 = new p(this, null, 2);
        wv r1 = wv.n;
        return new ny(r5, q01.n, -2, r1);
    }

    public abstract int d();

    public abstract boolean e(Object r1);
}
