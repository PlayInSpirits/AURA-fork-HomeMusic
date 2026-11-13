package defpackage;

import android.os.Trace;
import android.view.MotionEvent;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class ia implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ ra o;

    public /* synthetic */ ia(ra raVar, int i) {
        this.n = i;
        this.o = raVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        ra raVar = this.o;
        switch (i) {
            case 0:
                ii iiVar = raVar.v;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!iiVar.isEmpty()) {
                    try {
                        ((gf1) iiVar.removeLast()).invoke();
                    } finally {
                        Trace.endSection();
                    }
                }
                return;
            case 1:
                raVar.J0 = false;
                MotionEvent motionEvent = raVar.z0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    raVar.F(motionEvent);
                    return;
                } else {
                    kf2.o("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                ra.i(raVar.getRoot());
                return;
            default:
                ra.i(raVar.getRoot());
                return;
        }
    }
}
