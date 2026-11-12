package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oy {
    public Object a;
    public ry b;
    public n04 c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        ry ryVar = this.b;
        if (ryVar != null) {
            qy qyVar = ryVar.o;
            qyVar.getClass();
            if (obj == null) {
                obj = g2.t;
            }
            if (g2.s.e(qyVar, null, obj)) {
                g2.b(qyVar);
                this.a = null;
                this.b = null;
                this.c = null;
            }
        }
    }

    public final void b(Throwable th) {
        this.d = true;
        ry ryVar = this.b;
        if (ryVar == null || !ryVar.o.i(th)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void finalize() {
        n04 n04Var;
        ry ryVar = this.b;
        if (ryVar != null) {
            qy qyVar = ryVar.o;
            if (!qyVar.isDone()) {
                qyVar.i(new g0(2, "The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a));
            }
        }
        if (this.d || (n04Var = this.c) == null) {
            return;
        }
        n04Var.j(null);
    }
}
