package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m00 extends bt {
    public static final byte[] b = null;

    static {
        b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(f42.a);
    }

    @Override // defpackage.f42
    public final void b(MessageDigest r1) {
        r1.update(b);
    }

    @Override // defpackage.bt
    public final Bitmap c(zs r7, Bitmap r8, int r9, int r10) {
        Paint r6 = xw4.a;
        if (r8.getWidth() == r9) goto L5;
    L7:
        Matrix r11 = new Matrix();
        float r2 = 0.0f;
        if ((r8.getWidth() * r10) <= (r8.getHeight() * r9)) goto L10;
        float r0 = r10 / r8.getHeight();
        r2 = (r9 - (r8.getWidth() * r0)) * 0.5f;
        float r1 = 0.0f;
    L11:
        r11.setScale(r0, r0);
        r11.postTranslate((int) (r2 + 0.5f), (int) (r1 + 0.5f));
        if (r8.getConfig() == null) goto L14;
        Bitmap.Config r3 = r8.getConfig();
    L15:
        Bitmap r12 = r7.h(r9, r10, r3);
        r12.setHasAlpha(r8.hasAlpha());
        xw4.a(r8, r12, r11);
        return r12;
    L14:
        r3 = Bitmap.Config.ARGB_8888;
        goto L15
    L10:
        r0 = r9 / r8.getWidth();
        r1 = (r10 - (r8.getHeight() * r0)) * 0.5f;
        goto L11
    L5:
        if (r8.getHeight() != r10) goto L7;
        return r8;
    }

    @Override // defpackage.f42
    public final boolean equals(Object r1) {
        return r1 instanceof m00;
    }

    @Override // defpackage.f42
    public final int hashCode() {
        return -599754482;
    }
}
