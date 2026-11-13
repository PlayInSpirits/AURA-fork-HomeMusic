package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class g55 implements DisplayManager.DisplayListener {
    public final Choreographer n;
    public final DisplayManager o;
    public volatile long p = -9223372036854775807L;
    public volatile long q = -9223372036854775807L;

    public g55(Choreographer choreographer, DisplayManager displayManager) {
        this.n = choreographer;
        this.o = displayManager;
    }

    public abstract void a();

    public abstract void b();

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
