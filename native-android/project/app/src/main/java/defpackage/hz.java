package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hz extends a70 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = null;
    private volatile /* synthetic */ int _resumed$volatile;

    static {
        c = AtomicIntegerFieldUpdater.newUpdater(hz.class, "_resumed$volatile");
    }

    public hz(cz r3, Throwable r4, boolean r5) {
        if (r4 != null) goto L4;
        r4 = new CancellationException("Continuation " + r3 + " was cancelled normally");
    L4:
        super(r4, r5);
        this._resumed$volatile = 0;
    }
}
