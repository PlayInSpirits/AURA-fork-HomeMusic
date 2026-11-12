package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u12 extends u22 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater v = AtomicIntegerFieldUpdater.newUpdater(u12.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final q u;

    public u12(q qVar) {
        this.u = qVar;
    }

    @Override // defpackage.u22
    public final boolean r() {
        return true;
    }

    @Override // defpackage.u22
    public final void s(Throwable th) {
        if (v.compareAndSet(this, 0, 1)) {
            this.u.invoke(th);
        }
    }
}
