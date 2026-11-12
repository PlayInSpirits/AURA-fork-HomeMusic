package defpackage;

import com.google.android.gms.common.internal.a;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fj5 extends fh5 {
    public final /* synthetic */ a g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj5(a aVar, int i) {
        super(aVar, i, null);
        this.g = aVar;
    }

    @Override // defpackage.fh5
    public final void a(ka0 ka0Var) {
        this.g.v.k(ka0Var);
        System.currentTimeMillis();
    }

    @Override // defpackage.fh5
    public final boolean b() {
        this.g.v.k(ka0.r);
        return true;
    }
}
