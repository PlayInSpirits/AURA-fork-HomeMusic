package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vc5 implements Executor {
    public final /* synthetic */ int n;
    public final Object o;

    public vc5() {
        this.n = 1;
        zw2 r0 = new zw2(Looper.getMainLooper(), 3, false);
        Looper.getMainLooper();
        this.o = r0;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r2) {
        int r0 = this.n;
        Object r1 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((zw2) r1).post(r2);
        return;
    L6:
        ((Handler) ((bq4) r1).p).post(r2);
    }

    public vc5(bq4 r2) {
        this.n = 0;
        this.o = r2;
    }
}
