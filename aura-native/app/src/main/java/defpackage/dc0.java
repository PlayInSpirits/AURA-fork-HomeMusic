package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class dc0 extends wd0 {
    public ConstraintTrackingWorker n;
    public oc2 o;
    public /* synthetic */ Object p;
    public final /* synthetic */ ConstraintTrackingWorker q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc0(ConstraintTrackingWorker constraintTrackingWorker, wd0 wd0Var) {
        super(wd0Var);
        this.q = constraintTrackingWorker;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.f(this.q, this);
    }
}
