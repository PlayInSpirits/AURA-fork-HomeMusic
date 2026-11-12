package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hz extends a70 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(hz.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public hz(cz czVar, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + czVar + " was cancelled normally");
        }
        super(th, z);
        this._resumed$volatile = 0;
    }
}
