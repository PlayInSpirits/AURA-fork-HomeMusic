package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k71 extends bt {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(f42.a);

    @Override // defpackage.f42
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.bt
    public final Bitmap c(zs zsVar, Bitmap bitmap, int i, int i2) {
        return xw4.b(zsVar, bitmap, i, i2);
    }

    @Override // defpackage.f42
    public final boolean equals(Object obj) {
        return obj instanceof k71;
    }

    @Override // defpackage.f42
    public final int hashCode() {
        return 1572326941;
    }
}
