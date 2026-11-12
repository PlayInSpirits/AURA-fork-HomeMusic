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
    public final k05 o;
    public TextPaint r;
    public final Paint.FontMetricsInt n = new Paint.FontMetricsInt();
    public short p = -1;
    public float q = 1.0f;

    public l05(k05 k05Var) {
        l93.m(k05Var, "rasterizer cannot be null");
        this.o = k05Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.r;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.r = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            } else if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.p, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        tz0.a().getClass();
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        k05 k05Var = this.o;
        na4 na4Var = k05Var.b;
        Typeface typeface = (Typeface) na4Var.q;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) na4Var.o, k05Var.a * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.n;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        k05 k05Var = this.o;
        vv2 vv2VarB = k05Var.b();
        int iA = vv2VarB.a(14);
        this.q = fAbs / (iA != 0 ? ((ByteBuffer) vv2VarB.q).getShort(iA + vv2VarB.n) : (short) 0);
        vv2 vv2VarB2 = k05Var.b();
        int iA2 = vv2VarB2.a(14);
        if (iA2 != 0) {
            ((ByteBuffer) vv2VarB2.q).getShort(iA2 + vv2VarB2.n);
        }
        vv2 vv2VarB3 = k05Var.b();
        int iA3 = vv2VarB3.a(12);
        short s = (short) ((iA3 != 0 ? ((ByteBuffer) vv2VarB3.q).getShort(iA3 + vv2VarB3.n) : (short) 0) * this.q);
        this.p = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
