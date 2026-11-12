package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b52 implements kk1 {
    public final ArrayList a;

    public b52() {
        this.a = new ArrayList();
    }

    public synchronized w04 a(Class r5) {
        monitor-enter(this);
        int r0 = this.a.size();     // Catch: Throwable -> L10
        int r1 = 0;
    L4:
        if (r1 >= r0) goto L13;
        x04 r2 = (x04) this.a.get(r1);     // Catch: Throwable -> L10
        if (r2.a.isAssignableFrom(r5) == true) goto L7;
        r1 = r1 + 1;
        goto L4
    L7:
        w04 r6 = r2.b;     // Catch: Throwable -> L10
        monitor-exit(this);
        return r6;
    L13:
        monitor-exit(this);
        return null;
    L10:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.kk1
    public Object keyOf(Object r1) {
        return (String) r1;
    }

    @Override // defpackage.kk1
    public Iterator sourceIterator() {
        return this.a.iterator();
    }

    public b52(ArrayList r1) {
        this.a = r1;
    }
}
