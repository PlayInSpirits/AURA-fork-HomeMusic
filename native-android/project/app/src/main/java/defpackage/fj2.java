package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fj2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ si1 o;
    public final /* synthetic */ Bundle p;

    public /* synthetic */ fj2(si1 si1Var, String str, Bundle bundle, int i) {
        this.n = i;
        this.o = si1Var;
        this.p = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        Bundle bundle = this.p;
        si1 si1Var = this.o;
        switch (i) {
            case 0:
                si1Var.I(bundle, null);
                break;
            default:
                si1Var.I(bundle, null);
                break;
        }
    }
}
