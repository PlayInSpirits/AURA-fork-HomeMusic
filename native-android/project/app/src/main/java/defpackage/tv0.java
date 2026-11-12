package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tv0 extends CharacterStyle implements UpdateAppearance {
    public final q05 n;

    public tv0(q05 r1) {
        this.n = r1;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint r4) {
        if (r4 == null) goto L29;
        c71 r0 = c71.d;
        q05 r3 = this.n;
        if (h12.c(r3, r0) == false) goto L8;
        r4.setStyle(Paint.Style.FILL);
        return;
    L8:
        if ((r3 instanceof ym4) == false) goto L27;
        r4.setStyle(Paint.Style.STROKE);
        ym4 r5 = (ym4) r3;
        r4.setStrokeWidth(r5.d);
        r4.setStrokeMiter(r5.e);
        int r1 = r5.g;
        if (r1 != 0) goto L12;
        Paint.Join r2 = Paint.Join.MITER;
    L17:
        r4.setStrokeJoin(r2);
        int r6 = r5.f;
        if (r6 != 0) goto L20;
        Paint.Cap r7 = Paint.Cap.BUTT;
    L25:
        r4.setStrokeCap(r7);
        r4.setPathEffect(null);
        return;
    L20:
        if (r6 != 1) goto L22;
        r7 = Paint.Cap.ROUND;
        goto L25
    L22:
        if (r6 != 2) goto L24;
        r7 = Paint.Cap.SQUARE;
        goto L25
    L24:
        r7 = Paint.Cap.BUTT;
        goto L25
    L12:
        if (r1 != 1) goto L14;
        r2 = Paint.Join.ROUND;
        goto L17
    L14:
        if (r1 != 2) goto L16;
        r2 = Paint.Join.BEVEL;
        goto L17
    L16:
        r2 = Paint.Join.MITER;
        goto L17
    L27:
        er1.n();
        return;
    }
}
