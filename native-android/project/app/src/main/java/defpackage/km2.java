package defpackage;

import android.os.Looper;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class km2 implements lm2, yr2 {
    public final /* synthetic */ mi3 n;

    public /* synthetic */ km2(mi3 mi3Var) {
        this.n = mi3Var;
    }

    @Override // defpackage.lm2
    public void c(bm2 bm2Var) {
        boolean z;
        boolean z2;
        if (bm2Var.Y()) {
            mi3 mi3Var = bm2Var.y;
            mi3 mi3Var2 = this.n;
            if (Objects.equals(mi3Var, mi3Var2)) {
                return;
            }
            bm2Var.y = mi3Var2;
            mi3 mi3Var3 = bm2Var.z;
            mi3 mi3VarY0 = bm2.Y0(bm2Var.x, mi3Var2);
            bm2Var.z = mi3VarY0;
            if (mi3VarY0.equals(mi3Var3)) {
                z = false;
                z2 = false;
            } else {
                gy3 gy3Var = bm2Var.u;
                gy3 gy3Var2 = bm2Var.v;
                gy3 gy3VarU1 = bm2.u1(bm2Var.t, bm2Var.s, bm2Var.w, bm2Var.z, bm2Var.I);
                bm2Var.u = gy3VarU1;
                bm2Var.v = bm2.t1(gy3VarU1, bm2Var.s, bm2Var.I, bm2Var.w, bm2Var.z);
                z = !bm2Var.u.equals(gy3Var);
                z2 = !bm2Var.v.equals(gy3Var2);
                bm2Var.i.f(13, new cl2(bm2Var, 2));
            }
            if (z2) {
                sk2 sk2VarF1 = bm2Var.f1();
                sk2VarF1.getClass();
                rr2.w(Looper.myLooper() == sk2VarF1.f.getLooper());
                sk2VarF1.e.getClass();
            }
            if (z) {
                sk2 sk2VarF2 = bm2Var.f1();
                sk2VarF2.getClass();
                rr2.w(Looper.myLooper() == sk2VarF2.f.getLooper());
                sk2VarF2.e.u();
            }
        }
    }

    @Override // defpackage.yr2
    public void f(er2 er2Var, int i) {
        er2Var.t(i, this.n);
    }
}
