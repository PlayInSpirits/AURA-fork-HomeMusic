package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class qt2 implements wc0 {
    public final /* synthetic */ ue1 n;
    public final /* synthetic */ ed2 o;
    public final /* synthetic */ un2 p;
    public final /* synthetic */ IOException q;
    public final /* synthetic */ boolean r;

    public /* synthetic */ qt2(ue1 ue1Var, ed2 ed2Var, un2 un2Var, IOException iOException, boolean z) {
        this.n = ue1Var;
        this.o = ed2Var;
        this.p = un2Var;
        this.q = iOException;
        this.r = z;
    }

    @Override // defpackage.wc0
    public final void accept(Object obj) {
        st2 st2Var = (st2) obj;
        ue1 ue1Var = this.n;
        st2Var.y(ue1Var.o, (mt2) ue1Var.p, this.o, this.p, this.q, this.r);
    }
}
