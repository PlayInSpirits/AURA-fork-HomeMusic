package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pg4 implements pv2 {
    public final float a;
    public final int b;

    public pg4(int r1, float r2) {
        this.a = r2;
        this.b = r1;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (pg4.class != r5.getClass()) goto L15;
        pg4 r6 = (pg4) r5;
        if (this.a != r6.a) goto L15;
        if (this.b != r6.b) goto L15;
        return true;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.a).hashCode() + 527) * 31) + this.b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + this.b;
    }
}
