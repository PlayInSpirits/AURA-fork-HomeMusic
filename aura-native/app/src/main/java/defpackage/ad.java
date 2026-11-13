package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ad implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ bd n;

    public ad(bd bdVar) {
        this.n = bdVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.n.q.removeCallbacks(this);
        bd.a0(this.n);
        bd bdVar = this.n;
        synchronized (bdVar.r) {
            if (bdVar.w) {
                bdVar.w = false;
                ArrayList arrayList = bdVar.t;
                bdVar.t = bdVar.u;
                bdVar.u = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        bd.a0(this.n);
        bd bdVar = this.n;
        synchronized (bdVar.r) {
            if (bdVar.t.isEmpty()) {
                bdVar.p.removeFrameCallback(this);
                bdVar.w = false;
            }
        }
    }
}
