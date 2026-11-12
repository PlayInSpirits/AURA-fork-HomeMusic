package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mo3 {
    public final TextPaint a;
    public final TextDirectionHeuristic b;
    public final int c;
    public final int d;

    public mo3(TextPaint r3, TextDirectionHeuristic r4, int r5, int r6) {
        if (Build.VERSION.SDK_INT < 29) goto L5;
        sr0.p(sr0.k(sr0.y(sr0.j(sr0.l(r3), r5), r6), r4));
    L5:
        this.a = r3;
        this.b = r4;
        this.c = r5;
        this.d = r6;
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L5;
        return true;
    L5:
        if ((r5 instanceof mo3) == false) goto L49;
        mo3 r6 = (mo3) r5;
        int r0 = r6.c;
        TextPaint r1 = r6.a;
        if (this.c == r0) goto L11;
        return false;
    L11:
        if (this.d != r6.d) goto L51;
        TextPaint r2 = this.a;
        if (r2.getTextSize() == r1.getTextSize()) goto L17;
        return false;
    L17:
        if (r2.getTextScaleX() == r1.getTextScaleX()) goto L20;
        return false;
    L20:
        if (r2.getTextSkewX() == r1.getTextSkewX()) goto L23;
        return false;
    L23:
        if (r2.getLetterSpacing() == r1.getLetterSpacing()) goto L26;
        return false;
    L26:
        if (TextUtils.equals(r2.getFontFeatureSettings(), r1.getFontFeatureSettings()) == true) goto L29;
        return false;
    L29:
        if (r2.getFlags() == r1.getFlags()) goto L32;
        return false;
    L32:
        if (r2.getTextLocales().equals(r1.getTextLocales()) == true) goto L35;
        return false;
    L35:
        if (r2.getTypeface() != null) goto L40;
        if (r1.getTypeface() == null) goto L43;
        return false;
    L43:
        if (this.b != r6.b) goto L46;
        return true;
    L46:
        return false;
    L40:
        if (r2.getTypeface().equals(r1.getTypeface()) == true) goto L43;
        return false;
    L51:
        return false;
    L49:
        return false;
    }

    public final int hashCode() {
        TextPaint r0 = this.a;
        Float r2 = Float.valueOf(r0.getTextSize());
        Float r3 = Float.valueOf(r0.getTextScaleX());
        Float r4 = Float.valueOf(r0.getTextSkewX());
        Float r5 = Float.valueOf(r0.getLetterSpacing());
        Integer r6 = Integer.valueOf(r0.getFlags());
        LocaleList r7 = r0.getTextLocales();
        Typeface r8 = r0.getTypeface();
        Boolean r9 = Boolean.valueOf(r0.isElegantTextHeight());
        Integer r11 = Integer.valueOf(this.c);
        Integer r12 = Integer.valueOf(this.d);
        return Objects.hash(new Object[]{r2, r3, r4, r5, r6, r7, r8, r9, this.b, r11, r12});
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("{");
        StringBuilder r1 = new StringBuilder("textSize=");
        TextPaint r2 = this.a;
        r1.append(r2.getTextSize());
        r0.append(r1.toString());
        r0.append(", textScaleX=" + r2.getTextScaleX());
        r0.append(", textSkewX=" + r2.getTextSkewX());
        r0.append(", letterSpacing=" + r2.getLetterSpacing());
        r0.append(", elegantTextHeight=" + r2.isElegantTextHeight());
        r0.append(", textLocale=" + r2.getTextLocales());
        r0.append(", typeface=" + r2.getTypeface());
        if (Build.VERSION.SDK_INT < 26) goto L5;
        r0.append(", variationSettings=" + rg3.d(r2));
    L5:
        r0.append(", textDir=" + this.b);
        r0.append(", breakStrategy=" + this.c);
        r0.append(", hyphenationFrequency=" + this.d);
        r0.append("}");
        return r0.toString();
    }

    public mo3(PrecomputedText.Params r2) {
        this.a = sr0.n(r2);
        this.b = sr0.m(r2);
        this.c = sr0.c(r2);
        this.d = sr0.v(r2);
    }
}
