package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rn2 implements Executor {
    public final /* synthetic */ int n;
    public final /* synthetic */ tn2 o;

    public /* synthetic */ rn2(tn2 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r2) {
        int r0 = this.n;
        tn2 r1 = this.o;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        f35.W(r1.l, r2);
        return;
    L6:
        f35.W(r1.l, r2);
        return;
    L8:
        tn2.b(r1, r2);
    }
}
