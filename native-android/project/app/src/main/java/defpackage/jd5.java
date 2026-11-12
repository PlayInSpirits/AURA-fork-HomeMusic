package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jd5 {
    public static final String e = null;
    public final hg3 a;
    public final HashMap b;
    public final HashMap c;
    public final Object d;

    static {
        e = cx.i("WorkTimer");
    }

    public jd5(hg3 r2) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new Object();
        this.a = r2;
    }

    public final void a(rc5 r6) {
        Object r1 = this.d;
        monitor-enter(r1);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (((id5) this.b.remove(r6)) == null) goto L9;
        cx.f().b(e, "Stopping timer for " + r6);     // Catch: Throwable -> L7
        this.c.remove(r6);     // Catch: Throwable -> L7
    L9:
        monitor-exit(r1);     // Catch: Throwable -> L7
    }
}
