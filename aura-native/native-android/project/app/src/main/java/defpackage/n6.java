package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n6 extends n0 {
    public static final ya4 w;
    public static final y82 x = new y82(n6.class);
    public volatile Set u;
    public volatile int v;

    static {
        Throwable th;
        ya4 m6Var;
        try {
            m6Var = new l6(AtomicReferenceFieldUpdater.newUpdater(n6.class, Set.class, "u"), AtomicIntegerFieldUpdater.newUpdater(n6.class, "v"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            m6Var = new m6();
        }
        w = m6Var;
        if (th != null) {
            x.a().log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
