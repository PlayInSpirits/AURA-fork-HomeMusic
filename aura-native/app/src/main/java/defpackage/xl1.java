package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class xl1 implements k51 {
    public final k51 a;
    public final boolean b;

    public xl1(int i) {
        boolean z = (i & 1) != 0;
        this.b = z;
        if (z) {
            this.a = new df4("image/heif", -1, -1);
        } else {
            this.a = new wl1();
        }
    }

    @Override // defpackage.k51
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.k51
    public final int b(l51 l51Var, t71 t71Var) {
        return this.a.b(l51Var, t71Var);
    }

    @Override // defpackage.k51
    public final boolean c(l51 l51Var) {
        return this.b ? ji2.S((rk0) l51Var, false) : this.a.c(l51Var);
    }

    @Override // defpackage.k51
    public final void d(long j, long j2) {
        this.a.d(j, j2);
    }

    @Override // defpackage.k51
    public final void f(m51 m51Var) {
        this.a.f(m51Var);
    }
}
