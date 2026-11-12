package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g55 implements DisplayManager.DisplayListener {
    public final Choreographer n;
    public final DisplayManager o;
    public volatile long p;
    public volatile long q;

    public g55(Choreographer r1, DisplayManager r2) {
        this.n = r1;
        this.o = r2;
        this.p = -9223372036854775807L;
        this.q = -9223372036854775807L;
    }

    public abstract void a();

    public abstract void b();

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int r1) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int r1) {
    }
}
