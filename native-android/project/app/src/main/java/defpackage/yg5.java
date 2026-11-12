package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yg5 {
    public static final ge2 a = null;

    static {
        a = new ge2("GoogleSignInCommon", new String[0]);
    }

    public static void a(Context r2) {
        zg5.E(r2).F();
        Set r3 = if5.b;
        monitor-enter(r3);
        monitor-exit(r3);     // Catch: Throwable -> L20
        Iterator r4 = r3.iterator();
        if (r4.hasNext() == true) goto L18;
        Object r0 = ij1.E;
        monitor-enter(r0);
        ij1 r5 = ij1.F;     // Catch: Throwable -> L12
        if (r5 == null) goto L14;
        r5.v.incrementAndGet();     // Catch: Throwable -> L12
        zw2 r6 = r5.A;     // Catch: Throwable -> L12
        r6.sendMessageAtFrontOfQueue(r6.obtainMessage(10));     // Catch: Throwable -> L12
    L14:
        monitor-exit(r0);     // Catch: Throwable -> L12
        return;
    L12:
        th = move-exception;
        throw th;
    L18:
        ((if5) r4.next()).getClass();
        throw new UnsupportedOperationException();
    L20:
        th = move-exception;
        throw th;
    }
}
