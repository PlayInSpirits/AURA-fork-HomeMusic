package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class sj2 extends bq4 {
    public final /* synthetic */ pn2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj2(pn2 pn2Var) {
        super(pn2Var);
        this.s = pn2Var;
    }

    @Override // defpackage.bq4
    public final void p(String str, Bundle bundle) {
        if (bundle == null) {
            super.p(str, bundle);
            return;
        }
        qj2 qj2Var = (qj2) this.o;
        qj2Var.getClass();
        qj2Var.notifyChildrenChanged(str, bundle);
    }

    @Override // defpackage.bq4
    public final void r() {
        rj2 rj2Var = new rj2(this, this.s);
        this.o = rj2Var;
        rj2Var.onCreate();
    }
}
