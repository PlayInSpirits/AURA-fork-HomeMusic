package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mm0 {
    public final String a;
    public int b;
    public long c;
    public final mt2 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ nm0 g;

    public mm0(nm0 nm0Var, String str, int i, mt2 mt2Var) {
        this.g = nm0Var;
        this.a = str;
        this.b = i;
        this.c = mt2Var == null ? -1L : mt2Var.d;
        if (mt2Var == null || !mt2Var.b()) {
            return;
        }
        this.d = mt2Var;
    }

    public final boolean a(q9 q9Var) {
        mt2 mt2Var = q9Var.d;
        cu4 cu4Var = q9Var.b;
        if (mt2Var == null) {
            return this.b != q9Var.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (mt2Var.d > j) {
            return true;
        }
        mt2 mt2Var2 = this.d;
        if (mt2Var2 == null) {
            return false;
        }
        int i = mt2Var2.b;
        int iB = cu4Var.b(mt2Var.a);
        int iB2 = cu4Var.b(mt2Var2.a);
        if (mt2Var.d < mt2Var2.d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        if (!mt2Var.b()) {
            int i2 = mt2Var.e;
            return i2 == -1 || i2 > i;
        }
        int i3 = mt2Var.b;
        int i4 = mt2Var.c;
        if (i3 <= i) {
            return i3 == i && i4 > mt2Var2.c;
        }
        return true;
    }

    public final boolean b(cu4 cu4Var, cu4 cu4Var2) {
        mt2 mt2Var;
        int i = this.b;
        if (i < cu4Var.o()) {
            nm0 nm0Var = this.g;
            bu4 bu4Var = nm0Var.a;
            cu4Var.n(i, bu4Var);
            int i2 = bu4Var.m;
            while (true) {
                if (i2 > bu4Var.n) {
                    i = -1;
                    break;
                }
                int iB = cu4Var2.b(cu4Var.l(i2));
                if (iB != -1) {
                    i = cu4Var2.f(iB, nm0Var.b, false).c;
                    break;
                }
                i2++;
            }
        } else if (i >= cu4Var2.o()) {
            i = -1;
            break;
        }
        this.b = i;
        return i != -1 && ((mt2Var = this.d) == null || cu4Var2.b(mt2Var.a) != -1);
    }
}
