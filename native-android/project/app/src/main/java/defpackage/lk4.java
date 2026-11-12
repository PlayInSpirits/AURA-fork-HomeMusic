package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lk4 implements vd0, ye0 {
    public final vd0 n;
    public final ne0 o;

    public lk4(vd0 r1, ne0 r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.ye0
    public final ye0 getCallerFrame() {
        vd0 r1 = this.n;
        if ((r1 instanceof ye0) == true) goto L5;
        return null;
    L5:
        return (ye0) r1;
    }

    @Override // defpackage.vd0
    public final ne0 getContext() {
        return this.o;
    }

    @Override // defpackage.vd0
    public final void resumeWith(Object r1) {
        this.n.resumeWith(r1);
    }
}
