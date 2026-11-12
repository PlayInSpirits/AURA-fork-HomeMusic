package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ec1 extends ic1 {
    public final /* synthetic */ kc1 a;

    public ec1(kc1 kc1Var) {
        this.a = kc1Var;
    }

    @Override // defpackage.ic1
    public final void a() {
        kc1 kc1Var = this.a;
        ((xm2) kc1Var.g0.o).a();
        e54.b(kc1Var);
        Bundle bundle = kc1Var.o;
        kc1Var.g0.s(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
