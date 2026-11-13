package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qu {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final be3 f;
    public final be3 g;
    public int h;
    public int i;

    public qu(be3 be3Var, be3 be3Var2, boolean z) {
        this.g = be3Var;
        this.f = be3Var2;
        this.e = z;
        be3Var2.N(12);
        this.a = be3Var2.E();
        be3Var.N(12);
        this.i = be3Var.E();
        wr1.i("first_chunk must be 1", be3Var.m() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        boolean z = this.e;
        be3 be3Var = this.f;
        this.d = z ? be3Var.G() : be3Var.C();
        if (this.b == this.h) {
            be3 be3Var2 = this.g;
            this.c = be3Var2.E();
            be3Var2.O(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? be3Var2.E() - 1 : -1;
        }
        return true;
    }
}
