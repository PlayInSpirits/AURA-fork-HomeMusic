package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.a;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rw implements t04 {
    public static final pa f = null;
    public static final qw g = null;
    public final Context a;
    public final ArrayList b;
    public final qw c;
    public final pa d;
    public final rm3 e;

    static {
        f = new pa(24);
        g = new qw(0);
    }

    public rw(Context r1, ArrayList r2, zs r3, qj0 r4) {
        this.a = r1.getApplicationContext();
        this.b = r2;
        this.d = f;
        this.e = new rm3(r3, r4, false);
        this.c = g;
    }

    public static int d(ci1 r5, int r6, int r7) {
        int r0 = Math.min(r5.g / r7, r5.f / r6);
        if (r0 != 0) goto L5;
        int r1 = 0;
    L6:
        int r2 = Math.max(1, r1);
        if (Log.isLoggable("BufferGifDecoder", 2) == false) goto L10;
        if (r2 <= 1) goto L10;
        StringBuilder r8 = b11.t("Downsampling GIF, sampleSize: ", ", target dimens: [", r2, r6, "x");
        r8.append(r7);
        r8.append("], actual dimens: [");
        r8.append(r5.f);
        r8.append("x");
        r8.append(r5.g);
        r8.append("]");
        Log.v("BufferGifDecoder", r8.toString());
    L10:
        return r2;
    L5:
        r1 = Integer.highestOneBit(r0);
        goto L6
    }

    @Override // defpackage.t04
    public final boolean a(Object r2, db3 r3) {
        ByteBuffer r4 = (ByteBuffer) r2;
        if (((Boolean) r3.c(ei1.b)).booleanValue() == false) goto L5;
        return false;
    L5:
        if (kb4.C(this.b, r4) != ImageHeaderParser$ImageType.GIF) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.t04
    public final q04 b(Object r8, int r9, int r10, db3 r11) {
        ByteBuffer r2 = (ByteBuffer) r8;
        qw r12 = this.c;
        monitor-enter(r12);
        di1 r0 = (di1) r12.a.poll();     // Catch: Throwable -> L8
        if (r0 != null) goto L7;
        r0 = new di1();     // Catch: Throwable -> L8
    L7:
        di1 r5 = r0;
        r5.b = null;     // Catch: Throwable -> L8
        Arrays.fill(r5.a, (byte) 0);     // Catch: Throwable -> L8
        r5.c = new ci1();     // Catch: Throwable -> L8
        r5.d = 0;     // Catch: Throwable -> L8
        ByteBuffer r1 = r2.asReadOnlyBuffer();     // Catch: Throwable -> L8
        r5.b = r1;     // Catch: Throwable -> L8
        r1.position(0);     // Catch: Throwable -> L8
        r5.b.order(ByteOrder.LITTLE_ENDIAN);     // Catch: Throwable -> L8
        monitor-exit(r12);
        wh1 r7 = c(r2, r9, r10, r5, r11);     // Catch: Throwable -> L16
        this.c.a(r5);
        return r7;
    L16:
        th = move-exception;
        this.c.a(r5);
        throw th;
    L8:
        th = move-exception;
        throw th;
    }

    public final wh1 c(ByteBuffer r15, int r16, int r17, di1 r18, db3 r19) {
        int r0 = ee2.b;
        long r3 = SystemClock.elapsedRealtimeNanos();
        ci1 r1 = r18.b();     // Catch: Throwable -> L12
        if (r1.c <= 0) goto L28;
        if (r1.b != 0) goto L28;
        if (r19.c(ei1.a) != vi0.o) goto L14;
        Bitmap.Config r6 = Bitmap.Config.RGB_565;     // Catch: Throwable -> L12
    L15:
        int r8 = d(r1, r16, r17);     // Catch: Throwable -> L12
        pa r9 = this.d;     // Catch: Throwable -> L12
        rm3 r10 = this.e;     // Catch: Throwable -> L12
        r9.getClass();     // Catch: Throwable -> L12
        vk4 r11 = new vk4(r10, r1, r15, r8);     // Catch: Throwable -> L12
        r11.c(r6);     // Catch: Throwable -> L12
        r11.k = (r11.k + 1) % r11.l.c;     // Catch: Throwable -> L12
        Bitmap r13 = r11.b();     // Catch: Throwable -> L12
        if (r13 == null) goto L18;
        wh1 r14 = new wh1(new vh1(new pd(2, new bi1(a.a(this.a), r11, r16, r17, r13))), 0);     // Catch: Throwable -> L12
        if (Log.isLoggable("BufferGifDecoder", 2) == false) goto L26;
        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + ee2.a(r3));
    L26:
        return r14;
    L18:
        if (Log.isLoggable("BufferGifDecoder", 2) == false) goto L30;
        StringBuilder r110 = new StringBuilder("Decoded GIF from stream in ");
    L20:
        r110.append(ee2.a(r3));
        Log.v("BufferGifDecoder", r110.toString());
        return null;
    L30:
        return null;
    L14:
        r6 = Bitmap.Config.ARGB_8888;     // Catch: Throwable -> L12
    L28:
        if (Log.isLoggable("BufferGifDecoder", 2) == false) goto L30;
        r110 = new StringBuilder("Decoded GIF from stream in ");
    L12:
        th = move-exception;
        if (Log.isLoggable("BufferGifDecoder", 2) == false) goto L37;
        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + ee2.a(r3));
        throw th;
    L37:
        throw th;
    }
}
