package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ss implements w04 {
    public static final ab3 o = null;
    public static final ab3 p = null;
    public final qj0 n;

    static {
        o = ab3.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
        p = new ab3("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, ab3.e);
    }

    public ss(qj0 r1) {
        this.n = r1;
    }

    @Override // defpackage.c11
    public final boolean i(Object r9, File r10, db3 r11) {
        Bitmap r12 = (Bitmap) ((q04) r9).get();
        ab3 r1 = p;
        Bitmap.CompressFormat r2 = (Bitmap.CompressFormat) r11.c(r1);
        if (r2 == null) goto L6;
    L9:
        r12.getWidth();
        r12.getHeight();
        int r3 = ee2.b;
        long r4 = SystemClock.elapsedRealtimeNanos();
        int r5 = ((Integer) r11.c(o)).intValue();
        OutputStream r6 = null;
        FileOutputStream r7 = new FileOutputStream(r10);     // Catch: Throwable -> L23 IOException -> L25
        qj0 r8 = this.n;
        if (r8 != null) goto L55;
        r6 = r7;
    L20:
        r12.compress(r2, r5, r6);     // Catch: Throwable -> L23 IOException -> L25
        r6.close();     // Catch: Throwable -> L23 IOException -> L25
        r6.close();     // Catch: IOException -> L43 Throwable -> L40
    L22:
        boolean r13 = true;
    L34:
        if (Log.isLoggable("BitmapEncoder", 2) == false) goto L36;
        Log.v("BitmapEncoder", "Compressed with type: " + r2 + " of size " + e35.v(r12) + " in " + ee2.a(r4) + ", options format: " + r11.c(r1) + ", hasAlpha: " + r12.hasAlpha());
    L36:
        return r13;
    L55:
        r6 = new dw(r7, r8);     // Catch: Throwable -> L15 IOException -> L17
        goto L20
    L17:
        e = e;
        r6 = r7;
    L28:
        if (Log.isLoggable("BitmapEncoder", 3) == false) goto L30;
        Log.d("BitmapEncoder", "Failed to encode Bitmap", e);     // Catch: Throwable -> L23
    L30:
        if (r6 != null) goto L50;
    L32:
        r13 = false;
        goto L34
    L50:
        r6.close();     // Catch: IOException -> L45 Throwable -> L40
    L15:
        th = th;
        r6 = r7;
    L37:
        if (r6 != null) goto L48;
    L42:
        throw th;
    L48:
        r6.close();     // Catch: Throwable -> L40 IOException -> L44
    L23:
        th = th;
    L25:
        e = e;
    L40:
        th = move-exception;
        throw th;
    L6:
        if (r12.hasAlpha() == false) goto L8;
        r2 = Bitmap.CompressFormat.PNG;
        goto L9
    L8:
        r2 = Bitmap.CompressFormat.JPEG;
        goto L9
    }

    @Override // defpackage.w04
    public final int l(db3 r1) {
        return 2;
    }
}
