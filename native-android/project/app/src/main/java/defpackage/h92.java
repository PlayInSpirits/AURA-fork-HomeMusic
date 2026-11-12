package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h92 extends MetricAffectingSpan {
    public final float n;

    public h92(float r1) {
        this.n = r1;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint r1) {
        r1.setLetterSpacing(this.n);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint r1) {
        r1.setLetterSpacing(this.n);
    }
}
