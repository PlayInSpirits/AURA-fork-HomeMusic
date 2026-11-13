package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashSet;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class wj0 implements ua0 {
    public final Context n;
    public final b04 o;

    public wj0(Context context, b04 b04Var) {
        this.n = context.getApplicationContext();
        this.o = b04Var;
    }

    @Override // defpackage.z92
    public final void j() {
        mf4 f = mf4.f(this.n);
        b04 b04Var = this.o;
        synchronized (f) {
            ((HashSet) f.q).remove(b04Var);
            if (f.o && ((HashSet) f.q).isEmpty()) {
                ll llVar = (ll) f.p;
                ((ConnectivityManager) ((sd0) llVar.q).get()).unregisterNetworkCallback((oy1) llVar.r);
                f.o = false;
            }
        }
    }

    @Override // defpackage.z92
    public final void n() {
        mf4 f = mf4.f(this.n);
        b04 b04Var = this.o;
        synchronized (f) {
            ((HashSet) f.q).add(b04Var);
            f.g();
        }
    }

    @Override // defpackage.z92
    public final void h() {
    }
}
