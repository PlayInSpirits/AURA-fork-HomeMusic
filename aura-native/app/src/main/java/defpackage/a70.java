package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class a70 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(a70.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;
    public final Throwable a;

    public a70(Throwable th, boolean z) {
        this.a = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.a + ']';
    }
}
