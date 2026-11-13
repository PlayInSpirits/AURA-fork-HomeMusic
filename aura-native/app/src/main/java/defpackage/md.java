package defpackage;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class md implements t04 {
    public final /* synthetic */ int a;
    public final wo0 b;

    public /* synthetic */ md(wo0 wo0Var, int i) {
        this.a = i;
        this.b = wo0Var;
    }

    @Override // defpackage.t04
    public final boolean a(Object obj, db3 db3Var) {
        int i = this.a;
        wo0 wo0Var = this.b;
        switch (i) {
            case 0:
                ImageHeaderParser$ImageType C = kb4.C((ArrayList) wo0Var.n, (ByteBuffer) obj);
                if (C != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                    if (Build.VERSION.SDK_INT < 31 || C != ImageHeaderParser$ImageType.ANIMATED_AVIF) {
                        break;
                    }
                }
                break;
            default:
                ImageHeaderParser$ImageType B = kb4.B((ArrayList) wo0Var.n, (InputStream) obj, (qj0) wo0Var.o);
                if (B != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                    if (Build.VERSION.SDK_INT < 31 || B != ImageHeaderParser$ImageType.ANIMATED_AVIF) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // defpackage.t04
    public final q04 b(Object obj, int i, int i2, db3 db3Var) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        switch (this.a) {
            case 0:
                createSource = ImageDecoder.createSource((ByteBuffer) obj);
                return wo0.d(createSource, i, i2, db3Var);
            default:
                createSource2 = ImageDecoder.createSource(vw.b((InputStream) obj));
                return wo0.d(createSource2, i, i2, db3Var);
        }
    }
}
