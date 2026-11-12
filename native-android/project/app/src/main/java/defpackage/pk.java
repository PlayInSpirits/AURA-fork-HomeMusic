package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pk {
    public static final ok h = null;
    public final hg3 a;
    public final rm3 b;
    public final ok c;
    public final CopyOnWriteArrayList d;
    public List e;
    public List f;
    public int g;

    static {
        h = new ok();
    }

    public pk(ni4 r4, hh3 r5) {
        hg3 r0 = new hg3(4, r4);
        Object r6 = j51.a;
        monitor-enter(r6);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (j51.b != null) goto L9;
        j51.b = Executors.newFixedThreadPool(2);     // Catch: Throwable -> L7
    L9:
        monitor-exit(r6);     // Catch: Throwable -> L7
        rm3 r1 = new rm3(j51.b, r5, false);
        this.d = new CopyOnWriteArrayList();
        this.f = Collections.EMPTY_LIST;
        this.a = r0;
        this.b = r1;
        this.c = h;
    }

    public final void a(Runnable r2) {
        Iterator r1 = this.d.iterator();
        if (r1.hasNext() == true) goto L8;
        if (r2 == null) goto L9;
        r2.run();
        return;
    L9:
        return;
    L8:
        throw xa3.d(r1);
    }

    public final void b(List r8, jq3 r9) {
        int r5 = this.g + 1;
        this.g = r5;
        List r3 = this.e;
        if (r8 != r3) goto L7;
        if (r9 == null) goto L16;
        r9.run();
        return;
    L16:
        return;
    L7:
        hg3 r1 = this.a;
        if (r8 != null) goto L11;
        int r10 = r3.size();
        this.e = null;
        this.f = Collections.EMPTY_LIST;
        r1.r(0, r10);
        a(r9);
        return;
    L11:
        if (r3 != null) goto L14;
        this.e = r8;
        this.f = Collections.unmodifiableList(r8);
        r1.k(0, r8.size());
        a(r9);
        return;
    L14:
        ((Executor) this.b.n).execute(new nk(this, r3, r8, r5, r9));
    }
}
