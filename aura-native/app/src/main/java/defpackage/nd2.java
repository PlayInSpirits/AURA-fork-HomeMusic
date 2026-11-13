package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class nd2 extends x65 {
    public static final un0 d = new un0(2);
    public final mj4 b = new mj4(0);
    public boolean c = false;

    @Override // defpackage.x65
    public final void b() {
        mj4 mj4Var = this.b;
        int e = mj4Var.e();
        for (int i = 0; i < e; i++) {
            ld2 ld2Var = (ld2) mj4Var.f(i);
            og5 og5Var = ld2Var.l;
            og5Var.a();
            og5Var.c = true;
            md2 md2Var = ld2Var.n;
            if (md2Var != null) {
                ld2Var.j(md2Var);
            }
            ld2 ld2Var2 = og5Var.a;
            if (ld2Var2 == null) {
                kf2.o("No listener register");
                return;
            }
            if (ld2Var2 != ld2Var) {
                kf2.n("Attempting to unregister the wrong listener");
                return;
            }
            og5Var.a = null;
            if (md2Var != null) {
                boolean z = md2Var.b;
            }
            og5Var.d = true;
            og5Var.b = false;
            og5Var.c = false;
            og5Var.e = false;
        }
        int i2 = mj4Var.q;
        Object[] objArr = mj4Var.p;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        mj4Var.q = 0;
        mj4Var.n = false;
    }
}
