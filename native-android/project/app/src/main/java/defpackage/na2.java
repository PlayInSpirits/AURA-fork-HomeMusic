package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class na2 implements LineHeightSpan {
    public final float n;

    public na2(float r1) {
        this.n = r1;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence r1, int r2, int r3, int r4, int r5, Paint.FontMetricsInt r6) {
        int r7 = r6.descent - r6.ascent;
        if (r7 > 0) goto L5;
        return;
    L5:
        int r0 = (int) Math.ceil(this.n);
        int r8 = (int) Math.ceil(((double) r6.descent) * ((double) ((r0 * 1.0f) / r7)));
        r6.descent = r8;
        r6.ascent = r8 - r0;
    }
}
