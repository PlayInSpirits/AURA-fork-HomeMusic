package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x65 {
    public final y65 a;

    public x65() {
        this.a = new y65();
    }

    public final void a() {
        y65 r0 = this.a;
        if (r0 != null) goto L5;
    L24:
        b();
        return;
    L5:
        if (r0.d == true) goto L24;
        r0.d = true;
        xi4 r1 = r0.a;
        monitor-enter(r1);
        Iterator r2 = r0.b.values().iterator();     // Catch: Throwable -> L13
    L11:
        if (r2.hasNext() == false) goto L15;
        y65.a((AutoCloseable) r2.next());     // Catch: Throwable -> L13
        goto L11
    L15:
        Iterator r3 = r0.c.iterator();     // Catch: Throwable -> L13
    L17:
        if (r3.hasNext() == false) goto L19;
        y65.a((AutoCloseable) r3.next());     // Catch: Throwable -> L13
        goto L17
    L19:
        r0.c.clear();     // Catch: Throwable -> L13
        monitor-exit(r1);
    L13:
        th = move-exception;
        throw th;
    }

    public void b() {
    }
}
