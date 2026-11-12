package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n6 extends n0 {
    public static final ya4 w = null;
    public static final y82 x = null;
    public volatile Set u;
    public volatile int v;

    static {
        x = new y82(n6.class);
        ya4 r0 = new l6(AtomicReferenceFieldUpdater.newUpdater(n6.class, Set.class, "u"), AtomicIntegerFieldUpdater.newUpdater(n6.class, "v"));     // Catch: Throwable -> L5
        Throwable r1 = null;
    L7:
        w = r0;
        if (r1 == null) goto L13;
        x.a().log(Level.SEVERE, "SafeAtomicHelper is broken!", r1);
        return;
    L13:
        return;
    L5:
        th = move-exception;
        r1 = th;
        r0 = new m6();
        goto L7
    }
}
