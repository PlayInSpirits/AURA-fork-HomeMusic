package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v53 {
    public static v53 f;
    public final Executor a;
    public final CopyOnWriteArrayList b;
    public final Object c;
    public int d;
    public boolean e;

    public v53(Context r4) {
        Executor r0 = uo.t();
        this.a = r0;
        this.b = new CopyOnWriteArrayList();
        this.c = new Object();
        this.d = 0;
        r0.execute(new ur2(6, this, r4));
    }

    public static synchronized v53 a(Context r2) {
        monitor-enter(v53.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (f != null) goto L9;
        f = new v53(r2);     // Catch: Throwable -> L7
    L9:
        v53 r3 = f;     // Catch: Throwable -> L7
        monitor-exit(v53.class);
        return r3;
    }

    public final int b() {
        Object r0 = this.c;
        monitor-enter(r0);
        int r1 = this.d;     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public final void c(int r5) {
        CopyOnWriteArrayList r0 = this.b;
        Iterator r1 = r0.iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        u53 r2 = (u53) r1.next();
        if (r2.a.get() != null) goto L4;
        r0.remove(r2);
        goto L4
    L8:
        Object r3 = this.c;
        monitor-enter(r3);
    L16:
        th = move-exception;
        throw th;
    L11:
        if (this.e == true) goto L13;
    L18:
        this.e = true;     // Catch: Throwable -> L16
        this.d = r5;     // Catch: Throwable -> L16
        Iterator r4 = this.b.iterator();     // Catch: Throwable -> L16
        monitor-exit(r3);     // Catch: Throwable -> L16
    L21:
        if (r4.hasNext() == false) goto L23;
        u53 r6 = (u53) r4.next();
        r6.b.execute(new qa1(24, r6));
        goto L21
    L23:
        return;
    L13:
        if (this.d != r5) goto L18;
        monitor-exit(r3);     // Catch: Throwable -> L16
    }
}
