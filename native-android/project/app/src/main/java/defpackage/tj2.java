package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tj2 extends sj2 {
    public final /* synthetic */ pn2 t;

    public tj2(pn2 r1) {
        this.t = r1;
        super(r1);
    }

    @Override // defpackage.bq4
    public final ms2 j() {
        pn2 r0 = this.t;
        oj2 r1 = r0.s;
        if (r1 != null) goto L5;
        kf2.o("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        return null;
    L5:
        if (r1 != r0.p) goto L9;
        qj2 r2 = (qj2) this.o;
        r2.getClass();
        return new ms2(sr0.h(r2));
    L9:
        return r1.d;
    }
}
