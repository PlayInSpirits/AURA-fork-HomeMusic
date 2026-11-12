package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bc0 extends wd0 {
    public /* synthetic */ Object n;
    public final /* synthetic */ ConstraintTrackingWorker o;
    public int p;

    public bc0(ConstraintTrackingWorker r1, wd0 r2) {
        this.o = r1;
        super(r2);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r2) {
        this.n = r2;
        this.p |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.e(this.o, null, null, null, this);
    }
}
