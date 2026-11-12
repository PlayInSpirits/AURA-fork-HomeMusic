package androidx.work;

import android.content.Context;
import defpackage.af0;
import defpackage.bf0;
import defpackage.bu;
import defpackage.gb;
import defpackage.h12;
import defpackage.ne0;
import defpackage.oc2;
import defpackage.ry;
import defpackage.t22;
import defpackage.ya4;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class CoroutineWorker extends oc2 {
    public final WorkerParameters e;
    public final af0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.e = workerParameters;
        this.f = af0.p;
    }

    @Override // defpackage.oc2
    public final ry a() {
        t22 t22VarA = gb.a();
        af0 af0Var = this.f;
        af0Var.getClass();
        return bu.r(ya4.F(af0Var, t22VarA), new bf0(this, null, 0));
    }

    @Override // defpackage.oc2
    public final ry c() {
        af0 af0Var = af0.p;
        ne0 ne0Var = this.f;
        if (h12.c(ne0Var, af0Var)) {
            ne0Var = this.e.d;
        }
        ne0Var.getClass();
        return bu.r(ne0Var.J(gb.a()), new bf0(this, null, 1));
    }

    public abstract Object d(bf0 bf0Var);
}
