package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gv implements fv {
    @Override // defpackage.fv
    public final float a(float r3, float r4, float r5) {
        float r2 = Math.abs((r4 + r3) - r3);
        if (r2 > r5) goto L5;
        boolean r6 = true;
    L6:
        float r0 = (0.3f * r5) - (0.0f * r2);
        float r1 = r5 - r0;
        if (r6 == false) goto L12;
        if (r1 >= r2) goto L12;
        r0 = r5 - r2;
    L12:
        return r3 - r0;
    L5:
        r6 = false;
        goto L6
    }
}
