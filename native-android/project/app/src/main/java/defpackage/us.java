package defpackage;

import android.content.Context;
import android.graphics.Point;
import androidx.media3.common.ParserException;
import androidx.media3.decoder.DecoderException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class us extends ve4 {
    public final Context o;
    public final int p;

    public us(Context context) {
        super(new cj0[1], new ts[1]);
        this.o = context;
        this.p = -1;
    }

    @Override // defpackage.ve4
    public final cj0 g() {
        return new cj0(1, 0);
    }

    @Override // defpackage.ve4
    public final dj0 h() {
        return new ts(this);
    }

    @Override // defpackage.ve4
    public final DecoderException i(Throwable th) {
        return new ImageDecoderException("Unexpected decode error", th);
    }

    @Override // defpackage.ve4
    public final DecoderException j(cj0 cj0Var, dj0 dj0Var, boolean z) {
        ts tsVar = (ts) dj0Var;
        ByteBuffer byteBuffer = cj0Var.r;
        byteBuffer.getClass();
        rr2.w(byteBuffer.hasArray());
        rr2.l(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.p;
            if (iMax == -1) {
                Context context = this.o;
                if (context != null) {
                    Point pointW = f35.w(context);
                    int i = pointW.x;
                    int i2 = pointW.y;
                    tb1 tb1Var = cj0Var.p;
                    if (tb1Var != null) {
                        int i3 = tb1Var.M;
                        if (i3 != -1) {
                            i *= i3;
                        }
                        int i4 = tb1Var.N;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                    }
                    iMax = (Math.max(i, i2) * 2) - 1;
                } else {
                    iMax = 4096;
                }
            }
            tsVar.s = gb.s(byteBuffer.array(), byteBuffer.remaining(), iMax);
            tsVar.p = cj0Var.t;
            return null;
        } catch (ParserException e) {
            return new ImageDecoderException("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new ImageDecoderException(e2);
        }
    }
}
