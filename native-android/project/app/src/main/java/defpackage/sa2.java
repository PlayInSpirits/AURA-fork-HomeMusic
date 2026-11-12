package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sa2 implements LineHeightSpan {
    public final float n;
    public final int o;
    public final boolean p;
    public final boolean q;
    public final float r;
    public final int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;

    public sa2(float r1, int r2, boolean r3, boolean r4, float r5, int r6) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        this.s = r6;
        this.t = Integer.MIN_VALUE;
        this.u = Integer.MIN_VALUE;
        this.v = Integer.MIN_VALUE;
        this.w = Integer.MIN_VALUE;
        if (0.0f > r5) goto L8;
        if (r5 > 1.0f) goto L8;
        return;
    L8:
        if (r5 != (-1.0f)) goto L10;
        return;
    L10:
        dz1.b("topRatio should be in [0..1] range or -1");
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence r8, int r9, int r10, int r11, int r12, Paint.FontMetricsInt r13) {
        int r14 = r13.descent;
        int r15 = r13.ascent;
        if ((r14 - r15) > 0) goto L6;
        return;
    L6:
        if (r9 != 0) goto L8;
        boolean r16 = true;
    L10:
        if (r10 != this.o) goto L12;
        boolean r17 = true;
    L13:
        int r2 = this.s;
        boolean r3 = this.q;
        boolean r4 = this.p;
        if (r16 == false) goto L22;
        if (r17 == false) goto L22;
        if (r4 == false) goto L22;
        if (r3 == false) goto L22;
        if (r2 == 2) goto L22;
        return;
    L22:
        if (this.t != Integer.MIN_VALUE) goto L54;
        int r18 = r14 - r15;
        int r19 = (int) Math.ceil(this.n);
        int r20 = r19 - r18;
        if (r2 != 1) goto L27;
        if (r20 > 0) goto L27;
        int r21 = r13.ascent;
        this.u = r21;
        int r110 = r13.descent;
        this.v = r110;
        this.t = r21;
        this.w = r110;
        this.x = 0;
        this.y = 0;
    L27:
        float r5 = this.r;
        if (r5 != (-1.0f)) goto L30;
        r5 = Math.abs(r13.ascent) / (r13.descent - r13.ascent);
    L30:
        if (r20 > 0) goto L33;
        double r6 = Math.ceil(r20 * r5);
    L32:
        int r0 = (int) r6;
        int r7 = r13.descent;
        int r1 = r0 + r7;
        this.v = r1;
        int r111 = r1 - r19;
        this.u = r111;
        if (r2 == 0) goto L38;
        if (r20 >= 0) goto L38;
        if (r2 != 2) goto L54;
        int r22 = r13.ascent;
        if (r4 == false) goto L48;
        int r23 = Math.max(r22, r111);
    L49:
        this.t = r23;
        int r24 = r13.descent;
        int r112 = this.v;
        if (r3 == false) goto L52;
        int r25 = Math.min(r24, r112);
    L53:
        this.w = r25;
        this.x = 0;
        this.y = 0;
        goto L54
    L52:
        r25 = Math.max(r24, r112);
        goto L53
    L48:
        r23 = Math.min(r22, r111);
    L38:
        if (r4 == false) goto L40;
        r111 = r13.ascent;
    L40:
        this.t = r111;
        if (r3 == false) goto L43;
        r1 = r7;
    L43:
        this.w = r1;
        this.x = r13.ascent - r111;
        this.y = r1 - r7;
        goto L54
    L33:
        r6 = Math.ceil((1.0f - r5) * r20);
    L54:
        if (r16 == false) goto L56;
        int r26 = this.t;
    L57:
        r13.ascent = r26;
        if (r17 == false) goto L60;
        int r27 = this.w;
    L61:
        r13.descent = r27;
        return;
    L60:
        r27 = this.v;
        goto L61
    L56:
        r26 = this.u;
        goto L57
    L12:
        r17 = false;
        goto L13
    L8:
        r16 = false;
        goto L10
    }
}
