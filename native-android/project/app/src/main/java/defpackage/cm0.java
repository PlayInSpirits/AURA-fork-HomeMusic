package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cm0 implements k51 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public cm0(int i) {
        if ((i & 1) != 0) {
            this.b = new df4("image/jpeg", 65496, 2);
        } else {
            this.b = new d32();
        }
    }

    private final void g() {
    }

    private final void h(long j, long j2) {
    }

    @Override // defpackage.k51
    public final void a() {
        switch (this.a) {
            case 0:
                break;
            default:
                ((k51) this.b).a();
                break;
        }
    }

    @Override // defpackage.k51
    public final int b(l51 l51Var, t71 t71Var) {
        switch (this.a) {
            case 0:
                return l51Var.h(Integer.MAX_VALUE) == -1 ? -1 : 0;
            default:
                return ((k51) this.b).b(l51Var, t71Var);
        }
    }

    @Override // defpackage.k51
    public final boolean c(l51 l51Var) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return ((k51) this.b).c(l51Var);
        }
    }

    @Override // defpackage.k51
    public final void d(long j, long j2) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((k51) this.b).d(j, j2);
                break;
        }
    }

    @Override // defpackage.k51
    public final void f(m51 m51Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                wv4 wv4VarT = m51Var.t(0, 3);
                m51Var.w(new bo(-9223372036854775807L));
                m51Var.p();
                tb1 tb1Var = (tb1) obj;
                sb1 sb1VarA = tb1Var.a();
                sb1VarA.m = lw2.m("text/x-unknown");
                sb1VarA.j = tb1Var.n;
                f34.l(sb1VarA, wv4VarT);
                break;
            default:
                ((k51) obj).f(m51Var);
                break;
        }
    }

    public cm0(tb1 tb1Var) {
        this.b = tb1Var;
    }
}
