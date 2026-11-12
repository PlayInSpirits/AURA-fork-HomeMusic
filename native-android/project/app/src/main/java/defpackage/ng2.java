package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ng2 extends fz0 {
    public final float k0;

    public ng2(float r2) {
        super(0);
        this.k0 = r2 - 0.001f;
    }

    @Override // defpackage.fz0
    public final void j(float r8, float r9, float r10, kc4 r11) {
        double r7 = this.k0;
        float r12 = (float) ((Math.sqrt(2.0d) * r7) / 2.0d);
        float r2 = (float) Math.sqrt(Math.pow(r7, 2.0d) - Math.pow(r12, 2.0d));
        r11.d(r9 - r12, ((float) (-((Math.sqrt(2.0d) * r7) - r7))) + r2, 270.0f, 0.0f);
        r11.c(r9, (float) (-((Math.sqrt(2.0d) * r7) - r7)));
        r11.c(r9 + r12, ((float) (-((Math.sqrt(2.0d) * r7) - r7))) + r2);
    }
}
