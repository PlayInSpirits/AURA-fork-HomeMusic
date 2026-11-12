package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wj0 implements ua0 {
    public final Context n;
    public final b04 o;

    public wj0(Context context, b04 b04Var) {
        this.n = context.getApplicationContext();
        this.o = b04Var;
    }

    @Override // defpackage.z92
    public final void h() {
    }

    @Override // defpackage.z92
    public final void j() {
        mf4 mf4VarF = mf4.f(this.n);
        b04 b04Var = this.o;
        synchronized (mf4VarF) {
            ((HashSet) mf4VarF.q).remove(b04Var);
            if (mf4VarF.o && ((HashSet) mf4VarF.q).isEmpty()) {
                ll llVar = (ll) mf4VarF.p;
                ((ConnectivityManager) ((sd0) llVar.q).get()).unregisterNetworkCallback((oy1) llVar.r);
                mf4VarF.o = false;
            }
        }
    }

    @Override // defpackage.z92
    public final void n() {
        mf4 mf4VarF = mf4.f(this.n);
        b04 b04Var = this.o;
        synchronized (mf4VarF) {
            ((HashSet) mf4VarF.q).add(b04Var);
            mf4VarF.g();
        }
    }
}
