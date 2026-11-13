package defpackage;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class cf5 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ BasePendingResult b;
    public final /* synthetic */ Object c;

    public cf5(xc5 xc5Var, BasePendingResult basePendingResult) {
        this.c = xc5Var;
        this.b = basePendingResult;
    }

    public final void a(Status status) {
        t14 t14Var;
        switch (this.a) {
            case 0:
                ((Map) ((xc5) this.c).o).remove(this.b);
                return;
            default:
                if (status.n > 0) {
                    ((cr4) this.c).a(status.p != null ? new ResolvableApiException(status) : new ApiException(status));
                    return;
                }
                BasePendingResult basePendingResult = this.b;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                ji2.o("Result has already been consumed.", !basePendingResult.g);
                try {
                    if (!basePendingResult.b.await(0L, timeUnit)) {
                        basePendingResult.c(Status.u);
                    }
                } catch (InterruptedException unused) {
                    basePendingResult.c(Status.s);
                }
                ji2.o("Result is not ready.", basePendingResult.d());
                synchronized (basePendingResult.a) {
                    ji2.o("Result has already been consumed.", !basePendingResult.g);
                    ji2.o("Result is not ready.", basePendingResult.d());
                    t14Var = basePendingResult.e;
                    basePendingResult.e = null;
                    basePendingResult.g = true;
                }
                if (basePendingResult.d.getAndSet(null) != null) {
                    kf2.k();
                    return;
                } else {
                    ji2.m(t14Var);
                    ((cr4) this.c).b(null);
                    return;
                }
        }
    }

    public cf5(BasePendingResult basePendingResult, cr4 cr4Var, z45 z45Var) {
        this.b = basePendingResult;
        this.c = cr4Var;
    }
}
