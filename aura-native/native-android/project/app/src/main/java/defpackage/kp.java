package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kp implements ci0 {
    public final boolean n;
    public final ArrayList o = new ArrayList(1);
    public int p;
    public ii0 q;

    public kp(boolean z) {
        this.n = z;
    }

    @Override // defpackage.ci0
    public final void c(rw4 rw4Var) {
        rw4Var.getClass();
        ArrayList arrayList = this.o;
        if (arrayList.contains(rw4Var)) {
            return;
        }
        arrayList.add(rw4Var);
        this.p++;
    }

    public final void o(int i) {
        ii0 ii0Var = this.q;
        String str = f35.a;
        for (int i2 = 0; i2 < this.p; i2++) {
            ((rw4) this.o.get(i2)).a(this, ii0Var, this.n, i);
        }
    }

    public final void p() {
        ii0 ii0Var = this.q;
        String str = f35.a;
        for (int i = 0; i < this.p; i++) {
            ((rw4) this.o.get(i)).c(this, ii0Var, this.n);
        }
        this.q = null;
    }

    public final void q(ii0 ii0Var) {
        for (int i = 0; i < this.p; i++) {
            ((rw4) this.o.get(i)).d(this, ii0Var);
        }
    }

    public final void r(ii0 ii0Var) {
        this.q = ii0Var;
        for (int i = 0; i < this.p; i++) {
            ((rw4) this.o.get(i)).b(this, ii0Var, this.n);
        }
    }
}
