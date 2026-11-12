package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class i63 {
    public final f13 a = new f13(new a63[16]);
    public final q03 b = new q03(10);

    public boolean a(xe2 xe2Var, q62 q62Var, gp3 gp3Var, boolean z) {
        f13 f13Var = this.a;
        Object[] objArr = f13Var.n;
        int i = f13Var.p;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((a63) objArr[i2]).a(xe2Var, q62Var, gp3Var, z) || z2;
        }
        return z2;
    }

    public void b(gp3 gp3Var) {
        f13 f13Var = this.a;
        int i = f13Var.p;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((a63) f13Var.n[i]).d.b == 0) {
                f13Var.k(i);
            }
        }
    }
}
