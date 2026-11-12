package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ng3 extends ReplacementSpan {
    public Paint.FontMetricsInt n;
    public int o;
    public int p;
    public boolean q;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt r0 = this.n;
        if (r0 == null) goto L5;
        return r0;
    L5:
        h12.Q("fontMetrics");
        throw null;
    }

    public final int b() {
        if (this.q == true) goto L6;
        dz1.b("PlaceholderSpan is not laid out yet.");
    L6:
        return this.p;
    }

    public final int c() {
        if (this.q == true) goto L6;
        dz1.b("PlaceholderSpan is not laid out yet.");
    L6:
        return this.o;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas r1, CharSequence r2, int r3, int r4, float r5, int r6, int r7, int r8, Paint r9) {
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint r1, CharSequence r2, int r3, int r4, Paint.FontMetricsInt r5) {
        this.q = true;
        r1.getTextSize();
        this.n = r1.getFontMetricsInt();
        if (a().descent > a().ascent) goto L6;
        dz1.a("Invalid fontMetrics: line height can not be negative.");
    L6:
        this.o = (int) Math.ceil(0.0d);
        this.p = (int) Math.ceil(0.0d);
        if (r5 == null) goto L13;
        r5.ascent = a().ascent;
        r5.descent = a().descent;
        r5.leading = a().leading;
        if (r5.ascent <= (-b())) goto L11;
        r5.ascent = -b();
    L11:
        r5.top = Math.min(a().top, r5.ascent);
        r5.bottom = Math.max(a().bottom, r5.descent);
    L13:
        return c();
    }
}
