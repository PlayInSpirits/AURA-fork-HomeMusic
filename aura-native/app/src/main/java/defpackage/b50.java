/*
 * Decompiled with CFR 0.152.
 */
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

public final class b50
extends BitmapDrawable {
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);

    public b50(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override
    public final void draw(Canvas canvas) {
        int n16 = this.getBounds().width();
        int n17 = this.getBounds().height();
        float f16 = (float)n16 * 0.5f;
        float f17 = (float)n17 * 0.5f;
        float f18 = (float)Math.min(n16, n17) * 0.5f;
        Object object = new SweepGradient(f16, f17, new int[]{-65536, -65281, -16776961, -16711681, -16711936, -256, -65536}, new float[]{0.0f, 0.166f, 0.333f, 0.499f, 0.666f, 0.833f, 0.999f});
        Paint paint = this.a;
        paint.setShader((Shader)object);
        RadialGradient radialGradient = new RadialGradient(f16, f17, f18, -1, 0xFFFFFF, Shader.TileMode.CLAMP);
        object = this.b;
        ((Paint)object).setShader(radialGradient);
        canvas.drawCircle(f16, f17, f18, paint);
        canvas.drawCircle(f16, f17, f18, (Paint)object);
    }

    @Override
    public final int getOpacity() {
        return -1;
    }

    @Override
    public final void setAlpha(int n16) {
        this.a.setAlpha(n16);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}

