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
        double dCeil;
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
            int iCeil = (int) Math.ceil(this.n);
            int i9 = iCeil - i8;
            if (i7 != 1 || i9 > 0) {
                float fAbs = this.r;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                if (i9 <= 0) {
                    dCeil = Math.ceil(i9 * fAbs);
                } else {
                    dCeil = Math.ceil((1.0f - fAbs) * i9);
                }
                int i10 = (int) dCeil;
                int i11 = fontMetricsInt.descent;
                int i12 = i10 + i11;
                this.v = i12;
                int i13 = i12 - iCeil;
                this.u = i13;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i13 = fontMetricsInt.ascent;
                    }
                    this.t = i13;
                    if (z3) {
                        i12 = i11;
                    }
                    this.w = i12;
                    this.x = fontMetricsInt.ascent - i13;
                    this.y = i12 - i11;
                } else if (i7 == 2) {
                    int i14 = fontMetricsInt.ascent;
                    this.t = z4 ? Math.max(i14, i13) : Math.min(i14, i13);
                    int i15 = fontMetricsInt.descent;
                    int i16 = this.v;
                    this.w = z3 ? Math.min(i15, i16) : Math.max(i15, i16);
                    this.x = 0;
                    this.y = 0;
                }
            } else {
                int i17 = fontMetricsInt.ascent;
                this.u = i17;
                int i18 = fontMetricsInt.descent;
                this.v = i18;
                this.t = i17;
                this.w = i18;
                this.x = 0;
                this.y = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.t : this.u;
        fontMetricsInt.descent = z2 ? this.w : this.v;
    }
}
