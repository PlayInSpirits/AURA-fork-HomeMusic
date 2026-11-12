package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qt2 implements wc0 {
    public final /* synthetic */ ue1 n;
    public final /* synthetic */ ed2 o;
    public final /* synthetic */ un2 p;
    public final /* synthetic */ IOException q;
    public final /* synthetic */ boolean r;

    public /* synthetic */ qt2(ue1 r1, ed2 r2, un2 r3, IOException r4, boolean r5) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
    }

    @Override // defpackage.wc0
    public final void accept(Object r8) {
        st2 r0 = (st2) r8;
        ue1 r9 = this.n;
        r0.y(r9.o, (mt2) r9.p, this.o, this.p, this.q, this.r);
    }
}
