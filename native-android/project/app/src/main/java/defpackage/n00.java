package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n00 extends bt {
    public static final byte[] b = null;

    static {
        b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(f42.a);
    }

    @Override // defpackage.f42
    public final void b(MessageDigest r1) {
        r1.update(b);
    }

    @Override // defpackage.bt
    public final Bitmap c(zs r3, Bitmap r4, int r5, int r6) {
        Paint r2 = xw4.a;
        if (r4.getWidth() > r5) goto L11;
        if (r4.getHeight() > r6) goto L11;
        if (Log.isLoggable("TransformationUtils", 2) == false) goto L9;
        Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
    L9:
        return r4;
    L11:
        if (Log.isLoggable("TransformationUtils", 2) == false) goto L14;
        Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
    L14:
        return xw4.b(r3, r4, r5, r6);
    }

    @Override // defpackage.f42
    public final boolean equals(Object r1) {
        return r1 instanceof n00;
    }

    @Override // defpackage.f42
    public final int hashCode() {
        return -670243078;
    }
}
