package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class sa2 implements LineHeightSpan {
    public final float n;
    public final int o;
    public final boolean p;
    public final boolean q;
    public final float r;
    public final int s;
    public int t = Integer.MIN_VALUE;
    public int u = Integer.MIN_VALUE;
    public int v = Integer.MIN_VALUE;
    public int w = Integer.MIN_VALUE;
    public int x;
    public int y;

    public sa2(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.n = f;
        this.o = i;
        this.p = z;
        this.q = z2;
        this.r = f2;
        this.s = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            dz1.b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.o;
        int i7 = this.s;
        boolean z3 = this.q;
        boolean z4 = this.p;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.t == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int ceil = (int) Math.ceil(this.n);
            int i9 = ceil - i8;
            if (i7 != 1 || i9 > 0) {
                float f = this.r;
                if (f == -1.0f) {
                    f = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int ceil2 = (int) (i9 <= 0 ? Math.ceil(i9 * f) : Math.ceil((1.0f - f) * i9));
                int i10 = fontMetricsInt.descent;
                int i11 = ceil2 + i10;
                this.v = i11;
                int i12 = i11 - ceil;
                this.u = i12;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i12 = fontMetricsInt.ascent;
                    }
                    this.t = i12;
                    if (z3) {
                        i11 = i10;
                    }
                    this.w = i11;
                    this.x = fontMetricsInt.ascent - i12;
                    this.y = i11 - i10;
                } else if (i7 == 2) {
                    int i13 = fontMetricsInt.ascent;
                    this.t = z4 ? Math.max(i13, i12) : Math.min(i13, i12);
                    int i14 = fontMetricsInt.descent;
                    int i15 = this.v;
                    this.w = z3 ? Math.min(i14, i15) : Math.max(i14, i15);
                    this.x = 0;
                    this.y = 0;
                }
            } else {
                int i16 = fontMetricsInt.ascent;
                this.u = i16;
                int i17 = fontMetricsInt.descent;
                this.v = i17;
                this.t = i16;
                this.w = i17;
                this.x = 0;
                this.y = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.t : this.u;
        fontMetricsInt.descent = z2 ? this.w : this.v;
    }
}
