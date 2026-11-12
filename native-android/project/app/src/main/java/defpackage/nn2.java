package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nn2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ lb4 o;
    public final /* synthetic */ uj2 p;

    public /* synthetic */ nn2(lb4 r1, uj2 r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        uj2 r4 = this.p;
        lb4 r5 = this.o;
        switch(r0) {
            case 0: goto L26;
            default: goto L28;
        };
    L26:
        r4.f((ij2) r5.get());     // Catch: InterruptedException -> L19 ExecutionException -> L21 Throwable -> L23
        return;
    L23:
        e = move-exception;
        l93.r0("MLSLegacyStub", "Library operation failed", e);
        r4.f(null);
        return;
    L28:
        List r6 = (List) r5.get();     // Catch: InterruptedException -> L10 Throwable -> L12 CancellationException -> L14
        if (r6 != null) goto L7;
        ArrayList r7 = null;
    L8:
        r4.f(r7);     // Catch: InterruptedException -> L10 Throwable -> L12 CancellationException -> L14
        return;
    L7:
        r7 = ju2.g(r6);     // Catch: InterruptedException -> L10 Throwable -> L12 CancellationException -> L14
    L12:
        e = move-exception;
        l93.r0("MLSLegacyStub", "Library operation failed", e);
        r4.f(null);
    }
}
