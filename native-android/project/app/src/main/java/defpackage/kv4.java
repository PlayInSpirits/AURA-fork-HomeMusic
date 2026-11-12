package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kv4 extends fi2 implements wr4 {
    public CharSequence K;
    public final Context L;
    public final Paint.FontMetrics M;
    public final xr4 N;
    public final ot O;
    public final Rect P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public float W;
    public float X;
    public float Y;
    public float Z;

    public kv4(Context r3, int r4) {
        super(r3, null, 0, r4);
        this.M = new Paint.FontMetrics();
        xr4 r5 = new xr4(this);
        this.N = r5;
        this.O = new ot(3, this);
        this.P = new Rect();
        this.W = 1.0f;
        this.X = 1.0f;
        this.Y = 0.5f;
        this.Z = 1.0f;
        this.L = r3;
        float r2 = r3.getResources().getDisplayMetrics().density;
        TextPaint r6 = r5.a;
        r6.density = r2;
        r6.setTextAlign(Paint.Align.CENTER);
    }

    @Override // defpackage.fi2, android.graphics.drawable.Drawable
    public final void draw(Canvas r11) {
        r11.save();
        float r0 = v();
        float r1 = (float) (-((Math.sqrt(2.0d) * this.U) - ((double) this.U)));
        r11.scale(this.W, this.X, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.Y) + getBounds().top);
        r11.translate(r0, r1);
        super.draw(r11);
        if (this.K != null) goto L5;
        Canvas r3 = r11;
    L9:
        r3.restore();
        return;
    L5:
        Rect r2 = getBounds();
        float r4 = r2.centerY();
        xr4 r5 = this.N;
        TextPaint r9 = r5.a;
        Paint.FontMetrics r6 = this.M;
        r9.getFontMetrics(r6);
        int r7 = (int) (r4 - ((r6.descent + r6.ascent) / 2.0f));
        if (r5.g == null) goto L8;
        r9.drawableState = getState();
        r5.g.e(this.L, r5.a, r5.b);
        r9.setAlpha((int) (this.Z * 255.0f));
    L8:
        CharSequence r8 = this.K;
        r3 = r11;
        r3.drawText(r8, 0, r8.length(), r2.centerX(), r7, r9);
        goto L9
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.N.a.getTextSize(), this.S);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float r0 = this.Q * 2;
        CharSequence r1 = this.K;
        if (r1 != null) goto L5;
        float r2 = 0.0f;
    L7:
        return (int) Math.max(r0 + r2, this.R);
    L5:
        r2 = this.N.a(r1.toString());
        goto L7
    }

    @Override // defpackage.fi2, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect r2) {
        super.onBoundsChange(r2);
        zc1 r3 = this.n.a.g();
        r3.k = w();
        setShapeAppearanceModel(r3.a());
    }

    public final float v() {
        Rect r0 = this.P;
        if ((((r0.right - getBounds().right) - this.V) - this.T) >= 0) goto L8;
        int r1 = ((r0.right - getBounds().right) - this.V) - this.T;
    L6:
        return r1;
    L8:
        if ((((r0.left - getBounds().left) - this.V) + this.T) <= 0) goto L10;
        r1 = ((r0.left - getBounds().left) - this.V) + this.T;
        goto L6
    L10:
        return 0.0f;
    }

    public final h83 w() {
        float r0 = -v();
        float r1 = ((float) (getBounds().width() - (Math.sqrt(2.0d) * this.U))) / 2.0f;
        return new h83(new ng2(this.U), Math.min(Math.max(r0, -r1), r1));
    }
}
