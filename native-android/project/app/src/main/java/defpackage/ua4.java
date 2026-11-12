package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ua4 implements Runnable {
    public final /* synthetic */ int n;
    public boolean o;
    public final Object p;
    public final Object q;

    public ua4(ea2 ea2Var, q92 q92Var) {
        this.n = 0;
        ea2Var.getClass();
        q92Var.getClass();
        this.p = ea2Var;
        this.q = q92Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zg5 zg5Var;
        switch (this.n) {
            case 0:
                if (!this.o) {
                    ((ea2) this.p).d((q92) this.q);
                    this.o = true;
                }
                break;
            case 1:
                qi3 qi3Var = (qi3) this.p;
                yf4 yf4Var = (yf4) this.q;
                if (yf4Var.g && !this.o) {
                    long duration = qi3Var.getDuration();
                    long jM0 = qi3Var.M0();
                    if (duration > 0 && duration != -9223372036854775807L) {
                        long j = duration - jM0;
                        if (j >= 1 && j <= 10000) {
                            this.o = true;
                            yf4Var.c = false;
                            yf4Var.a.post(new pb0(yf4Var, qi3Var, new float[]{1.0f}, 6));
                        }
                    }
                    yf4Var.a.postDelayed(this, 500L);
                }
                break;
            default:
                View view = (View) this.p;
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.q;
                o65 o65Var = swipeDismissBehavior.n;
                if (o65Var != null && o65Var.g()) {
                    WeakHashMap weakHashMap = j65.a;
                    view.postOnAnimation(this);
                    break;
                } else if (this.o && (zg5Var = swipeDismissBehavior.o) != null) {
                    zg5Var.y(view);
                    break;
                }
                break;
        }
    }

    public ua4(yf4 yf4Var, qi3 qi3Var) {
        this.n = 1;
        this.q = yf4Var;
        this.p = qi3Var;
        this.o = false;
    }

    public ua4(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.n = 2;
        this.q = swipeDismissBehavior;
        this.p = view;
        this.o = z;
    }
}
