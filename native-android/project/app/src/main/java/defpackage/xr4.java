package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xr4 {
    public float c;
    public float d;
    public final WeakReference f;
    public rr4 g;
    public final TextPaint a = new TextPaint(1);
    public final h20 b = new h20(1, this);
    public boolean e = true;

    public xr4(wr4 wr4Var) {
        this.f = new WeakReference(null);
        this.f = new WeakReference(wr4Var);
    }

    public final float a(String str) {
        if (!this.e) {
            return this.c;
        }
        b(str);
        return this.c;
    }

    public final void b(String str) {
        TextPaint textPaint = this.a;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.e = false;
    }

    public final void c(rr4 rr4Var, Context context) {
        if (this.g != rr4Var) {
            this.g = rr4Var;
            WeakReference weakReference = this.f;
            if (rr4Var != null) {
                TextPaint textPaint = this.a;
                h20 h20Var = this.b;
                rr4Var.f(context, textPaint, h20Var);
                wr4 wr4Var = (wr4) weakReference.get();
                if (wr4Var != null) {
                    textPaint.drawableState = wr4Var.getState();
                }
                rr4Var.e(context, textPaint, h20Var);
                this.e = true;
            }
            wr4 wr4Var2 = (wr4) weakReference.get();
            if (wr4Var2 != null) {
                wr4Var2.a();
                wr4Var2.onStateChange(wr4Var2.getState());
            }
        }
    }
}
