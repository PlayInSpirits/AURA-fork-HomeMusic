package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g31 implements wv1 {
    @Override // defpackage.wv1
    public final ImageHeaderParser$ImageType a(ByteBuffer r1) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.wv1
    public final int b(InputStream r1, qj0 r2) {
        f31 r0 = new f31(r1);
        b31 r3 = r0.c("Orientation");
        if (r3 != null) goto L12;
    L7:
        int r4 = 1;
    L8:
        if (r4 != 0) goto L14;
        return -1;
    L14:
        return r4;
    L12:
        r4 = r3.e(r0.f);     // Catch: NumberFormatException -> L11
        goto L8
    }

    @Override // defpackage.wv1
    public final int c(ByteBuffer r2, qj0 r3) {
        AtomicReference r0 = vw.a;
        return b(new uw(r2), r3);
    }

    @Override // defpackage.wv1
    public final ImageHeaderParser$ImageType d(InputStream r1) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
