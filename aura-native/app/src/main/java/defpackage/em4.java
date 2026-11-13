package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class em4 implements t04 {
    public final ArrayList a;
    public final rw b;
    public final qj0 c;

    public em4(ArrayList arrayList, rw rwVar, qj0 qj0Var) {
        this.a = arrayList;
        this.b = rwVar;
        this.c = qj0Var;
    }

    @Override // defpackage.t04
    public final boolean a(Object obj, db3 db3Var) {
        return !((Boolean) db3Var.c(ei1.b)).booleanValue() && kb4.B(this.a, (InputStream) obj, this.c) == ImageHeaderParser$ImageType.GIF;
    }

    @Override // defpackage.t04
    public final q04 b(Object obj, int i, int i2, db3 db3Var) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.b.b(ByteBuffer.wrap(bArr), i, i2, db3Var);
    }
}
