package defpackage;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dd implements Choreographer.FrameCallback {
    public final /* synthetic */ cz n;
    public final /* synthetic */ if1 o;

    public dd(cz czVar, ed edVar, if1 if1Var) {
        this.n = czVar;
        this.o = if1Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object s14Var;
        try {
            s14Var = this.o.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            s14Var = new s14(th);
        }
        this.n.resumeWith(s14Var);
    }
}
