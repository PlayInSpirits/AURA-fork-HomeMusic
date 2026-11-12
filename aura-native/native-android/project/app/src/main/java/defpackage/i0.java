package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {
    public static final i0 d = new i0();
    public final Runnable a;
    public final Executor b;
    public i0 c;

    public i0() {
        this.a = null;
        this.b = null;
    }

    public i0(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
