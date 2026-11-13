package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ng2 extends fz0 {
    public final float k0;

    public ng2(float f) {
        super(0);
        this.k0 = f - 0.001f;
    }

    @Override // defpackage.fz0
    public final void j(float f, float f2, float f3, kc4 kc4Var) {
        double d = this.k0;
        float sqrt = (float) ((Math.sqrt(2.0d) * d) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(d, 2.0d) - Math.pow(sqrt, 2.0d));
        kc4Var.d(f2 - sqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + sqrt2, 270.0f, 0.0f);
        kc4Var.c(f2, (float) (-((Math.sqrt(2.0d) * d) - d)));
        kc4Var.c(f2 + sqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + sqrt2);
    }
}
