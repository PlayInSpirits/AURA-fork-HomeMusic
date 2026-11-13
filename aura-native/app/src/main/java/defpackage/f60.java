package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class f60 extends e12 {
    public final gq0 p = gq0.n;
    public final /* synthetic */ g60 q;
    public final zq0 r;
    public final /* synthetic */ g60 s;

    public f60(g60 g60Var, zq0 zq0Var) {
        this.s = g60Var;
        this.q = g60Var;
        this.r = zq0Var;
    }

    @Override // defpackage.e12
    public final void a(Throwable th) {
        g60 g60Var = this.q;
        g60Var.z = null;
        if (th instanceof ExecutionException) {
            g60Var.m(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            g60Var.cancel(false);
        } else {
            g60Var.m(th);
        }
    }

    @Override // defpackage.e12
    public final void b(Object obj) {
        this.q.z = null;
        this.s.l(obj);
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
