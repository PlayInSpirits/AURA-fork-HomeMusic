package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xb0 {
    public final bq4 a;
    public final Context b;
    public final Object c;
    public final LinkedHashSet d;
    public Object e;

    public xb0(bq4 r1, Context r2) {
        this.a = r1;
        Context r3 = r2.getApplicationContext();
        r3.getClass();
        this.b = r3;
        this.c = new Object();
        this.d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(Object r5) {
        Object r0 = this.c;
        monitor-enter(r0);
        Object r1 = this.e;     // Catch: Throwable -> L10
        if (r1 != null) goto L7;
    L12:
        this.e = r5;     // Catch: Throwable -> L10
        List r6 = q40.Q0(this.d);     // Catch: Throwable -> L10
        ((vc5) this.a.q).execute(new k6(16, r6, this));     // Catch: Throwable -> L10
        monitor-exit(r0);
        return;
    L7:
        if (r1.equals(r5) == false) goto L12;
        monitor-exit(r0);
        return;
    L10:
        th = move-exception;
        throw th;
    }

    public abstract void c();

    public abstract void d();
}
