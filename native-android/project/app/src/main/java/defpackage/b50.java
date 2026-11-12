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

    public b50(Resources r1, Bitmap r2) {
        super(r1, r2);
        this.a = new Paint(1);
        this.b = new Paint(1);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas r12) {
        int r0 = getBounds().width();
        int r1 = getBounds().height();
        float r5 = r0 * 0.5f;
        float r6 = r1 * 0.5f;
        float r7 = Math.min(r0, r1) * 0.5f;
        SweepGradient r2 = new SweepGradient(r5, r6, new int[]{-65536, -65281, -16776961, -16711681, -16711936, -256, -65536}, new float[]{0.0f, 0.166f, 0.333f, 0.499f, 0.666f, 0.833f, 0.999f});
        Paint r3 = this.a;
        r3.setShader(r2);
        RadialGradient r4 = new RadialGradient(r5, r6, r7, -1, 16777215, Shader.TileMode.CLAMP);
        Paint r11 = this.b;
        r11.setShader(r4);
        r12.drawCircle(r5, r6, r7, r3);
        r12.drawCircle(r5, r6, r7, r11);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int r1) {
        this.a.setAlpha(r1);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r1) {
        this.a.setColorFilter(r1);
    }
}
