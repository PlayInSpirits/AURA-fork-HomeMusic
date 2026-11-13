package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class g80 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ h80 n;

    public g80(h80 h80Var) {
        this.n = h80Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.n.f(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        h80 h80Var = this.n;
        h80Var.g.a.clear();
        z04 z04Var = h80Var.h;
        synchronized (z04Var) {
            z04Var.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        h80 h80Var = this.n;
        h80Var.g.a.clear();
        z04 z04Var = h80Var.h;
        synchronized (z04Var) {
            z04Var.a.c();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        ((zd3) this.n.t.o).setValue(Boolean.valueOf(z));
    }
}
