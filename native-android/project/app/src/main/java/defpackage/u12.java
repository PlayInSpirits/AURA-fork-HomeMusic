package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u12 extends u22 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater v = null;
    private volatile /* synthetic */ int _invoked$volatile;
    public final q u;

    static {
        v = AtomicIntegerFieldUpdater.newUpdater(u12.class, "_invoked$volatile");
    }

    public u12(q r1) {
        this.u = r1;
        this._invoked$volatile = 0;
    }

    @Override // defpackage.u22
    public final boolean r() {
        return true;
    }

    @Override // defpackage.u22
    public final void s(Throwable r4) {
        if (v.compareAndSet(this, 0, 1) == false) goto L6;
        this.u.invoke(r4);
        return;
    }
}
