package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n34 extends bt {
    public static final byte[] c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(f42.a);
    public final int b;

    public n34(int i) {
        h12.d("roundingRadius must be greater than 0.", i > 0);
        this.b = i;
    }

    @Override // defpackage.f42
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }

    @Override // defpackage.bt
    public final Bitmap c(zs zsVar, Bitmap bitmap, int i, int i2) {
        Paint paint = xw4.a;
        int i3 = this.b;
        h12.d("roundingRadius must be greater than 0.", i3 > 0);
        return xw4.c(zsVar, bitmap, new cx(i3));
    }

    @Override // defpackage.f42
    public final boolean equals(Object obj) {
        return (obj instanceof n34) && this.b == ((n34) obj).b;
    }

    @Override // defpackage.f42
    public final int hashCode() {
        return e35.E(-569625254, e35.E(this.b, 17));
    }
}
