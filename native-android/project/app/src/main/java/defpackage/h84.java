package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h84 implements ty4 {
    public final g84 a;
    public final be3 b = new be3(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public h84(g84 g84Var) {
        this.a = g84Var;
    }

    @Override // defpackage.ty4
    public final void a(int i, be3 be3Var) {
        int iA;
        boolean z = (i & 1) != 0;
        if (z) {
            iA = be3Var.b + be3Var.A();
        } else {
            iA = -1;
        }
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            be3Var.N(iA);
            this.d = 0;
        }
        while (be3Var.a() > 0) {
            int i2 = this.d;
            be3 be3Var2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iA2 = be3Var.A();
                    be3Var.N(be3Var.b - 1);
                    if (iA2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(be3Var.a(), 3 - this.d);
                be3Var.k(be3Var2.a, this.d, iMin);
                int i3 = this.d + iMin;
                this.d = i3;
                if (i3 == 3) {
                    be3Var2.N(0);
                    be3Var2.M(3);
                    be3Var2.O(1);
                    int iA3 = be3Var2.A();
                    int iA4 = be3Var2.A();
                    this.e = (iA3 & 128) != 0;
                    int i4 = (((iA3 & 15) << 8) | iA4) + 3;
                    this.c = i4;
                    byte[] bArr = be3Var2.a;
                    if (bArr.length < i4) {
                        be3Var2.c(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(be3Var.a(), this.c - this.d);
                be3Var.k(be3Var2.a, this.d, iMin2);
                int i5 = this.d + iMin2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        be3Var2.M(i6);
                    } else {
                        if (f35.o(0, i6, -1, be3Var2.a) != 0) {
                            this.f = true;
                            return;
                        }
                        be3Var2.M(this.c - 4);
                    }
                    be3Var2.N(0);
                    this.a.a(be3Var2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.ty4
    public final void b(iu4 iu4Var, m51 m51Var, sy4 sy4Var) {
        this.a.b(iu4Var, m51Var, sy4Var);
        this.f = true;
    }

    @Override // defpackage.ty4
    public final void c() {
        this.f = true;
    }
}
