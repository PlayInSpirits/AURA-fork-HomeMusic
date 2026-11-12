package defpackage;

import android.util.Range;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f55 {
    public long a;
    public long b;
    public double c;
    public Range d;

    public final void a(long r7, long r9) {
        boolean r3 = false;
        if (r7 == (-9223372036854775807L)) goto L5;
        boolean r2 = true;
    L6:
        rr2.l(r2);
        if (r9 == (-9223372036854775807L)) goto L9;
        r3 = true;
    L9:
        rr2.l(r3);
        long r4 = this.a;
        if (r4 == (-9223372036854775807L)) goto L16;
        long r5 = this.b;
        if (r5 == (-9223372036854775807L)) goto L16;
        if (r7 == r4) goto L16;
        double r0 = (r9 - r5) / (r7 - r4);
    L17:
        this.c = (((Double) this.d.clamp(Double.valueOf(r0))).doubleValue() * 0.20000000298023224d) + (this.c * 0.800000011920929d);
        this.a = r7;
        this.b = r9;
        return;
    L16:
        r0 = ((Double) this.d.getUpper()).doubleValue();
        goto L17
    L5:
        r2 = false;
        goto L6
    }

    public final void b() {
        this.c = ((Double) this.d.getUpper()).doubleValue();
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public final void c(float r7) {
        if (r7 <= 0.0f) goto L5;
        boolean r0 = true;
    L6:
        rr2.l(r0);
        this.d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) r7)));
        b();
        return;
    L5:
        r0 = false;
        goto L6
    }
}
