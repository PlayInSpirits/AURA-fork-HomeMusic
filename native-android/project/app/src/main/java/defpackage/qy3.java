package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qy3 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float[] f;
    public final ho g;

    public qy3(long r1, long r3, long r5, long r7, long r9, float[] r11, ho r12) {
        this.a = r1;
        this.b = r3;
        this.c = r5;
        this.d = r7;
        this.e = r9;
        this.f = r11;
        this.g = r12;
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L8;
    L39:
        return false;
    L8:
        if (qy3.class != r7.getClass()) goto L39;
        qy3 r8 = (qy3) r7;
        if (this.a != r8.a) goto L39;
        if (this.b != r8.b) goto L39;
        if (this.e != r8.e) goto L39;
        if (g02.a(this.c, r8.c) == false) goto L39;
        if (g02.a(this.d, r8.d) == false) goto L39;
        float[] r2 = r8.f;
        float[] r3 = this.f;
        if (r3 != null) goto L30;
        if (r2 != null) goto L29;
        boolean r4 = true;
    L33:
        if (r4 == false) goto L39;
        if (this.g == r8.g) goto L38;
        return false;
    L38:
        return true;
    L29:
        r4 = false;
        goto L33
    L30:
        if (r2 == null) goto L29;
        r4 = r3.equals(r2);
        goto L33
    }

    public final int hashCode() {
        int r0 = xa3.b(xa3.b(xa3.b(xa3.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.e), 31, this.c), 31, this.d);
        float[] r2 = this.f;
        if (r2 == null) goto L5;
        int r3 = Arrays.hashCode(r2);
    L6:
        int r4 = this.g.hashCode();
        return r4 + ((r0 + r3) * 31);
    L5:
        r3 = 0;
        goto L6
    }
}
