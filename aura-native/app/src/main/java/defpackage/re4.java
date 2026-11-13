package defpackage;

import android.os.ConditionVariable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class re4 extends Thread {
    public final /* synthetic */ ConditionVariable n;
    public final /* synthetic */ se4 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re4(se4 se4Var, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.o = se4Var;
        this.n = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.o) {
            this.n.open();
            se4.a(this.o);
            this.o.b.getClass();
        }
    }
}
