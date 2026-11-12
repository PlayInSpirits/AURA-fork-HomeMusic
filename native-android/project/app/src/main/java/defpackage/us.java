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

    public us(Context r3) {
        super(new cj0[1], new ts[1]);
        this.o = r3;
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
    public final DecoderException i(Throwable r2) {
        return new ImageDecoderException("Unexpected decode error", r2);
    }

    @Override // defpackage.ve4
    public final DecoderException j(cj0 r6, dj0 r7, boolean r8) {
        ts r9 = (ts) r7;
        ByteBuffer r10 = r6.r;
        r10.getClass();
        rr2.w(r10.hasArray());
        if (r10.arrayOffset() != 0) goto L5;
        boolean r0 = true;
    L6:
        rr2.l(r0);
        int r1 = this.p;     // Catch: IOException -> L25 ParserException -> L27
        if (r1 != (-1)) goto L22;
        Context r5 = this.o;     // Catch: IOException -> L25 ParserException -> L27
        if (r5 == null) goto L21;
        Point r11 = f35.w(r5);     // Catch: IOException -> L25 ParserException -> L27
        int r2 = r11.x;     // Catch: IOException -> L25 ParserException -> L27
        int r12 = r11.y;     // Catch: IOException -> L25 ParserException -> L27
        tb1 r3 = r6.p;     // Catch: IOException -> L25 ParserException -> L27
        if (r3 == null) goto L20;
        int r4 = r3.M;     // Catch: IOException -> L25 ParserException -> L27
        if (r4 == (-1)) goto L17;
        r2 = r2 * r4;     // Catch: IOException -> L25 ParserException -> L27
    L17:
        int r13 = r3.N;     // Catch: IOException -> L25 ParserException -> L27
        if (r13 == (-1)) goto L20;
        r12 = r12 * r13;     // Catch: IOException -> L25 ParserException -> L27
    L20:
        r1 = (Math.max(r2, r12) * 2) - 1;     // Catch: IOException -> L25 ParserException -> L27
        goto L22
    L21:
        r1 = 4096;
    L22:
        r9.s = gb.s(r10.array(), r10.remaining(), r1);     // Catch: IOException -> L25 ParserException -> L27
        r9.p = r6.t;
        return null;
    L27:
        e = move-exception;
        return new ImageDecoderException("Could not decode image data with BitmapFactory.", e);
    L25:
        e = move-exception;
        return new ImageDecoderException(e);
    L5:
        r0 = false;
        goto L6
    }
}
