package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xx1 extends yw1 {
    public final /* synthetic */ gx1 p;

    public xx1(gx1 r1) {
        this.p = r1;
    }

    @Override // defpackage.rw1
    public final boolean g() {
        return this.p.g();
    }

    @Override // java.util.List
    public final Object get(int r2) {
        gx1 r1 = this.p;
        switch(r1.q) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        q73 r3 = ((my3) r1.r).r;
        rr2.q(r2, r3.c);
        return r3.a[r2];
    L5:
        q73 r4 = ((my3) r1.r).r;
        rr2.q(r2, r4.c);
        return new p73(r4, r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.p.size();
    }
}
