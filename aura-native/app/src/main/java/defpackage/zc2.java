package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class zc2 {
    public final a83 n;
    public boolean o;
    public int p = -1;
    public final /* synthetic */ ad2 q;

    public zc2(ad2 ad2Var, a83 a83Var) {
        this.q = ad2Var;
        this.n = a83Var;
    }

    public final void a(boolean z) {
        if (z == this.o) {
            return;
        }
        this.o = z;
        int i = z ? 1 : -1;
        ad2 ad2Var = this.q;
        int i2 = ad2Var.c;
        ad2Var.c = i + i2;
        if (!ad2Var.d) {
            ad2Var.d = true;
            while (true) {
                try {
                    int i3 = ad2Var.c;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        ad2Var.g();
                    } else if (z3) {
                        ad2Var.h();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    ad2Var.d = false;
                    throw th;
                }
            }
            ad2Var.d = false;
        }
        if (this.o) {
            ad2Var.c(this);
        }
    }

    public boolean d(ba2 ba2Var) {
        return false;
    }

    public abstract boolean e();

    public void c() {
    }
}
