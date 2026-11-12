package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m34 extends su3 {
    @Override // defpackage.su3
    public final void r(kc4 r5, float r6, float r7) {
        r5.d(0.0f, r7 * r6, 180.0f, 90.0f);
        float r8 = (r7 * 2.0f) * r6;
        gc4 r9 = new gc4(0.0f, 0.0f, r8, r8);
        r9.f = 180.0f;
        r9.g = 90.0f;
        r5.g.add(r9);
        ec4 r2 = new ec4(r9);
        r5.a(180.0f);
        r5.h.add(r2);
        r5.e = 270.0f;
        float r10 = (0.0f + r8) * 0.5f;
        float r11 = (r8 - 0.0f) / 2.0f;
        r5.c = (((float) Math.cos(Math.toRadians(270.0d))) * r11) + r10;
        r5.d = (r11 * ((float) Math.sin(Math.toRadians(270.0d)))) + r10;
    }
}
