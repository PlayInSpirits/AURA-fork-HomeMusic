package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qj1 extends bt {
    public static final byte[] f = null;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    static {
        f = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners".getBytes(f42.a);
    }

    public qj1(float r1, float r2, float r3, float r4) {
        this.b = r1;
        this.c = r2;
        this.d = r3;
        this.e = r4;
    }

    @Override // defpackage.f42
    public final void b(MessageDigest r3) {
        r3.update(f);
        r3.update(ByteBuffer.allocate(16).putFloat(this.b).putFloat(this.c).putFloat(this.d).putFloat(this.e).array());
    }

    @Override // defpackage.bt
    public final Bitmap c(zs r3, Bitmap r4, int r5, int r6) {
        return xw4.c(r3, r4, new v03(this.b, this.c, this.d, this.e));
    }

    @Override // defpackage.f42
    public final boolean equals(Object r4) {
        if ((r4 instanceof qj1) == false) goto L14;
        qj1 r5 = (qj1) r4;
        if (this.b != r5.b) goto L14;
        if (this.c != r5.c) goto L14;
        if (this.d != r5.d) goto L14;
        if (this.e != r5.e) goto L14;
        return true;
    L14:
        return false;
    }

    @Override // defpackage.f42
    public final int hashCode() {
        return e35.D(e35.D(e35.D(e35.E(-2013597734, e35.D(17, this.b)), this.c), this.d), this.e);
    }
}
