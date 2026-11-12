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

    public kv4(Context context, int i) {
        super(context, null, 0, i);
        this.M = new Paint.FontMetrics();
        xr4 xr4Var = new xr4(this);
        this.N = xr4Var;
        this.O = new ot(3, this);
        this.P = new Rect();
        this.W = 1.0f;
        this.X = 1.0f;
        this.Y = 0.5f;
        this.Z = 1.0f;
        this.L = context;
        float f = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = xr4Var.a;
        textPaint.density = f;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    @Override // defpackage.fi2, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        float fV = v();
        float f = (float) (-((Math.sqrt(2.0d) * ((double) this.U)) - ((double) this.U)));
        canvas.scale(this.W, this.X, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.Y) + getBounds().top);
        canvas.translate(fV, f);
        super.draw(canvas);
        if (this.K == null) {
            canvas2 = canvas;
        } else {
            Rect bounds = getBounds();
            float fCenterY = bounds.centerY();
            xr4 xr4Var = this.N;
            TextPaint textPaint = xr4Var.a;
            Paint.FontMetrics fontMetrics = this.M;
            textPaint.getFontMetrics(fontMetrics);
            int i = (int) (fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            if (xr4Var.g != null) {
                textPaint.drawableState = getState();
                xr4Var.g.e(this.L, xr4Var.a, xr4Var.b);
                textPaint.setAlpha((int) (this.Z * 255.0f));
            }
            CharSequence charSequence = this.K;
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), i, textPaint);
        }
        canvas2.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.N.a.getTextSize(), this.S);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.Q * 2;
        CharSequence charSequence = this.K;
        return (int) Math.max(f + (charSequence == null ? 0.0f : this.N.a(charSequence.toString())), this.R);
    }

    @Override // defpackage.fi2, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        zc1 zc1VarG = this.n.a.g();
        zc1VarG.k = w();
        setShapeAppearanceModel(zc1VarG.a());
    }

    public final float v() {
        int i;
        Rect rect = this.P;
        if (((rect.right - getBounds().right) - this.V) - this.T < 0) {
            i = ((rect.right - getBounds().right) - this.V) - this.T;
        } else {
            if (((rect.left - getBounds().left) - this.V) + this.T <= 0) {
                return 0.0f;
            }
            i = ((rect.left - getBounds().left) - this.V) + this.T;
        }
        return i;
    }

    public final h83 w() {
        float f = -v();
        float fWidth = ((float) (((double) getBounds().width()) - (Math.sqrt(2.0d) * ((double) this.U)))) / 2.0f;
        return new h83(new ng2(this.U), Math.min(Math.max(f, -fWidth), fWidth));
    }
}
