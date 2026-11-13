package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ng3 extends ReplacementSpan {
    public Paint.FontMetricsInt n;
    public int o;
    public int p;
    public boolean q;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.n;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        h12.Q("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.q) {
            dz1.b("PlaceholderSpan is not laid out yet.");
        }
        return this.p;
    }

    public final int c() {
        if (!this.q) {
            dz1.b("PlaceholderSpan is not laid out yet.");
        }
        return this.o;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.q = true;
        paint.getTextSize();
        this.n = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            dz1.a("Invalid fontMetrics: line height can not be negative.");
        }
        this.o = (int) Math.ceil(0.0d);
        this.p = (int) Math.ceil(0.0d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        return c();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
