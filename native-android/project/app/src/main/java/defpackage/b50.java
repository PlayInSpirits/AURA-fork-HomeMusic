package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b50 extends BitmapDrawable {
    public final Paint a;
    public final Paint b;

    public b50(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
        this.a = new Paint(1);
        this.b = new Paint(1);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        float f = iWidth * 0.5f;
        float f2 = iHeight * 0.5f;
        float fMin = Math.min(iWidth, iHeight) * 0.5f;
        SweepGradient sweepGradient = new SweepGradient(f, f2, new int[]{-65536, -65281, -16776961, -16711681, -16711936, -256, -65536}, new float[]{0.0f, 0.166f, 0.333f, 0.499f, 0.666f, 0.833f, 0.999f});
        Paint paint = this.a;
        paint.setShader(sweepGradient);
        RadialGradient radialGradient = new RadialGradient(f, f2, fMin, -1, 16777215, Shader.TileMode.CLAMP);
        Paint paint2 = this.b;
        paint2.setShader(radialGradient);
        canvas.drawCircle(f, f2, fMin, paint);
        canvas.drawCircle(f, f2, fMin, paint2);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
