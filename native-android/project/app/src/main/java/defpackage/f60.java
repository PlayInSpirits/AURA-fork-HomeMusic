package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f60 extends e12 {
    public final gq0 p;
    public final /* synthetic */ g60 q;
    public final zq0 r;
    public final /* synthetic */ g60 s;

    public f60(g60 r1, zq0 r2) {
        this.s = r1;
        this.q = r1;
        this.p = gq0.n;
        this.r = r2;
    }

    @Override // defpackage.e12
    public final void a(Throwable r2) {
        g60 r1 = this.q;
        r1.z = null;
        if ((r2 instanceof ExecutionException) == false) goto L7;
        r1.m(((ExecutionException) r2).getCause());
        return;
    L7:
        if ((r2 instanceof CancellationException) == false) goto L10;
        r1.cancel(false);
        return;
    L10:
        r1.m(r2);
    }

    @Override // defpackage.e12
    public final void b(Object r3) {
        this.q.z = null;
        this.s.l(r3);
    }

    @Override // defpackage.e12
    public final boolean d() {
        return this.q.isDone();
    }

    @Override // defpackage.e12
    public final Object e() {
        this.r.call();
        return null;
    }

    @Override // defpackage.e12
    public final String f() {
        return this.r.toString();
    }
}
