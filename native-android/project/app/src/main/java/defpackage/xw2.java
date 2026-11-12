package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xw2 extends FutureTask {
    public final /* synthetic */ qk n;

    public xw2(qk r1, zq0 r2) {
        this.n = r1;
        super(r2);
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        qk r1 = this.n;
        AtomicBoolean r2 = r1.r;
        Object r4 = get();     // Catch: Throwable -> L7 CancellationException -> L10 ExecutionException -> L13 InterruptedException -> L16
        if (r2.get() == true) goto L21;
        r1.a(r4);     // Catch: Throwable -> L7 CancellationException -> L10 ExecutionException -> L13 InterruptedException -> L16
        return;
        goto L11
    L21:
        return;
    L16:
        e = move-exception;
        Log.w("AsyncTask", e);
        return;
    L13:
        e = move-exception;
        nz2.s("An error occurred while executing doInBackground()", e.getCause());
        return;
    L7:
        th = move-exception;
        nz2.s("An error occurred while executing doInBackground()", th);
        return;
    L11:
        if (r2.get() == true) goto L22;
        r1.a(null);
        return;
    }
}
