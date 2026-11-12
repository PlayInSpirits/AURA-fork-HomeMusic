package defpackage;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v95 {
    public long a;
    public long b;
    public CharSequence c;
    public int d;
    public float e;
    public int f;
    public int g;
    public float h;
    public int i;
    public float j;
    public int k;

    public v95() {
        this.a = 0;
        this.b = 0;
        this.d = 2;
        this.e = -3.4028235E38f;
        this.f = 1;
        this.g = 0;
        this.h = -3.4028235E38f;
        this.i = Integer.MIN_VALUE;
        this.j = 1.0f;
        this.k = Integer.MIN_VALUE;
    }

    public final hg0 a() {
        float r0 = this.h;
        float r1 = -3.4028235E38f;
        if (r0 != (-3.4028235E38f)) goto L11;
        int r2 = this.d;
        if (r2 == 4) goto L10;
        if (r2 == 5) goto L9;
        r0 = 0.5f;
        goto L11
    L9:
        r0 = 1.0f;
        goto L11
    L10:
        r0 = 0.0f;
    L11:
        int r3 = this.i;
        if (r3 != Integer.MIN_VALUE) goto L22;
        int r4 = this.d;
        if (r4 == 1) goto L21;
        if (r4 == 3) goto L20;
        if (r4 == 4) goto L21;
        if (r4 == 5) goto L20;
        r3 = 1;
    L20:
        r3 = 2;
    L21:
        r3 = 0;
    L22:
        hg0 r8 = new hg0();
        int r12 = this.d;
        if (r12 == 1) goto L31;
        if (r12 == 2) goto L30;
        if (r12 == 3) goto L29;
        if (r12 == 4) goto L31;
        if (r12 == 5) goto L29;
        xa3.m(r12, "Unknown textAlignment: ", "WebvttCueParser");
        Layout.Alignment r6 = null;
    L32:
        r8.c = r6;
        float r7 = this.e;
        int r9 = this.f;
        if (r7 == (-3.4028235E38f)) goto L40;
        if (r9 != 0) goto L40;
        if (r7 >= 0.0f) goto L38;
    L39:
        r1 = 1.0f;
    L44:
        r8.e = r1;
        r8.f = r9;
        r8.g = this.g;
        r8.h = r0;
        r8.i = r3;
        float r5 = this.j;
        if (r3 == 0) goto L55;
        if (r3 == 1) goto L52;
        if (r3 == 2) goto L56;
        kf2.o(String.valueOf(r3));
        return null;
    L56:
        r8.l = Math.min(r5, r0);
        r8.p = this.k;
        CharSequence r14 = this.c;
        if (r14 == null) goto L59;
        r8.a = r14;
        r8.b = null;
    L59:
        return r8;
    L52:
        if (r0 > 0.5f) goto L54;
        r0 = r0 * 2.0f;
        goto L56
    L54:
        r0 = (1.0f - r0) * 2.0f;
        goto L56
    L55:
        r0 = 1.0f - r0;
        goto L56
    L38:
        if (r7 > 1.0f) goto L39;
    L40:
        if (r7 == (-3.4028235E38f)) goto L42;
        r1 = r7;
        goto L44
    L42:
        if (r9 != 0) goto L44;
    L29:
        r6 = Layout.Alignment.ALIGN_OPPOSITE;
        goto L32
    L30:
        r6 = Layout.Alignment.ALIGN_CENTER;
    L31:
        r6 = Layout.Alignment.ALIGN_NORMAL;
        goto L32
    }
}
