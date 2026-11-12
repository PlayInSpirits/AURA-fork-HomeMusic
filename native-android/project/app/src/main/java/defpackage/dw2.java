package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dw2 implements nt2 {
    public final rm2 a;
    public final gj0 b;
    public boolean c;
    public final /* synthetic */ ew2 d;

    public dw2(ew2 r2) {
        this.d = r2;
        this.a = new rm2(3, this);
        this.b = new gj0();
    }

    @Override // defpackage.nt2
    public final void a(bq r5, cu4 r6) {
        ew2 r0 = this.d;
        r0.q = r6;
        if (this.c == false) goto L5;
        return;
    L5:
        this.c = true;
        no2 r7 = r5.b(new mt2(r6.l(0)), this.b, 0);
        r0.p = r7;
        r7.m(this.a, 0);
    }
}
