package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l05 extends ReplacementSpan {
    public final Paint.FontMetricsInt n;
    public final k05 o;
    public short p;
    public float q;
    public TextPaint r;

    public l05(k05 r2) {
        this.n = new Paint.FontMetricsInt();
        this.p = -1;
        this.q = 1.0f;
        l93.m(r2, "rasterizer cannot be null");
        this.o = r2;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas r19, CharSequence r20, int r21, int r22, float r23, int r24, int r25, int r26, Paint r27) {
        TextPaint r4 = null;
        if ((r20 instanceof Spanned) == false) goto L26;
        CharacterStyle[] r1 = (CharacterStyle[]) ((Spanned) r20).getSpans(r21, r22, CharacterStyle.class);
        if (r1.length == 0) goto L23;
        int r5 = 0;
        if (r1.length == 1) goto L9;
    L11:
        TextPaint r3 = this.r;
        if (r3 != null) goto L14;
        r3 = new TextPaint();
        this.r = r3;
    L14:
        r4 = r3;
        r4.set(r27);
    L16:
        if (r5 >= r1.length) goto L21;
        CharacterStyle r6 = r1[r5];
        if ((r6 instanceof MetricAffectingSpan) == true) goto L20;
        r6.updateDrawState(r4);
    L20:
        r5 = r5 + 1;
    L21:
        TextPaint r10 = r4;
        if (r10 != null) goto L30;
    L32:
        tz0.a().getClass();
        float r2 = r25;
        Paint r11 = r10;
        if (r10 != null) goto L36;
        r11 = r27;
    L36:
        k05 r0 = this.o;
        na4 r7 = r0.b;
        Typeface r8 = (Typeface) r7.q;
        Typeface r9 = r11.getTypeface();
        r11.setTypeface(r8);
        r19.drawText((char[]) r7.o, r0.a * 2, 2, r23, r2, r11);
        r11.setTypeface(r9);
        return;
    L30:
        if (r10.bgColor == 0) goto L32;
        int r12 = r10.getColor();
        Paint.Style r13 = r10.getStyle();
        r10.setColor(r10.bgColor);
        r10.setStyle(Paint.Style.FILL);
        r19.drawRect(r23, r24, r23 + this.p, r26, r10);
        r10.setStyle(r13);
        r10.setColor(r12);
        goto L32
    L9:
        if (r1[0] != this) goto L11;
    L23:
        if ((r27 instanceof TextPaint) == false) goto L21;
        r4 = (TextPaint) r27;
        goto L21
    L26:
        if ((r27 instanceof TextPaint) == false) goto L21;
        r4 = (TextPaint) r27;
        goto L21
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint r5, CharSequence r6, int r7, int r8, Paint.FontMetricsInt r9) {
        Paint.FontMetricsInt r10 = this.n;
        r5.getFontMetricsInt(r10);
        float r11 = Math.abs(r10.descent - r10.ascent) * 1.0f;
        k05 r12 = this.o;
        vv2 r13 = r12.b();
        int r1 = r13.a(14);
        short r2 = 0;
        if (r1 == 0) goto L5;
        short r14 = ((ByteBuffer) r13.q).getShort(r1 + r13.n);
    L6:
        this.q = r11 / r14;
        vv2 r15 = r12.b();
        int r16 = r15.a(14);
        if (r16 == 0) goto L9;
        ((ByteBuffer) r15.q).getShort(r16 + r15.n);
    L9:
        vv2 r17 = r12.b();
        int r18 = r17.a(12);
        if (r18 == 0) goto L12;
        r2 = ((ByteBuffer) r17.q).getShort(r18 + r17.n);
    L12:
        short r19 = (short) (r2 * this.q);
        this.p = r19;
        if (r9 == null) goto L15;
        r9.ascent = r10.ascent;
        r9.descent = r10.descent;
        r9.top = r10.top;
        r9.bottom = r10.bottom;
    L15:
        return r19;
    L5:
        r14 = 0;
        goto L6
    }
}
