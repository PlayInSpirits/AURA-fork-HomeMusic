package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m34 extends su3 {
    @Override // defpackage.su3
    public final void r(kc4 kc4Var, float f, float f2) {
        kc4Var.d(0.0f, f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        gc4 gc4Var = new gc4(0.0f, 0.0f, f3, f3);
        gc4Var.f = 180.0f;
        gc4Var.g = 90.0f;
        kc4Var.g.add(gc4Var);
        ec4 ec4Var = new ec4(gc4Var);
        kc4Var.a(180.0f);
        kc4Var.h.add(ec4Var);
        kc4Var.e = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        kc4Var.c = (((float) Math.cos(Math.toRadians(270.0d))) * f5) + f4;
        kc4Var.d = (f5 * ((float) Math.sin(Math.toRadians(270.0d)))) + f4;
    }
}
