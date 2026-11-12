package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lv3 {
    public z80 a;
    public int b;
    public mg1 c;
    public wf1 d;
    public int e;
    public p03 f;
    public w03 g;

    public lv3(z80 z80Var) {
        this.a = z80Var;
    }

    public final boolean a() {
        if (this.a != null) {
            mg1 mg1Var = this.c;
            if (mg1Var != null ? mg1Var.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final p12 b(Object obj) {
        p12 p12VarS;
        z80 z80Var = this.a;
        return (z80Var == null || (p12VarS = z80Var.s(this, obj)) == null) ? p12.n : p12VarS;
    }

    public final void c() {
        z80 z80Var = this.a;
        if (z80Var != null) {
            z80Var.B = true;
            z80Var.G.r();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }
}
