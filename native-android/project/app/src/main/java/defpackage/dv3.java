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
    public final fr4 d;
    public volatile Map c = v01.n;
    public final gr0 e = new gr0(this, b11.q(new StringBuilder(), ze5.c, " ConnectionPool connection closer"), 1);
    public final ConcurrentLinkedQueue f = new ConcurrentLinkedQueue();

    static {
        AtomicReferenceFieldUpdater.newUpdater(dv3.class, Map.class, "c");
    }

    public dv3(gr4 gr4Var, TimeUnit timeUnit, fz0 fz0Var, ea0 ea0Var) {
        this.a = fz0Var;
        this.b = timeUnit.toNanos(5L);
        this.d = gr4Var.e();
    }

    public final int a(cv3 cv3Var, long j) {
        tl1 tl1Var = ze5.a;
        ArrayList arrayList = cv3Var.s;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + cv3Var.d.a.h + " was leaked. Did you forget to close a response body?";
                qg3 qg3Var = qg3.a;
                qg3.a.j(((zu3) reference).a, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    cv3Var.t = j - this.b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
