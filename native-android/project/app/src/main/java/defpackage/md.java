package defpackage;

import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class md implements t04 {
    public final /* synthetic */ int a;
    public final wo0 b;

    public /* synthetic */ md(wo0 r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.t04
    public final boolean a(Object r4, db3 r5) {
        int r6 = this.a;
        wo0 r3 = this.b;
        switch(r6) {
            case 0: goto L13;
            default: goto L4;
        };
    L4:
        ArrayList r7 = (ArrayList) r3.n;
        ImageHeaderParser$ImageType r8 = kb4.B(r7, (InputStream) r4, (qj0) r3.o);
        if (r8 != ImageHeaderParser$ImageType.ANIMATED_WEBP) goto L7;
        return true;
    L7:
        if (Build.VERSION.SDK_INT < 31) goto L12;
        if (r8 != ImageHeaderParser$ImageType.ANIMATED_AVIF) goto L12;
        return true;
    L12:
        return false;
    L13:
        ArrayList r9 = (ArrayList) r3.n;
        ImageHeaderParser$ImageType r10 = kb4.C(r9, (ByteBuffer) r4);
        if (r10 != ImageHeaderParser$ImageType.ANIMATED_WEBP) goto L16;
        return true;
    L16:
        if (Build.VERSION.SDK_INT < 31) goto L21;
        if (r10 != ImageHeaderParser$ImageType.ANIMATED_AVIF) goto L21;
        return true;
    L21:
        return false;
    }

    @Override // defpackage.t04
    public final q04 b(Object r1, int r2, int r3, db3 r4) {
        switch(this.a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return wo0.d(i3.e(vw.b((InputStream) r1)), r2, r3, r4);
    L7:
        return wo0.d(i3.e((ByteBuffer) r1), r2, r3, r4);
    }
}
