package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tv0 extends CharacterStyle implements UpdateAppearance {
    public final q05 n;

    public tv0(q05 q05Var) {
        this.n = q05Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            c71 c71Var = c71.d;
            q05 q05Var = this.n;
            if (h12.c(q05Var, c71Var)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(q05Var instanceof ym4)) {
                er1.n();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            ym4 ym4Var = (ym4) q05Var;
            textPaint.setStrokeWidth(ym4Var.d);
            textPaint.setStrokeMiter(ym4Var.e);
            int i = ym4Var.g;
            if (i == 0) {
                join = Paint.Join.MITER;
            } else if (i == 1) {
                join = Paint.Join.ROUND;
            } else {
                join = i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
            }
            textPaint.setStrokeJoin(join);
            int i2 = ym4Var.f;
            if (i2 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i2 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
            }
            textPaint.setStrokeCap(cap);
            textPaint.setPathEffect(null);
        }
    }
}
