package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class ym implements Executor {
    public final /* synthetic */ int n;
    public final /* synthetic */ Handler o;

    public /* synthetic */ ym(Handler handler, int i) {
        this.n = i;
        this.o = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.n;
        this.o.post(runnable);
    }
}
