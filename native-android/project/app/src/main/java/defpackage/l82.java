package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l82 {
    public final Object a;
    public final n82 b;
    public int d;
    public l82 e;
    public boolean f;
    public int c = -1;
    public final zd3 g = uc5.B(null);

    public l82(Object obj, n82 n82Var) {
        this.a = obj;
        this.b = n82Var;
    }

    public final l82 a() {
        if (this.f) {
            fz1.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.n.add(this);
            l82 l82Var = (l82) this.g.getValue();
            if (l82Var != null) {
                l82Var.a();
            } else {
                l82Var = null;
            }
            this.e = l82Var;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            fz1.c("Release should only be called once");
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            c();
        }
    }

    public final void c() {
        this.b.n.remove(this);
        l82 l82Var = this.e;
        if (l82Var != null) {
            l82Var.b();
        }
        this.e = null;
    }
}
