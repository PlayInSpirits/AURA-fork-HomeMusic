package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vv0 {
    public static final uv0 a = null;

    static {
        a = new uv0(19);
    }

    public static at a(zs r7, Drawable r8, int r9, int r10) {
        Drawable r11 = r8.getCurrent();
        boolean r1 = false;
        if ((r11 instanceof BitmapDrawable) == false) goto L6;
        Bitmap r12 = ((BitmapDrawable) r11).getBitmap();
    L35:
        if (r1 == true) goto L39;
        r7 = a;
    L39:
        return at.c(r7, r12);
    L6:
        if ((r11 instanceof Animatable) == false) goto L8;
        r12 = null;
        goto L35
    L8:
        if (r9 == Integer.MIN_VALUE) goto L10;
    L15:
        if (r10 != Integer.MIN_VALUE) goto L22;
        if (r11.getIntrinsicHeight() > 0) goto L22;
        if (Log.isLoggable("DrawableToBitmap", 5) == true) goto L20;
    L14:
        r12 = null;
    L30:
        r1 = true;
        goto L35
    L20:
        Log.w("DrawableToBitmap", "Unable to draw " + r11 + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
    L22:
        if (r11.getIntrinsicWidth() <= 0) goto L25;
        r9 = r11.getIntrinsicWidth();
    L25:
        if (r11.getIntrinsicHeight() <= 0) goto L27;
        r10 = r11.getIntrinsicHeight();
    L27:
        Lock r0 = xw4.b;
        r0.lock();
        Bitmap r3 = r7.h(r9, r10, Bitmap.Config.ARGB_8888);
        Canvas r4 = new Canvas(r3);     // Catch: Throwable -> L31
        r11.setBounds(0, 0, r9, r10);     // Catch: Throwable -> L31
        r11.draw(r4);     // Catch: Throwable -> L31
        r4.setBitmap(null);     // Catch: Throwable -> L31
        r0.unlock();
        r12 = r3;
    L31:
        th = move-exception;
        r0.unlock();
        throw th;
    L10:
        if (r11.getIntrinsicWidth() > 0) goto L15;
        if (Log.isLoggable("DrawableToBitmap", 5) == false) goto L14;
        Log.w("DrawableToBitmap", "Unable to draw " + r11 + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
        goto L14
    }
}
