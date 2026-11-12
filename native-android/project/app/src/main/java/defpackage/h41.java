package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h41 implements Executor {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ h41(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r3) {
        int r0 = this.n;
        Object r2 = this.o;
        switch(r0) {
            case 0: goto L13;
            case 1: goto L11;
            case 2: goto L9;
            default: goto L4;
        };
    L4:
        yp4 r4 = ((qe4) r2).e;
        if (r4.a.getLooper() != Looper.myLooper()) goto L7;
        r3.run();
        return;
    L7:
        r4.d(r3);
        return;
    L9:
        f35.W(((lo2) r2).q, r3);
        return;
    L11:
        f35.W(((bl2) r2).u, r3);
        return;
    L13:
        ((yp4) r2).d(r3);
    }
}
