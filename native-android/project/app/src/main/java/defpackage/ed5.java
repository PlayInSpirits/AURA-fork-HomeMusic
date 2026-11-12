package defpackage;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ed5 implements Callable {
    public final /* synthetic */ w24 a;
    public final /* synthetic */ fd5 b;

    public ed5(fd5 r1, w24 r2) {
        this.b = r1;
        this.a = r2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Cursor r2 = xl.H(this.b.a, this.a);
    L9:
        th = move-exception;
        r2.close();
        throw th;
    L4:
        if (r2.moveToFirst() == false) goto L11;
        boolean r0 = false;
        if (r2.getInt(0) == 0) goto L8;
        r0 = true;
    L8:
        Boolean r1 = Boolean.valueOf(r0);     // Catch: Throwable -> L9
    L12:
        r2.close();
        return r1;
    L11:
        r1 = Boolean.FALSE;     // Catch: Throwable -> L9
        goto L12
    }

    public final void finalize() {
        this.a.j();
    }
}
