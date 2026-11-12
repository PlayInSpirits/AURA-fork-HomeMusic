package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bc0 extends wd0 {
    public /* synthetic */ Object n;
    public final /* synthetic */ ConstraintTrackingWorker o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc0(ConstraintTrackingWorker constraintTrackingWorker, wd0 wd0Var) {
        super(wd0Var);
        this.o = constraintTrackingWorker;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.e(this.o, null, null, null, this);
    }
}
