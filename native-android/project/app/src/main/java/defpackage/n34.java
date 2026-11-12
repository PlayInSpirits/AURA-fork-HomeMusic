package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n34 extends bt {
    public static final byte[] c = null;
    public final int b;

    static {
        c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(f42.a);
    }

    public n34(int r3) {
        if (r3 <= 0) goto L5;
        boolean r0 = true;
    L6:
        h12.d("roundingRadius must be greater than 0.", r0);
        this.b = r3;
        return;
    L5:
        r0 = false;
        goto L6
    }

    @Override // defpackage.f42
    public final void b(MessageDigest r2) {
        r2.update(c);
        r2.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }

    @Override // defpackage.bt
    public final Bitmap c(zs r1, Bitmap r2, int r3, int r4) {
        Paint r5 = xw4.a;
        int r0 = this.b;
        if (r0 <= 0) goto L5;
        boolean r6 = true;
    L6:
        h12.d("roundingRadius must be greater than 0.", r6);
        return xw4.c(r1, r2, new cx(r0));
    L5:
        r6 = false;
        goto L6
    }

    @Override // defpackage.f42
    public final boolean equals(Object r3) {
        if ((r3 instanceof n34) == true) goto L5;
    L8:
        return false;
    L5:
        if (this.b != ((n34) r3).b) goto L8;
        return true;
    }

    @Override // defpackage.f42
    public final int hashCode() {
        return e35.E(-569625254, e35.E(this.b, 17));
    }
}
