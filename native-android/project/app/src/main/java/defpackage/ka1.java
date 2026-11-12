package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ka1 extends MetricAffectingSpan {
    public final /* synthetic */ int n;
    public final Object o;

    public /* synthetic */ ka1(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint r2) {
        int r0 = this.n;
        Object r1 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r2.setTypeface((Typeface) r1);
        return;
    L6:
        r2.setFontFeatureSettings((String) r1);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint r2) {
        int r0 = this.n;
        Object r1 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r2.setTypeface((Typeface) r1);
        return;
    L6:
        r2.setFontFeatureSettings((String) r1);
    }
}
