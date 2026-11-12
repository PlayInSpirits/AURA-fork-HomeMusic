package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mq implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ pq o;

    public /* synthetic */ mq(pq pqVar, int i) {
        this.n = i;
        this.o = pqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        pq pqVar = this.o;
        switch (i) {
            case 0:
                kn2 kn2Var = pqVar.p;
                if (kn2Var != null) {
                    pqVar.f(kn2Var, false);
                }
                break;
            default:
                Handler handler = pqVar.q;
                mq mqVar = pqVar.r;
                handler.removeCallbacks(mqVar);
                pqVar.q.post(mqVar);
                break;
        }
    }
}
