package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hw2 implements AutoCloseable {
    public final gn2 n;
    public final dm0 o;
    public final Object p = new Object();
    public final ArrayList q = new ArrayList();
    public lb4 r;
    public fw2 s;
    public boolean t;

    public hw2(gn2 gn2Var, dm0 dm0Var) {
        this.n = gn2Var;
        this.o = dm0Var;
    }

    public final void b() {
        if (this.r == null) {
            this.r = new lb4();
            fw2 fw2Var = new fw2(this.o, this.n, new bw2(this), new bw2(this));
            this.s = fw2Var;
            gw2 gw2Var = fw2.g;
            synchronized (gw2Var) {
                gw2Var.a.addLast(fw2Var);
                gw2Var.a();
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.p) {
            try {
                if (this.t) {
                    return;
                }
                this.t = true;
                ArrayList arrayList = this.q;
                vw1 vw1Var = yw1.o;
                arrayList.getClass();
                new g60(yw1.k(arrayList), new zq0(1, new qa1(22, this)));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
