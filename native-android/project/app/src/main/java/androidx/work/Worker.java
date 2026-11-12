package androidx.work;

import android.content.Context;
import defpackage.bt2;
import defpackage.gq1;
import defpackage.nc2;
import defpackage.oc2;
import defpackage.ry;
import defpackage.vr1;
import defpackage.zf0;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends oc2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // defpackage.oc2
    public final ry a() {
        ExecutorService executorService = this.b.c;
        executorService.getClass();
        return vr1.v(new bt2(executorService, new gq1(this)));
    }

    @Override // defpackage.oc2
    public final ry c() {
        ExecutorService executorService = this.b.c;
        executorService.getClass();
        return vr1.v(new bt2(executorService, new zf0(9, this)));
    }

    public abstract nc2 d();
}
