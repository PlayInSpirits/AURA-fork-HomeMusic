package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qr implements fc2 {
    public final fc2 n;
    public int o = 0;
    public int p = -1;
    public int q = -1;
    public Object r = null;

    public qr(fc2 fc2Var) {
        this.n = fc2Var;
    }

    @Override // defpackage.fc2
    public final void a(int i, int i2) {
        b();
        this.n.a(i, i2);
    }

    public final void b() {
        int i = this.o;
        if (i == 0) {
            return;
        }
        fc2 fc2Var = this.n;
        if (i == 1) {
            fc2Var.k(this.p, this.q);
        } else if (i == 2) {
            fc2Var.r(this.p, this.q);
        } else if (i == 3) {
            fc2Var.y(this.p, this.q, this.r);
        }
        this.r = null;
        this.o = 0;
    }

    @Override // defpackage.fc2
    public final void k(int i, int i2) {
        int i3;
        if (this.o == 1 && i >= (i3 = this.p)) {
            int i4 = this.q;
            if (i <= i3 + i4) {
                this.q = i4 + i2;
                this.p = Math.min(i, i3);
                return;
            }
        }
        b();
        this.p = i;
        this.q = i2;
        this.o = 1;
    }

    @Override // defpackage.fc2
    public final void r(int i, int i2) {
        int i3;
        if (this.o == 2 && (i3 = this.p) >= i && i3 <= i + i2) {
            this.q += i2;
            this.p = i;
        } else {
            b();
            this.p = i;
            this.q = i2;
            this.o = 2;
        }
    }

    @Override // defpackage.fc2
    public final void y(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        if (this.o == 3 && i <= (i4 = this.q + (i3 = this.p)) && (i5 = i + i2) >= i3 && this.r == obj) {
            this.p = Math.min(i, i3);
            this.q = Math.max(i4, i5) - this.p;
            return;
        }
        b();
        this.p = i;
        this.q = i2;
        this.r = obj;
        this.o = 3;
    }
}
