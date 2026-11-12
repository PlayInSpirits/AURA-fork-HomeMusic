package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rp1 {
    public final wf1 a;
    public final /* synthetic */ int b;

    public rp1(int r1, wf1 r2) {
        this.b = r1;
        this.a = r2;
    }

    public final float a(float r7, q62 r8, q62 r9) {
        switch(this.b) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        float r6 = ((int) (r8.k() & 4294967295L)) / 2.0f;
        long r4 = Float.floatToRawIntBits(r7);
        return Float.intBitsToFloat((int) (r9.z(r8, (((long) Float.floatToRawIntBits(r6)) & 4294967295L) | (r4 << 32)) >> 32));
    L6:
        long r5 = Float.floatToRawIntBits(((int) (r8.k() >> 32)) / 2.0f);
        return Float.intBitsToFloat((int) (r9.z(r8, (((long) Float.floatToRawIntBits(r7)) & 4294967295L) | (r5 << 32)) & 4294967295L));
    }
}
