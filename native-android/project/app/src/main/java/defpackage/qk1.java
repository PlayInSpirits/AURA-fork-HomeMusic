package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qk1 extends ba5 {
    @Override // defpackage.uo0
    public final void a(uo0 uo0Var) {
        yo0 yo0Var = this.h;
        if (yo0Var.c && !yo0Var.j) {
            yo0Var.d((int) ((((yo0) yo0Var.l.get(0)).g * ((pk1) this.b).p0) + 0.5f));
        }
    }

    @Override // defpackage.ba5
    public final void d() {
        jc0 jc0Var = this.b;
        pk1 pk1Var = (pk1) jc0Var;
        int i = pk1Var.q0;
        int i2 = pk1Var.r0;
        int i3 = pk1Var.t0;
        yo0 yo0Var = this.h;
        if (i3 == 1) {
            if (i != -1) {
                yo0Var.l.add(jc0Var.S.d.h);
                this.b.S.d.h.k.add(yo0Var);
                yo0Var.f = i;
            } else if (i2 != -1) {
                yo0Var.l.add(jc0Var.S.d.i);
                this.b.S.d.i.k.add(yo0Var);
                yo0Var.f = -i2;
            } else {
                yo0Var.b = true;
                yo0Var.l.add(jc0Var.S.d.i);
                this.b.S.d.i.k.add(yo0Var);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            yo0Var.l.add(jc0Var.S.e.h);
            this.b.S.e.h.k.add(yo0Var);
            yo0Var.f = i;
        } else if (i2 != -1) {
            yo0Var.l.add(jc0Var.S.e.i);
            this.b.S.e.i.k.add(yo0Var);
            yo0Var.f = -i2;
        } else {
            yo0Var.b = true;
            yo0Var.l.add(jc0Var.S.e.i);
            this.b.S.e.i.k.add(yo0Var);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // defpackage.ba5
    public final void e() {
        jc0 jc0Var = this.b;
        int i = ((pk1) jc0Var).t0;
        yo0 yo0Var = this.h;
        if (i == 1) {
            jc0Var.X = yo0Var.g;
        } else {
            jc0Var.Y = yo0Var.g;
        }
    }

    @Override // defpackage.ba5
    public final void f() {
        this.h.c();
    }

    @Override // defpackage.ba5
    public final boolean k() {
        return false;
    }

    public final void m(yo0 yo0Var) {
        yo0 yo0Var2 = this.h;
        yo0Var2.k.add(yo0Var);
        yo0Var.l.add(yo0Var2);
    }
}
