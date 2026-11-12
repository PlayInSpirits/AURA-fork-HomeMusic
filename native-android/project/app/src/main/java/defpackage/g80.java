package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g80 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ h80 n;

    public g80(h80 r1) {
        this.n = r1;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration r1) {
        this.n.f(r1);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        h80 r1 = this.n;
        r1.g.a.clear();
        z04 r2 = r1.h;
        monitor-enter(r2);
        r2.a.c();     // Catch: Throwable -> L7
        monitor-exit(r2);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int r1) {
        h80 r0 = this.n;
        r0.g.a.clear();
        z04 r2 = r0.h;
        monitor-enter(r2);
        r2.a.c();     // Catch: Throwable -> L7
        monitor-exit(r2);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean r1) {
        ((zd3) this.n.t.o).setValue(Boolean.valueOf(r1));
    }
}
