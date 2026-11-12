package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g31 implements wv1 {
    @Override // defpackage.wv1
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.wv1
    public final int b(InputStream inputStream, qj0 qj0Var) {
        int iE;
        f31 f31Var = new f31(inputStream);
        b31 b31VarC = f31Var.c("Orientation");
        if (b31VarC == null) {
            iE = 1;
        } else {
            try {
                iE = b31VarC.e(f31Var.f);
            } catch (NumberFormatException unused) {
                iE = 1;
            }
        }
        if (iE == 0) {
            return -1;
        }
        return iE;
    }

    @Override // defpackage.wv1
    public final int c(ByteBuffer byteBuffer, qj0 qj0Var) {
        AtomicReference atomicReference = vw.a;
        return b(new uw(byteBuffer), qj0Var);
    }

    @Override // defpackage.wv1
    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
