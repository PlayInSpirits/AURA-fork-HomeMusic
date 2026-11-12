package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class a70 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = null;
    private volatile /* synthetic */ int _handled$volatile;
    public final Throwable a;

    static {
        b = AtomicIntegerFieldUpdater.newUpdater(a70.class, "_handled$volatile");
    }

    public a70(Throwable r1, boolean r2) {
        this.a = r1;
        this._handled$volatile = r2 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.a + ']';
    }
}
