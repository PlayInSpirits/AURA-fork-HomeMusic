package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v21 {
    public static final om0 c = null;
    public static final LinkedHashMap d = null;
    public final ReentrantLock a;
    public final wo0 b;

    static {
        c = new om0(28);
        d = new LinkedHashMap();
    }

    public v21(String r4, boolean r5) {
        om0 r0 = c;
        monitor-enter(r0);
        LinkedHashMap r1 = d;     // Catch: Throwable -> L7
        Object r2 = r1.get(r4);     // Catch: Throwable -> L7
        if (r2 != null) goto L9;
        r2 = new ReentrantLock();     // Catch: Throwable -> L7
        r1.put(r4, r2);     // Catch: Throwable -> L7
    L9:
        ReentrantLock r3 = (ReentrantLock) r2;     // Catch: Throwable -> L7
        monitor-exit(r0);
        this.a = r3;
        if (r5 == false) goto L14;
        wo0 r6 = new wo0();
        r6.n = r4.concat(".lck");
    L15:
        this.b = r6;
        return;
    L14:
        r6 = null;
    L7:
        th = move-exception;
        throw th;
    }
}
