package defpackage;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dv3 {
    public final fz0 a;
    public final long b;
    public volatile Map c;
    public final fr4 d;
    public final gr0 e;
    public final ConcurrentLinkedQueue f;

    static {
        AtomicReferenceFieldUpdater.newUpdater(dv3.class, Map.class, "c");
    }

    public dv3(gr4 r1, TimeUnit r2, fz0 r3, ea0 r4) {
        this.a = r3;
        this.b = r2.toNanos(5);
        this.c = v01.n;
        this.d = r1.e();
        this.e = new gr0(this, b11.q(new StringBuilder(), ze5.c, " ConnectionPool connection closer"), 1);
        this.f = new ConcurrentLinkedQueue();
    }

    public final int a(cv3 r7, long r8) {
        tl1 r0 = ze5.a;
        ArrayList r1 = r7.s;
        int r2 = 0;
    L4:
        if (r2 >= r1.size()) goto L13;
        Reference r3 = (Reference) r1.get(r2);
        if (r3.get() != null) goto L7;
        String r4 = "A connection to " + r7.d.a.h + " was leaked. Did you forget to close a response body?";
        qg3 r5 = qg3.a;
        qg3.a.j(((zu3) r3).a, r4);
        r1.remove(r2);
        if (r1.isEmpty() == false) goto L4;
        r7.t = r8 - this.b;
        return 0;
    L7:
        r2 = r2 + 1;
        goto L4
    L13:
        return r1.size();
    }
}
