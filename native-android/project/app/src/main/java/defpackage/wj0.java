package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wj0 implements ua0 {
    public final Context n;
    public final b04 o;

    public wj0(Context r1, b04 r2) {
        this.n = r1.getApplicationContext();
        this.o = r2;
    }

    @Override // defpackage.z92
    public final void h() {
    }

    @Override // defpackage.z92
    public final void j() {
        mf4 r0 = mf4.f(this.n);
        b04 r2 = this.o;
        monitor-enter(r0);
        ((HashSet) r0.q).remove(r2);     // Catch: Throwable -> L12
        if (r0.o == true) goto L7;
    L10:
        monitor-exit(r0);
        return;
    L7:
        if (((HashSet) r0.q).isEmpty() == false) goto L10;
        ll r3 = (ll) r0.p;     // Catch: Throwable -> L12
        ((ConnectivityManager) ((sd0) r3.q).get()).unregisterNetworkCallback((oy1) r3.r);     // Catch: Throwable -> L12
        r0.o = false;     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.z92
    public final void n() {
        mf4 r0 = mf4.f(this.n);
        b04 r2 = this.o;
        monitor-enter(r0);
        ((HashSet) r0.q).add(r2);     // Catch: Throwable -> L7
        r0.g();     // Catch: Throwable -> L7
        monitor-exit(r0);
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
