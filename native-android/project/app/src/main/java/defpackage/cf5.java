package defpackage;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cf5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BasePendingResult b;
    public final /* synthetic */ Object c;

    public cf5(xc5 r2, BasePendingResult r3) {
        this.a = 0;
        this.c = r2;
        this.b = r3;
    }

    public final void a(Status r6) {
        switch(this.a) {
            case 0: goto L29;
            default: goto L5;
        };
    L29:
        ((Map) ((xc5) this.c).o).remove(this.b);
        return;
    L5:
        if (r6.n > 0) goto L23;
        BasePendingResult r7 = this.b;
        TimeUnit r0 = TimeUnit.MILLISECONDS;
        ji2.o("Result has already been consumed.", !r7.g);
    L11:
        r7.c(Status.s);
    L12:
        ji2.o("Result is not ready.", r7.d());
        Object r1 = r7.a;
        monitor-enter(r1);
        ji2.o("Result has already been consumed.", !r7.g);     // Catch: Throwable -> L20
        ji2.o("Result is not ready.", r7.d());     // Catch: Throwable -> L20
        t14 r2 = r7.e;     // Catch: Throwable -> L20
        r7.e = null;     // Catch: Throwable -> L20
        r7.g = true;     // Catch: Throwable -> L20
        monitor-exit(r1);     // Catch: Throwable -> L20
        if (r7.d.getAndSet(null) != null) goto L19;
        ji2.m(r2);
        ((cr4) this.c).b(null);
        return;
    L19:
        kf2.k();
        return;
    L20:
        th = move-exception;
        throw th;
    L8:
        if (r7.b.await(0, r0) == true) goto L12;
        r7.c(Status.u);     // Catch: InterruptedException -> L11
        goto L12
    L23:
        cr4 r5 = (cr4) this.c;
        if (r6.p == null) goto L26;
        ApiException r3 = new ResolvableApiException(r6);
    L27:
        r5.a(r3);
        return;
    L26:
        r3 = new ApiException(r6);
        goto L27
    }

    public cf5(BasePendingResult r1, cr4 r2, z45 r3) {
        this.a = 1;
        this.b = r1;
        this.c = r2;
    }
}
