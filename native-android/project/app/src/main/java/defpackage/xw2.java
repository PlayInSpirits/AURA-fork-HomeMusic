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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw2(qk qkVar, zq0 zq0Var) {
        super(zq0Var);
        this.n = qkVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        qk qkVar = this.n;
        AtomicBoolean atomicBoolean = qkVar.r;
        try {
            Object obj = get();
            if (atomicBoolean.get()) {
                return;
            }
            qkVar.a(obj);
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (CancellationException unused) {
            if (atomicBoolean.get()) {
                return;
            }
            qkVar.a(null);
        } catch (ExecutionException e2) {
            nz2.s("An error occurred while executing doInBackground()", e2.getCause());
        } catch (Throwable th) {
            nz2.s("An error occurred while executing doInBackground()", th);
        }
    }
}
