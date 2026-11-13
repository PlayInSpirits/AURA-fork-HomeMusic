package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class h92 extends MetricAffectingSpan {
    public final float n;

    public h92(float f) {
        this.n = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.n);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.n);
    }
}
