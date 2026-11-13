/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

public final class na2
implements LineHeightSpan {
    public final float n;

    public na2(float f16) {
        this.n = f16;
    }

    @Override
    public final void chooseHeight(CharSequence charSequence, int n16, int n17, int n18, int n19, Paint.FontMetricsInt fontMetricsInt) {
        n17 = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (n17 <= 0) {
            return;
        }
        n16 = (int)Math.ceil(this.n);
        float f16 = (float)n16 * 1.0f / (float)n17;
        fontMetricsInt.descent = n17 = (int)Math.ceil((double)fontMetricsInt.descent * (double)f16);
        fontMetricsInt.ascent = n17 - n16;
    }
}

