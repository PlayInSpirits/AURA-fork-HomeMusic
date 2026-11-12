package defpackage;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class md implements t04 {
    public final /* synthetic */ int a;
    public final wo0 b;

    public /* synthetic */ md(wo0 wo0Var, int i) {
        this.a = i;
        this.b = wo0Var;
    }

    @Override // defpackage.t04
    public final boolean a(Object obj, db3 db3Var) throws IOException {
        int i = this.a;
        wo0 wo0Var = this.b;
        switch (i) {
            case 0:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeC = kb4.C((ArrayList) wo0Var.n, (ByteBuffer) obj);
                if (imageHeaderParser$ImageTypeC != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                    return Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeC == ImageHeaderParser$ImageType.ANIMATED_AVIF;
                }
                return true;
            default:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeB = kb4.B((ArrayList) wo0Var.n, (InputStream) obj, (qj0) wo0Var.o);
                if (imageHeaderParser$ImageTypeB != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                    return Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeB == ImageHeaderParser$ImageType.ANIMATED_AVIF;
                }
                return true;
        }
    }

    @Override // defpackage.t04
    public final q04 b(Object obj, int i, int i2, db3 db3Var) {
        switch (this.a) {
            case 0:
                return wo0.d(ImageDecoder.createSource((ByteBuffer) obj), i, i2, db3Var);
            default:
                return wo0.d(ImageDecoder.createSource(vw.b((InputStream) obj)), i, i2, db3Var);
        }
    }
}
