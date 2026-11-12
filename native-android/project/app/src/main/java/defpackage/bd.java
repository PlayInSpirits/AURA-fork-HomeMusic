package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bd extends pe0 {
    public final Choreographer p;
    public final Handler q;
    public boolean v;
    public boolean w;
    public final ed y;
    public static final rp4 z = new rp4(new t5(6));
    public static final zc A = new zc(0);
    public final Object r = new Object();
    public final ii s = new ii();
    public ArrayList t = new ArrayList();
    public ArrayList u = new ArrayList();
    public final ad x = new ad(this);

    public bd(Choreographer choreographer, Handler handler) {
        this.p = choreographer;
        this.q = handler;
        this.y = new ed(choreographer, this);
    }

    public static final void a0(bd bdVar) {
        Runnable runnable;
        boolean z2;
        do {
            synchronized (bdVar.r) {
                ii iiVar = bdVar.s;
                runnable = (Runnable) (iiVar.isEmpty() ? null : iiVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (bdVar.r) {
                    ii iiVar2 = bdVar.s;
                    runnable = (Runnable) (iiVar2.isEmpty() ? null : iiVar2.removeFirst());
                }
            }
            synchronized (bdVar.r) {
                if (bdVar.s.isEmpty()) {
                    z2 = false;
                    bdVar.v = false;
                } else {
                    z2 = true;
                }
            }
        } while (z2);
    }

    @Override // defpackage.pe0
    public final void W(ne0 ne0Var, Runnable runnable) {
        synchronized (this.r) {
            this.s.addLast(runnable);
            if (!this.v) {
                this.v = true;
                this.q.post(this.x);
                if (!this.w) {
                    this.w = true;
                    this.p.postFrameCallback(this.x);
                }
            }
        }
    }
}
