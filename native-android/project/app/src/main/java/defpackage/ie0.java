package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ie0 implements Iterable {
    public final Object n;
    public final HashMap o;
    public Set p;
    public List q;

    public ie0() {
        this.n = new Object();
        this.o = new HashMap();
        this.p = Collections.EMPTY_SET;
        this.q = Collections.EMPTY_LIST;
    }

    public final int a(sw0 r3) {
        Object r0 = this.n;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.o.containsKey(r3) == false) goto L9;
        int r2 = ((Integer) this.o.get(r3)).intValue();     // Catch: Throwable -> L7
    L10:
        monitor-exit(r0);     // Catch: Throwable -> L7
        return r2;
    L9:
        r2 = 0;
        goto L10
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Object r0 = this.n;
        monitor-enter(r0);
        Iterator r1 = this.q.iterator();     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }
}
