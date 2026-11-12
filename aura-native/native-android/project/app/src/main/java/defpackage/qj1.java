package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qj1 extends bt {
    public static final byte[] f = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners".getBytes(f42.a);
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public qj1(float f2, float f3, float f4, float f5) {
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    @Override // defpackage.f42
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.b).putFloat(this.c).putFloat(this.d).putFloat(this.e).array());
    }

    @Override // defpackage.bt
    public final Bitmap c(zs zsVar, Bitmap bitmap, int i, int i2) {
        return xw4.c(zsVar, bitmap, new v03(this.b, this.c, this.d, this.e));
    }

    @Override // defpackage.f42
    public final boolean equals(Object obj) {
        if (obj instanceof qj1) {
            qj1 qj1Var = (qj1) obj;
            if (this.b == qj1Var.b && this.c == qj1Var.c && this.d == qj1Var.d && this.e == qj1Var.e) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.f42
    public final int hashCode() {
        return e35.D(e35.D(e35.D(e35.E(-2013597734, e35.D(17, this.b)), this.c), this.d), this.e);
    }
}
