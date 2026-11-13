package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class x65 {
    public final y65 a = new y65();

    public final void a() {
        y65 y65Var = this.a;
        if (y65Var != null && !y65Var.d) {
            y65Var.d = true;
            synchronized (y65Var.a) {
                try {
                    Iterator it = y65Var.b.values().iterator();
                    while (it.hasNext()) {
                        y65.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = y65Var.c.iterator();
                    while (it2.hasNext()) {
                        y65.a((AutoCloseable) it2.next());
                    }
                    y65Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        b();
    }

    public void b() {
    }
}
