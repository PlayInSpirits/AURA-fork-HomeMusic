package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i92 extends MetricAffectingSpan {
    public final float n;

    public i92(float r1) {
        this.n = r1;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint r3) {
        float r0 = r3.getTextSize();
        float r1 = r3.getTextScaleX() * r0;
        if (r1 != 0.0f) goto L5;
        return;
    L5:
        r3.setLetterSpacing(this.n / r1);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint r3) {
        float r0 = r3.getTextSize();
        float r1 = r3.getTextScaleX() * r0;
        if (r1 != 0.0f) goto L5;
        return;
    L5:
        r3.setLetterSpacing(this.n / r1);
    }
}
