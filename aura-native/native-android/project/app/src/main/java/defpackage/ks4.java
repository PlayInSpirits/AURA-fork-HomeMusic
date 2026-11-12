package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ks4 {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public final Layout e;
    public final int f;
    public final int g;
    public final int h;
    public final float i;
    public final float j;
    public final boolean k;
    public final Paint.FontMetricsInt l;
    public final int m;
    public final sa2[] n;
    public final Rect o = new Rect();
    public z40 p;

    /* JADX WARN: Code duplicated, block: B:57:0x012a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0161  */
    /* JADX WARN: Code duplicated, block: B:86:0x0178  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a3 A[PHI: r14
  0x01a3: PHI (r14v7 int) = (r14v6 int), (r14v9 int) binds: [B:102:0x01b5, B:95:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r25v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [android.graphics.Paint$FontMetricsInt] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    public ks4(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, t62 t62Var) throws Throwable {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutM;
        sa2[] sa2VarArr;
        int i10;
        int i11;
        int i12;
        int i13;
        Throwable th;
        char c;
        long j;
        int i14;
        int i15;
        int i16;
        long jA;
        boolean fallbackLineSpacing = false;
        int topPadding;
        long jA2;
        int i17;
        Paint.FontMetricsInt r6;
        int i18;
        this.a = textPaint;
        this.b = truncateAt;
        this.c = z;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicB = ns4.b(i2);
        Layout.Alignment alignment = nr4.a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : nr4.b : nr4.a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z2 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, ir.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = t62Var.a();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (metricsA == null || t62Var.c() > f || z2) {
                this.k = false;
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicB;
                layoutM = fu.m(charSequence, textPaint, iCeil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
            } else {
                this.k = true;
                if (iCeil < 0) {
                    dz1.a("negative width");
                }
                if (iCeil < 0) {
                    dz1.a("negative ellipsized width");
                }
                layoutM = Build.VERSION.SDK_INT >= 33 ? n3.g(charSequence, textPaint, iCeil, alignment2, metricsA, z, truncateAt, iCeil) : new BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsA, z, truncateAt, iCeil);
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicB;
            }
            this.e = layoutM;
            Trace.endSection();
            int iMin = Math.min(layoutM.getLineCount(), i9);
            this.f = iMin;
            int i19 = iMin - 1;
            this.d = iMin >= i9 && (layoutM.getEllipsisCount(i19) > 0 || layoutM.getLineEnd(i19) != charSequence.length());
            if (layoutM.getText() instanceof Spanned) {
                CharSequence text = layoutM.getText();
                text.getClass();
                if (bu.q((Spanned) text, sa2.class) || layoutM.getText().length() <= 0) {
                    CharSequence text2 = layoutM.getText();
                    text2.getClass();
                    i10 = 0;
                    sa2VarArr = (sa2[]) ((Spanned) text2).getSpans(0, layoutM.getText().length(), sa2.class);
                } else {
                    sa2VarArr = null;
                    i10 = 0;
                }
            } else {
                sa2VarArr = null;
                i10 = 0;
            }
            this.n = sa2VarArr;
            if (sa2VarArr == null) {
                i11 = 2;
                i12 = i10;
            } else {
                sa2 sa2Var = sa2VarArr.length == 0 ? null : sa2VarArr[i10];
                if (sa2Var != null) {
                    if (sa2Var.p) {
                        i11 = 2;
                        i18 = sa2Var.s == 2 ? 1 : i18;
                        i12 = i18;
                    } else {
                        i11 = 2;
                    }
                    i18 = i10;
                    i12 = i18;
                } else {
                    i11 = 2;
                    i12 = i10;
                }
            }
            if (sa2VarArr == null) {
                i13 = i10;
            } else {
                sa2 sa2Var2 = sa2VarArr.length == 0 ? null : sa2VarArr[i10];
                if (sa2Var2 != null && sa2Var2.q && sa2Var2.s == i11) {
                    i13 = 1;
                } else {
                    i13 = i10;
                }
            }
            if (i12 == 0 || i13 == 0) {
                long jA3 = ns4.b;
                if (z) {
                    th = null;
                    c = ' ';
                    j = 4294967295L;
                    i14 = 1;
                    i15 = 33;
                } else {
                    if (this.k) {
                        BoringLayout boringLayout = (BoringLayout) layoutM;
                        i15 = 33;
                        if (Build.VERSION.SDK_INT >= 33) {
                            fallbackLineSpacing = boringLayout.isFallbackLineSpacingEnabled();
                        } else {
                            fallbackLineSpacing = false;
                        }
                    } else {
                        i15 = 33;
                        StaticLayout staticLayout = (StaticLayout) layoutM;
                        int i20 = Build.VERSION.SDK_INT;
                        if (i20 >= 33) {
                            fallbackLineSpacing = staticLayout.isFallbackLineSpacingEnabled();
                        } else if (i20 >= 28) {
                            fallbackLineSpacing = true;
                        } else {
                            fallbackLineSpacing = false;
                        }
                    }
                    if (fallbackLineSpacing) {
                        th = null;
                        c = ' ';
                        j = 4294967295L;
                        i14 = 1;
                    } else {
                        TextPaint paint = layoutM.getPaint();
                        CharSequence text3 = layoutM.getText();
                        th = null;
                        c = ' ';
                        Rect rectU = uo.u(paint, text3, layoutM.getLineStart(i10), layoutM.getLineEnd(i10));
                        int lineAscent = layoutM.getLineAscent(i10);
                        j = 4294967295L;
                        int i21 = rectU.top;
                        if (i21 < lineAscent) {
                            topPadding = lineAscent - i21;
                        } else {
                            topPadding = layoutM.getTopPadding();
                        }
                        i14 = 1;
                        rectU = iMin != 1 ? uo.u(paint, text3, layoutM.getLineStart(i19), layoutM.getLineEnd(i19)) : rectU;
                        int lineDescent = layoutM.getLineDescent(i19);
                        int i22 = rectU.bottom;
                        int bottomPadding = i22 > lineDescent ? i22 - lineDescent : layoutM.getBottomPadding();
                        if (topPadding != 0 || bottomPadding != 0) {
                            jA3 = ns4.a(topPadding, bottomPadding);
                        }
                    }
                }
                int i23 = i12 != 0 ? i10 : (int) (jA3 >> c);
                if (i13 != 0) {
                    i16 = i10;
                } else {
                    i16 = (int) (jA3 & j);
                }
                jA = ns4.a(i23, i16);
            } else {
                jA = ns4.b;
                th = null;
                c = ' ';
                j = 4294967295L;
                i14 = 1;
                i15 = 33;
            }
            if (sa2VarArr != null) {
                int length2 = sa2VarArr.length;
                int iMax = i10;
                int iMax2 = iMax;
                for (int i24 = iMax2; i24 < length2; i24++) {
                    sa2 sa2Var3 = sa2VarArr[i24];
                    int i25 = sa2Var3.x;
                    iMax = i25 < 0 ? Math.max(iMax, Math.abs(i25)) : iMax;
                    int i26 = sa2Var3.y;
                    if (i26 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i26));
                    }
                }
                jA2 = (iMax == 0 && iMax2 == 0) ? ns4.b : ns4.a(iMax, iMax2);
            } else {
                jA2 = ns4.b;
            }
            this.g = Math.max((int) (jA >> c), (int) (jA2 >> c));
            this.h = Math.max((int) (jA & j), (int) (jA2 & j));
            TextPaint textPaint2 = this.a;
            sa2[] sa2VarArr2 = this.n;
            int i27 = this.f - i14;
            Layout layout = this.e;
            if (layout.getLineStart(i27) != layout.getLineEnd(i27) || sa2VarArr2 == null || sa2VarArr2.length == 0) {
                i17 = i10;
                r6 = th;
            } else {
                SpannableString spannableString = new SpannableString("\u200b");
                if (sa2VarArr2.length == 0) {
                    kf2.m("Array is empty.");
                    throw th;
                }
                sa2 sa2Var4 = sa2VarArr2[i10];
                spannableString.setSpan(new sa2(sa2Var4.n, spannableString.length(), (i27 == 0 || !sa2Var4.q) ? sa2Var4.q : i10, sa2Var4.q, sa2Var4.r, sa2Var4.s), i10, spannableString.length(), i15);
                i17 = i10;
                StaticLayout staticLayoutM = fu.m(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, p62.a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.c, 0, 0, 0, 0);
                Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutM.getLineAscent(i17);
                fontMetricsInt.descent = staticLayoutM.getLineDescent(i17);
                fontMetricsInt.top = staticLayoutM.getLineTop(i17);
                fontMetricsInt.bottom = staticLayoutM.getLineBottom(i17);
                r6 = fontMetricsInt;
            }
            this.m = r6 != null ? r6.bottom - ((int) (d(i19) - g(i19))) : i17;
            this.l = r6;
            Layout layout2 = this.e;
            this.i = vr1.t(layout2, i19, layout2.getPaint());
            Layout layout3 = this.e;
            this.j = vr1.u(layout3, i19, layout3.getPaint());
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final int a() {
        boolean z = this.d;
        Layout layout = this.e;
        return (z ? layout.getLineBottom(this.f - 1) : layout.getHeight()) + this.g + this.h + this.m;
    }

    public final z40 b() {
        z40 z40Var = this.p;
        if (z40Var != null) {
            return z40Var;
        }
        z40 z40Var2 = new z40(this.e);
        this.p = z40Var2;
        return z40Var2;
    }

    public final float c(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.g + ((i != this.f + (-1) || (fontMetricsInt = this.l) == null) ? this.e.getLineBaseline(i) : g(i) - fontMetricsInt.ascent);
    }

    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.f;
        int i3 = i2 - 1;
        Layout layout = this.e;
        if (i != i3 || (fontMetricsInt = this.l) == null) {
            return this.g + layout.getLineBottom(i) + (i == i2 + (-1) ? this.h : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int e(int i) {
        ThreadLocal threadLocal = ns4.a;
        Layout layout = this.e;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final int f(int i) {
        int i2 = this.f;
        if (i2 <= 0) {
            return 0;
        }
        int lineForOffset = this.e.getLineForOffset(i);
        int i3 = i2 - 1;
        return lineForOffset > i3 ? i3 : lineForOffset;
    }

    public final float g(int i) {
        return this.e.getLineTop(i) + (i == 0 ? 0 : this.g);
    }

    public final float h(int i, boolean z) {
        return (f(i) == this.f - 1 ? this.i + this.j : 0.0f) + b().d(i, true, z);
    }

    public final float i(int i, boolean z) {
        return (f(i) == this.f + (-1) ? this.i + this.j : 0.0f) + b().d(i, false, z);
    }
}
