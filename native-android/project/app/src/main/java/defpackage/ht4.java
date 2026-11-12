package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ht4 implements le0 {
    public final Object n;
    public final ThreadLocal o;
    public final jt4 p;

    public ht4(go3 r1, ThreadLocal r2) {
        this.n = r1;
        this.o = r2;
        this.p = new jt4(r2);
    }

    @Override // defpackage.ne0
    public final ne0 J(ne0 r1) {
        return ya4.F(this, r1);
    }

    @Override // defpackage.ne0
    public final le0 K(me0 r2) {
        if (this.p.equals(r2) == false) goto L5;
        return this;
    L5:
        return null;
    }

    public final void a(Object r1) {
        this.o.set(r1);
    }

    public final Object c() {
        ThreadLocal r0 = this.o;
        Object r1 = r0.get();
        r0.set(this.n);
        return r1;
    }

    @Override // defpackage.le0
    public final me0 getKey() {
        return this.p;
    }

    @Override // defpackage.ne0
    public final Object s(wf1 r1, Object r2) {
        return r1.invoke(r2, this);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.n + ", threadLocal = " + this.o + ')';
    }

    @Override // defpackage.ne0
    public final ne0 u(me0 r2) {
        if (this.p.equals(r2) == true) goto L5;
        return this;
    L5:
        return q01.n;
    }
}
