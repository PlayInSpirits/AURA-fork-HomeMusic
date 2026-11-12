package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oy4 extends e12 {
    public final Callable p;
    public final /* synthetic */ py4 q;

    public oy4(py4 py4Var, Callable callable) {
        this.q = py4Var;
        callable.getClass();
        this.p = callable;
    }

    @Override // defpackage.e12
    public final void a(Throwable th) {
        this.q.m(th);
    }

    @Override // defpackage.e12
    public final void b(Object obj) {
        this.q.l(obj);
    }

    @Override // defpackage.e12
    public final boolean d() {
        return this.q.isDone();
    }

    @Override // defpackage.e12
    public final Object e() {
        return this.p.call();
    }

    @Override // defpackage.e12
    public final String f() {
        return this.p.toString();
    }
}
