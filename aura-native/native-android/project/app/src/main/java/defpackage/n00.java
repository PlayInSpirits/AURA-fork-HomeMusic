package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n00 extends bt {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(f42.a);

    @Override // defpackage.f42
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.bt
    public final Bitmap c(zs zsVar, Bitmap bitmap, int i, int i2) {
        Paint paint = xw4.a;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return xw4.b(zsVar, bitmap, i, i2);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    @Override // defpackage.f42
    public final boolean equals(Object obj) {
        return obj instanceof n00;
    }

    @Override // defpackage.f42
    public final int hashCode() {
        return -670243078;
    }
}
