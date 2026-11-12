package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ir extends MetricAffectingSpan {
    public final /* synthetic */ int n;
    public final float o;

    public /* synthetic */ ir(int r1, float r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint r4) {
        int r0 = this.n;
        float r3 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r4.setTextSkewX(r4.getTextSkewX() + r3);
        return;
    L6:
        r4.baselineShift += (int) Math.ceil(r4.ascent() * r3);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint r4) {
        int r0 = this.n;
        float r3 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r4.setTextSkewX(r4.getTextSkewX() + r3);
        return;
    L6:
        r4.baselineShift += (int) Math.ceil(r4.ascent() * r3);
    }
}
