package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ht4 implements le0 {
    public final Object n;
    public final ThreadLocal o;
    public final jt4 p;

    public ht4(go3 go3Var, ThreadLocal threadLocal) {
        this.n = go3Var;
        this.o = threadLocal;
        this.p = new jt4(threadLocal);
    }

    @Override // defpackage.ne0
    public final ne0 J(ne0 ne0Var) {
        return ya4.F(this, ne0Var);
    }

    @Override // defpackage.ne0
    public final le0 K(me0 me0Var) {
        if (this.p.equals(me0Var)) {
            return this;
        }
        return null;
    }

    public final void a(Object obj) {
        this.o.set(obj);
    }

    public final Object c() {
        ThreadLocal threadLocal = this.o;
        Object obj = threadLocal.get();
        threadLocal.set(this.n);
        return obj;
    }

    @Override // defpackage.le0
    public final me0 getKey() {
        return this.p;
    }

    @Override // defpackage.ne0
    public final Object s(wf1 wf1Var, Object obj) {
        return wf1Var.invoke(obj, this);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.n + ", threadLocal = " + this.o + ')';
    }

    @Override // defpackage.ne0
    public final ne0 u(me0 me0Var) {
        return this.p.equals(me0Var) ? q01.n : this;
    }
}
