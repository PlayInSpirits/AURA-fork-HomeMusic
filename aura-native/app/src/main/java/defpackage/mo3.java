/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import defpackage.rg3;
import defpackage.sr0;
import java.util.Objects;

public final class mo3 {
    public final TextPaint a;
    public final TextDirectionHeuristic b;
    public final int c;
    public final int d;

    public mo3(PrecomputedText.Params params) {
        this.a = sr0.n(params);
        this.b = sr0.m(params);
        this.c = sr0.c(params);
        this.d = sr0.v(params);
    }

    public mo3(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int n16, int n17) {
        if (Build.VERSION.SDK_INT >= 29) {
            sr0.p(sr0.k(sr0.y(sr0.j(sr0.l(textPaint), n16), n17), textDirectionHeuristic));
        }
        this.a = textPaint;
        this.b = textDirectionHeuristic;
        this.c = n16;
        this.d = n17;
    }

    public final boolean equals(Object object) {
        block3: {
            block2: {
                TextPaint textPaint;
                if (object == this) break block2;
                if (!(object instanceof mo3)) break block3;
                mo3 mo32 = (mo3)object;
                int n16 = mo32.c;
                object = mo32.a;
                if (this.c != n16 || this.d != mo32.d || (textPaint = this.a).getTextSize() != ((Paint)object).getTextSize() || textPaint.getTextScaleX() != ((Paint)object).getTextScaleX() || textPaint.getTextSkewX() != ((Paint)object).getTextSkewX() || textPaint.getLetterSpacing() != ((Paint)object).getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), ((Paint)object).getFontFeatureSettings()) || textPaint.getFlags() != ((Paint)object).getFlags() || !textPaint.getTextLocales().equals(((Paint)object).getTextLocales()) || (textPaint.getTypeface() != null ? !textPaint.getTypeface().equals(((Paint)object).getTypeface()) : ((Paint)object).getTypeface() != null) || this.b != mo32.b) break block3;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        TextPaint textPaint = this.a;
        float f16 = textPaint.getTextSize();
        float f17 = textPaint.getTextScaleX();
        float f18 = textPaint.getTextSkewX();
        float f19 = textPaint.getLetterSpacing();
        int n16 = textPaint.getFlags();
        LocaleList localeList = textPaint.getTextLocales();
        Typeface typeface = textPaint.getTypeface();
        boolean bl5 = textPaint.isElegantTextHeight();
        int n17 = this.c;
        int n18 = this.d;
        return Objects.hash(Float.valueOf(f16), Float.valueOf(f17), Float.valueOf(f18), Float.valueOf(f19), n16, localeList, typeface, bl5, this.b, n17, n18);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        StringBuilder stringBuilder2 = new StringBuilder("textSize=");
        Object object = this.a;
        stringBuilder2.append(((Paint)object).getTextSize());
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder(", textScaleX=");
        stringBuilder2.append(((Paint)object).getTextScaleX());
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder(", textSkewX=");
        stringBuilder2.append(((Paint)object).getTextSkewX());
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder(", letterSpacing=");
        stringBuilder2.append(((Paint)object).getLetterSpacing());
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder(", elegantTextHeight=");
        stringBuilder2.append(((Paint)object).isElegantTextHeight());
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder(", textLocale=");
        stringBuilder2.append(((Paint)object).getTextLocales());
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder(", typeface=");
        stringBuilder2.append(((Paint)object).getTypeface());
        stringBuilder.append(stringBuilder2.toString());
        if (Build.VERSION.SDK_INT >= 26) {
            stringBuilder2 = new StringBuilder(", variationSettings=");
            stringBuilder2.append(rg3.d((TextPaint)object));
            stringBuilder.append(stringBuilder2.toString());
        }
        object = new StringBuilder(", textDir=");
        ((StringBuilder)object).append(this.b);
        stringBuilder.append(((StringBuilder)object).toString());
        object = new StringBuilder(", breakStrategy=");
        ((StringBuilder)object).append(this.c);
        stringBuilder.append(((StringBuilder)object).toString());
        object = new StringBuilder(", hyphenationFrequency=");
        ((StringBuilder)object).append(this.d);
        stringBuilder.append(((StringBuilder)object).toString());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

