package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class em4 implements t04 {
    public final ArrayList a;
    public final rw b;
    public final qj0 c;

    public em4(ArrayList r1, rw r2, qj0 r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    @Override // defpackage.t04
    public final boolean a(Object r2, db3 r3) {
        InputStream r4 = (InputStream) r2;
        if (((Boolean) r3.c(ei1.b)).booleanValue() == false) goto L5;
        return false;
    L5:
        if (kb4.B(this.a, r4, this.c) != ImageHeaderParser$ImageType.GIF) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.t04
    public final q04 b(Object r6, int r7, int r8, db3 r9) {
        InputStream r10 = (InputStream) r6;
        ByteArrayOutputStream r0 = new ByteArrayOutputStream(16384);
        byte[] r1 = new byte[16384];     // Catch: IOException -> L7
    L4:
        int r3 = r10.read(r1);     // Catch: IOException -> L7
        if (r3 == (-1)) goto L9;
        r0.write(r1, 0, r3);     // Catch: IOException -> L7
        goto L4
    L9:
        r0.flush();     // Catch: IOException -> L7
        byte[] r11 = r0.toByteArray();
    L15:
        if (r11 != null) goto L18;
        return null;
    L18:
        return this.b.b(ByteBuffer.wrap(r11), r7, r8, r9);
    L7:
        e = move-exception;
        if (Log.isLoggable("StreamGifDecoder", 5) == false) goto L14;
        Log.w("StreamGifDecoder", "Error reading data from stream", e);
    L14:
        r11 = null;
        goto L15
    }
}
