package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class go implements k51 {
    public final /* synthetic */ int a;
    public final be3 b;
    public final df4 c;

    public go(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new be3(4);
                this.c = new df4("image/webp", -1, -1);
                break;
            default:
                this.b = new be3(4);
                this.c = new df4("image/avif", -1, -1);
                break;
        }
    }

    @Override // defpackage.k51
    public final void a() {
        int i = this.a;
    }

    @Override // defpackage.k51
    public final int b(l51 l51Var, t71 t71Var) {
        switch (this.a) {
        }
        return this.c.b(l51Var, t71Var);
    }

    @Override // defpackage.k51
    public final boolean c(l51 l51Var) {
        int i = this.a;
        be3 be3Var = this.b;
        switch (i) {
            case 0:
                rk0 rk0Var = (rk0) l51Var;
                rk0Var.o(4, false);
                be3Var.K(4);
                rk0Var.e(be3Var.a, 0, 4, false);
                if (be3Var.C() == 1718909296) {
                    be3Var.K(4);
                    rk0Var.e(be3Var.a, 0, 4, false);
                    if (be3Var.C() == 1635150182) {
                    }
                }
                break;
            default:
                be3Var.K(4);
                rk0 rk0Var2 = (rk0) l51Var;
                rk0Var2.e(be3Var.a, 0, 4, false);
                if (be3Var.C() == 1380533830) {
                    rk0Var2.o(4, false);
                    be3Var.K(4);
                    rk0Var2.e(be3Var.a, 0, 4, false);
                    if (be3Var.C() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // defpackage.k51
    public final void d(long j, long j2) {
        switch (this.a) {
            case 0:
                this.c.d(j, j2);
                break;
            default:
                this.c.d(j, j2);
                break;
        }
    }

    @Override // defpackage.k51
    public final void f(m51 m51Var) {
        int i = this.a;
        df4 df4Var = this.c;
        switch (i) {
            case 0:
                df4Var.f(m51Var);
                break;
            default:
                df4Var.f(m51Var);
                break;
        }
    }

    private final void g() {
    }

    private final void h() {
    }
}
